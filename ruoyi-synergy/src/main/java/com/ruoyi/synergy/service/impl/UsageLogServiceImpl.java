package com.ruoyi.synergy.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.synergy.domain.OaUsage;
import com.ruoyi.synergy.service.UsageLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 参试设备——我的使用Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
@Service
public class UsageLogServiceImpl implements UsageLogService
{

    @Autowired
    private UsageLogService usageLogService;
    @Override
    public List<Map<String, Object>> selctUsageLogList(String blockName, Integer usageState) {
        return usageLogService.selctUsageLogList(blockName, usageState);
    }
}
