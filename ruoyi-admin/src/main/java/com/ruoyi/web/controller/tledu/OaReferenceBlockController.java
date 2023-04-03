package com.ruoyi.web.controller.tledu;

import java.util.List;
import java.util.Map;

import com.ruoyi.common.core.domain.entity.SysDept;
import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.synergy.domain.OaReferenceBlock;
import com.ruoyi.synergy.service.IOaReferenceBlockService;
import com.ruoyi.system.service.ISysDeptService;
import com.ruoyi.system.service.ISysUserService;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 参试设备Controller
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Controller
@RequestMapping("/system/block")
public class OaReferenceBlockController extends BaseController
{
    private String prefix = "system/block";

    @Autowired
    private IOaReferenceBlockService oaReferenceBlockService;

    @Autowired
    private ISysDeptService ISysDeptService;

    @Autowired
    private ISysUserService userService;

    @RequiresPermissions("system:block:view")
    @GetMapping()
    public String block()
    {
        return prefix + "/block";
    }

    /**
     * 查询参试设备列表
     */
    @RequiresPermissions("system:block:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OaReferenceBlock oaReferenceBlock)
    {
        startPage();
        List<Map<String, Object>> list = oaReferenceBlockService.selectOaReferenceBlockList(oaReferenceBlock);
        return getDataTable(list);
    }

//    /**
//     * 导出参试设备列表
//     */
//    @RequiresPermissions("system:block:export")
//    @Log(title = "参试设备", businessType = BusinessType.EXPORT)
//    @PostMapping("/export")
//    @ResponseBody
//    public AjaxResult export(OaReferenceBlock oaReferenceBlock)
//    {
//        List<Map<String, Object>> list = oaReferenceBlockService.selectOaReferenceBlockList(oaReferenceBlock);
//        ExcelUtil<OaReferenceBlock> util = new ExcelUtil<OaReferenceBlock>(OaReferenceBlock.class);
//        return util.exportExcel(list, "参试设备数据");
//    }

    /**
     * 新增参试设备
     */
    @GetMapping("/add")
    public String add(Model model)
    {

        String loginName = ShiroUtils.getLoginName();

        model.addAttribute("loginName",loginName);

        List<SysDept> sysDepts = ISysDeptService.selectDeptList(new SysDept());

        model.addAttribute("sysDepts",sysDepts);
        return prefix + "/add";
    }

    /**
     * 新增保存参试设备
     */
    @RequiresPermissions("system:block:add")
    @Log(title = "参试设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OaReferenceBlock oaReferenceBlock)
    {
        return toAjax(oaReferenceBlockService.insertOaReferenceBlock(oaReferenceBlock));
    }

    /**
     * 修改参试设备
     */
    @RequiresPermissions("system:block:edit")
    @GetMapping("/edit/{blockId}")
    public String edit(@PathVariable("blockId") Long blockId, ModelMap mmap)
    {
        OaReferenceBlock oaReferenceBlock = oaReferenceBlockService.selectOaReferenceBlockByBlockId(blockId);
        mmap.put("oaReferenceBlock", oaReferenceBlock);

        SysUser user = (SysUser) SecurityUtils.getSubject().getPrincipal();
        mmap.addAttribute("user",user);
        return prefix + "/edit";
    }

    /**
     * 修改保存参试设备
     */
    @RequiresPermissions("system:block:edit")
    @Log(title = "参试设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OaReferenceBlock oaReferenceBlock)
    {
        return toAjax(oaReferenceBlockService.updateOaReferenceBlock(oaReferenceBlock));
    }

    /**
     * 删除参试设备
     */
    @RequiresPermissions("system:block:remove")
    @Log(title = "参试设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {

        return toAjax(oaReferenceBlockService.deleteOaReferenceBlockByBlockIds(ids));
    }

    @RequiresPermissions("system:block:Storage")
    @GetMapping( "/Storage/{blockId}/{blockStatus}")
    @ResponseBody
    public AjaxResult updateStorage(@PathVariable("blockId") Long blockId,
                                    @PathVariable("blockStatus") Long blockStatus){

        return toAjax(oaReferenceBlockService.updateStorage(blockId,blockStatus));
    }
}
