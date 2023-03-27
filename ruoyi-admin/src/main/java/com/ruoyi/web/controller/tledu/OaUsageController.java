package com.ruoyi.web.controller.tledu;

import java.util.List;

import com.ruoyi.synergy.domain.OaUsage;
import com.ruoyi.synergy.service.IOaUsageService;
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
 * 参试设备——我的使用Controller
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
@Controller
@RequestMapping("/system/usage")
public class OaUsageController extends BaseController
{
    private String prefix = "system/usage";

    @Autowired
    private IOaUsageService oaUsageService;

    @RequiresPermissions("system:usage:view")
    @GetMapping()
    public String usage()
    {
        return prefix + "/usage";
    }

    /**
     * 查询参试设备——我的使用列表
     */
    @RequiresPermissions("system:usage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OaUsage oaUsage)
    {
        startPage();
        List<OaUsage> list = oaUsageService.selectOaUsageList(oaUsage);
        return getDataTable(list);
    }

    /**
     * 导出参试设备——我的使用列表
     */
    @RequiresPermissions("system:usage:export")
    @Log(title = "参试设备——我的使用", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OaUsage oaUsage)
    {
        List<OaUsage> list = oaUsageService.selectOaUsageList(oaUsage);
        ExcelUtil<OaUsage> util = new ExcelUtil<OaUsage>(OaUsage.class);
        return util.exportExcel(list, "参试设备——我的使用数据");
    }

    /**
     * 新增参试设备——我的使用
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存参试设备——我的使用
     */
    @RequiresPermissions("system:usage:add")
    @Log(title = "参试设备——我的使用", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OaUsage oaUsage)
    {
        return toAjax(oaUsageService.insertOaUsage(oaUsage));
    }

    /**
     * 修改参试设备——我的使用
     */
    @RequiresPermissions("system:usage:edit")
    @GetMapping("/edit/{usageId}")
    public String edit(@PathVariable("usageId") Long usageId, ModelMap mmap)
    {
        OaUsage oaUsage = oaUsageService.selectOaUsageByUsageId(usageId);
        mmap.put("oaUsage", oaUsage);
        return prefix + "/edit";
    }

    /**
     * 修改保存参试设备——我的使用
     */
    @RequiresPermissions("system:usage:edit")
    @Log(title = "参试设备——我的使用", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OaUsage oaUsage)
    {
        return toAjax(oaUsageService.updateOaUsage(oaUsage));
    }

    /**
     * 删除参试设备——我的使用
     */
    @RequiresPermissions("system:usage:remove")
    @Log(title = "参试设备——我的使用", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(oaUsageService.deleteOaUsageByUsageIds(ids));
    }
}