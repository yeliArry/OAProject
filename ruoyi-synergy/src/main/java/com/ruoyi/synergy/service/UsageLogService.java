package com.ruoyi.synergy.service;

import com.ruoyi.synergy.domain.OaUsage;

import java.util.List;
import java.util.Map;

/**
 * 参试设备——我的使用Service接口
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
public interface UsageLogService
{
    List<Map<String,Object>> selctUsageLogList(String blockName,Integer usageState);

}
