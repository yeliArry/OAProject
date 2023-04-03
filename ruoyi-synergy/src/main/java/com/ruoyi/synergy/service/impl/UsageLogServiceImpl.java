package com.ruoyi.synergy.service.impl;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.synergy.domain.OaUsage;
import com.ruoyi.synergy.domain.UsageLog;
import com.ruoyi.synergy.mapper.UsageLogMapper;
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
    private UsageLogMapper usageLogMapper;
    @Override
    public List<UsageLog> selctUsageLogList(String blockName, Integer usageState) {
        return usageLogMapper.selctUsageLogList(blockName, usageState);
    }

    @Override
    public int deleteOaUsageByUsageId(Long usageId) {
        return usageLogMapper.deleteOaUsageByUsageId(usageId);
    }

    @Override
    public int deleteOaUsageByUsageIds(String[] usageIds) {
        return usageLogMapper.deleteOaUsageByUsageIds(usageIds);
    }
}
