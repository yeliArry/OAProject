package com.ruoyi.web.controller.tledu;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.synergy.domain.OaDutyRoom;
import com.ruoyi.synergy.domain.OaUserDuty;
import com.ruoyi.synergy.domain.OaUserSchedule;
import com.ruoyi.synergy.service.IOaUserDutyService;
import com.ruoyi.synergy.service.IOaUserScheduleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 值班Controller
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
@Controller
@RequestMapping("/system/duty")
public class OaUserDutyController extends BaseController
{
    private String prefix = "system/duty";

    @Autowired
    private IOaUserDutyService oaUserDutyService;

    @Autowired
    private IOaUserScheduleService oaUserScheduleService;


    @RequiresPermissions("system:duty:view")
    @GetMapping()
    public String duty(Model model)
    {
        return prefix + "/duty";
    }

    /**
     * 查询值班列表
     */
    @RequiresPermissions("system:duty:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OaUserDuty oaUserDuty)
    {
        startPage();
        List<Map<String, Object>> list = oaUserDutyService.selectOaUserDutyList(oaUserDuty);
        return getDataTable(list);
    }

  /*  *//**
     * 导出值班列表
     *//*
    @RequiresPermissions("system:duty:export")
    @Log(title = "值班", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OaUserDuty oaUserDuty)
    {
        List<Map<String, Object> list = oaUserDutyService.selectOaUserDutyList(oaUserDuty);
        ExcelUtil<OaUserDuty> util = new ExcelUtil<OaUserDuty>(OaUserDuty.class);
        return util.exportExcel(list, "值班数据");
    }*/

    /**
     * 新增值班
     */
    @GetMapping("/add")
    public String add(Model model)
    {
        List<OaUserSchedule> oaUserSchedules=oaUserScheduleService.selectOaUserScheduleList(new OaUserSchedule());
        model.addAttribute("oaUserSchedules",oaUserSchedules);
        Date date = DateUtils.getNowDate();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String time=sdf.format(date);
        String loginName = ShiroUtils.getLoginName();
        model.addAttribute("loginName",loginName);
        model.addAttribute("time",time);

        return prefix + "/add";
    }

    /**
     * 新增保存值班
     */
    @RequiresPermissions("system:duty:add")
    @Log(title = "值班", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OaUserDuty oaUserDuty)
    {
        return toAjax(oaUserDutyService.insertOaUserDuty(oaUserDuty));
    }

    /**
     * 修改值班
     */
    @RequiresPermissions("system:duty:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long dId, ModelMap mmap)
    {
        System.out.println(dId);
        OaUserDuty oaUserDuty = oaUserDutyService.selectOaUserDutyByDId(dId);
        mmap.put("oaUserDuty", oaUserDuty);
        List<OaUserSchedule> oaUserSchedules=oaUserScheduleService.selectOaUserScheduleList(new OaUserSchedule());
        mmap.addAttribute("oaUserSchedules",oaUserSchedules);
        return prefix + "/edit";
    }
    @RequiresPermissions("system:duty:edit")
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long dId, ModelMap mmap)
    {
        System.out.println(dId);
        OaUserDuty oaUserDuty = oaUserDutyService.selectOaUserDutyByDId(dId);
        mmap.put("oaUserDuty", oaUserDuty);
        List<OaUserSchedule> oaUserSchedules=oaUserScheduleService.selectOaUserScheduleList(new OaUserSchedule());
        mmap.addAttribute("oaUserSchedules",oaUserSchedules);
        return prefix + "/detail";
    }

    /**
     * 修改保存值班
     */
    @RequiresPermissions("system:duty:edit")
    @Log(title = "值班", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OaUserDuty oaUserDuty)
    {

        return toAjax(oaUserDutyService.updateOaUserDuty(oaUserDuty));
    }

    /**
     * 删除值班
     */
    @RequiresPermissions("system:duty:remove")
    @Log(title = "值班", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(oaUserDutyService.deleteOaUserDutyByDIds(ids));
    }
}
