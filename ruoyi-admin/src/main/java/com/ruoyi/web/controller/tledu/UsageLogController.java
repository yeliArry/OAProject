package com.ruoyi.web.controller.tledu;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.synergy.domain.OaUsage;
import com.ruoyi.synergy.domain.UsageLog;
import com.ruoyi.synergy.service.IOaUsageService;
import com.ruoyi.synergy.service.UsageLogService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 参试设备——我的使用Controller
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
@Controller
@RequestMapping("/system/usageLog")
public class UsageLogController extends BaseController
{
    private String prefix = "system/usageLog";

    @Autowired
    private UsageLogService usageLogService;

    @RequiresPermissions("system:usageLog:view")
    @GetMapping()
    public String usage()
    {
        System.out.println("~~~~~~~~~~~~~~~~");
        return prefix + "/usagelog";
    }

    /**
     * 查询参试设备——我的使用列表
     */
    @RequiresPermissions("system:usageLog:list")
    @PostMapping("/Loyalist")
    @ResponseBody
    public TableDataInfo list(@RequestParam(value = "ou_blockName", required = false) String blockName,
                              @RequestParam(value = "ou_usageState", required = false) Integer usageState)
    {
        startPage();
        List<UsageLog> list = usageLogService.selctUsageLogList(blockName, usageState);
        return getDataTable(list);
    }
    /**
     * 删除参试设备
     */
    @RequiresPermissions("system:block:remove")
    @Log(title = "参试设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String[] ids)
    {

        return toAjax(usageLogService.deleteOaUsageByUsageIds(ids));
    }
}
