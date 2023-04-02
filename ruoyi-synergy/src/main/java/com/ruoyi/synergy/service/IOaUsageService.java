package com.ruoyi.synergy.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.synergy.domain.OaUsage;
import org.apache.ibatis.annotations.Param;

/**
 * 参试设备——我的使用Service接口
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
public interface IOaUsageService 
{
    /**
     * 查询参试设备——我的使用
     * 
     * @param usageId 参试设备——我的使用主键
     * @return 参试设备——我的使用
     */
    public OaUsage selectOaUsageByUsageId(Long usageId);

    /**
     * 查询参试设备——我的使用列表
     * 
     * @param blockName 参试设备——我的使用
     * @return 参试设备——我的使用集合
     */
    public List<Map<String, Object>> selectOaUsageList(String blockName, Integer usageState);
    List<Map<String,Object>> selctUsageLogList(String blockName,Integer usageState);

    /**
     * 新增参试设备——我的使用
     * 
     * @param oaUsage 参试设备——我的使用
     * @return 结果
     */
    public int insertOaUsage(OaUsage oaUsage);

    /**
     * 修改参试设备——我的使用
     * 
     * @param oaUsage 参试设备——我的使用
     * @return 结果
     */
    public int updateOaUsage(OaUsage oaUsage);

    /**
     * 批量删除参试设备——我的使用
     * 
     * @param usageIds 需要删除的参试设备——我的使用主键集合
     * @return 结果
     */
    public int deleteOaUsageByUsageIds(String usageIds);

    /**
     * 删除参试设备——我的使用信息
     * 
     * @param usageId 参试设备——我的使用主键
     * @return 结果
     */
    public int deleteOaUsageByUsageId(Long usageId);


    /**
     * 入库
     * @param blockStatus
     * @param blockStatus
     * @return
     */
    public int upStorage(Long blockId,Long blockStatus, Long usageState);
}
