package com.ruoyi.synergy.mapper;

import com.ruoyi.synergy.domain.OaUsage;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 参试设备——我的使用Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
public interface UsageLogMapper
{

    List<Map<String,Object>> selctUsageLogList(@Param("blockName") String blockName,
                                               @Param("usageState") Integer usageState);


}
