package com.ruoyi.synergy.mapper;

import com.ruoyi.synergy.domain.OaUsage;
import com.ruoyi.synergy.domain.UsageLog;
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

    List<UsageLog> selctUsageLogList(@Param("blockName") String blockName,
                                     @Param("usageState") Integer usageState);


    /**
     * 删除参试设备——我的使用
     *
     * @param usageId 参试设备——我的使用主键
     * @return 结果
     */
    public int deleteOaUsageByUsageId(Long usageId);

    /**
     * 批量删除参试设备——我的使用
     *
     * @param usageIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOaUsageByUsageIds(String[] usageIds);

}
