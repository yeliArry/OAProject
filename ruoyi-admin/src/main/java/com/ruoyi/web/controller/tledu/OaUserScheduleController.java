package com.ruoyi.web.controller.tledu;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.synergy.domain.OaUserSchedule;
import com.ruoyi.synergy.service.IOaUserScheduleService;
import com.ruoyi.system.service.ISysUserService;
import org.apache.shiro.SecurityUtils;
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
 * 排班Controller
 * 
 * @author ruoyi
 * @date 2023-03-28
 */
@Controller
@RequestMapping("/system/schedule")
public class OaUserScheduleController extends BaseController
{
    private String prefix = "system/schedule";

    @Autowired
    private IOaUserScheduleService oaUserScheduleService;
    @Autowired
    private ISysUserService userService;


    @RequiresPermissions("system:schedule:view")
    @GetMapping()
    public String schedule()
    {
        return prefix + "/schedule";
    }

    /**
     * 查询排班列表
     */
    @RequiresPermissions("system:schedule:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OaUserSchedule oaUserSchedule)
    {
        startPage();
        List<OaUserSchedule> list = oaUserScheduleService.selectOaUserScheduleList(oaUserSchedule);
        return getDataTable(list);
    }

    /**
     * 导出排班列表
     */
    @RequiresPermissions("system:schedule:export")
    @Log(title = "排班", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OaUserSchedule oaUserSchedule)
    {
        List<OaUserSchedule> list = oaUserScheduleService.selectOaUserScheduleList(oaUserSchedule);
        ExcelUtil<OaUserSchedule> util = new ExcelUtil<OaUserSchedule>(OaUserSchedule.class);
        return util.exportExcel(list, "排班数据");
    }

    /**
     * 新增排班
     */
    @GetMapping("/add")
    public String add(Model model)
    {
        List<SysUser> list = userService.selectUserList(new SysUser());
        model.addAttribute("list",list);
        String loginName = ShiroUtils.getLoginName();
        SysUser user = (SysUser) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("user",user);
        model.addAttribute("loginName",loginName);
        return prefix + "/add";
    }

    /**
     * 新增保存排班
     */
    @RequiresPermissions("system:schedule:add")
    @Log(title = "排班", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OaUserSchedule oaUserSchedule)
    {
        oaUserSchedule.setUserId(ShiroUtils.getUserId());
        System.out.println(oaUserSchedule.getScheduleName()+"==============================================================");
        return toAjax(oaUserScheduleService.insertOaUserSchedule(oaUserSchedule));
    }

    /**
     * 修改排班
     */
    @RequiresPermissions("system:schedule:edit")
    @GetMapping("/edit/{scheduleId}")
    public String edit(@PathVariable("scheduleId") Long scheduleId, ModelMap mmap)
    {
        OaUserSchedule oaUserSchedule = oaUserScheduleService.selectOaUserScheduleBySId(scheduleId);
        mmap.put("oaUserSchedule", oaUserSchedule);
        return prefix + "/edit";
    }

    /**
     * 修改保存排班
     */
    @RequiresPermissions("system:schedule:edit")
    @Log(title = "排班", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OaUserSchedule oaUserSchedule)
    {
        return toAjax(oaUserScheduleService.updateOaUserSchedule(oaUserSchedule));
    }

    /**
     * 删除排班
     */
    @RequiresPermissions("system:schedule:remove")
    @Log(title = "排班", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        System.out.println(ids+"============================================");
        return toAjax(oaUserScheduleService.deleteOaUserScheduleBySIds(ids));
    }
}
