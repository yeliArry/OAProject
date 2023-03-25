package com.ruoyi.web.controller.tledu;

import java.util.List;

import com.ruoyi.synergy.domain.OaUserDuty;
import com.ruoyi.synergy.service.IOaUserDutyService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @RequiresPermissions("system:duty:view")
    @GetMapping()
    public String duty()
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
        List<OaUserDuty> list = oaUserDutyService.selectOaUserDutyList(oaUserDuty);
        return getDataTable(list);
    }

    /**
     * 导出值班列表
     */
    @RequiresPermissions("system:duty:export")
    @Log(title = "值班", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OaUserDuty oaUserDuty)
    {
        List<OaUserDuty> list = oaUserDutyService.selectOaUserDutyList(oaUserDuty);
        ExcelUtil<OaUserDuty> util = new ExcelUtil<OaUserDuty>(OaUserDuty.class);
        return util.exportExcel(list, "值班数据");
    }

    /**
     * 新增值班
     */
    @GetMapping("/add")
    public String add()
    {
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
    @GetMapping("/edit/{dId}")
    public String edit(@PathVariable("dId") Long dId, ModelMap mmap)
    {
        OaUserDuty oaUserDuty = oaUserDutyService.selectOaUserDutyByDId(dId);
        mmap.put("oaUserDuty", oaUserDuty);
        return prefix + "/edit";
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
