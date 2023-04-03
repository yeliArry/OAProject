package com.ruoyi.synergy.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.synergy.domain.OaUsage;
import com.ruoyi.synergy.mapper.OaUsageMapper;
import com.ruoyi.synergy.service.IOaUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 参试设备——使用记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
@Service
public class OaUsageServiceImpl implements IOaUsageService
{
    @Autowired
    private OaUsageMapper oaUsageMapper;

    /**
     * 查询参试设备——我的使用
     * 
     * @param usageId 参试设备——我的使用主键
     * @return 参试设备——我的使用
     */
    @Override
    public OaUsage selectOaUsageByUsageId(Long usageId)
    {
        return oaUsageMapper.selectOaUsageByUsageId(usageId);
    }

    /**
     * 查询参试设备——我的使用列表
     * 
     * @param blockName 参试设备——我的使用
     * @return 参试设备——我的使用
     */
    @Override
    public List<Map<String, Object>> selectOaUsageList(String blockName, Integer usageState)
    {
        return oaUsageMapper.selectOaUsageList(blockName, usageState);
    }

    @Override
    public List<Map<String, Object>> selctUsageLogList(String blockName, Integer usageState) {
        return oaUsageMapper.selctUsageLogList(blockName,usageState);
    }

    /**
     * 新增参试设备——我的使用
     * 
     * @param oaUsage 参试设备——我的使用
     * @return 结果
     */
    @Override
    public int insertOaUsage(OaUsage oaUsage)
    {
        return oaUsageMapper.insertOaUsage(oaUsage);
    }

    /**
     * 修改参试设备——我的使用
     * 
     * @param oaUsage 参试设备——我的使用
     * @return 结果
     */
    @Override
    public int updateOaUsage(OaUsage oaUsage)
    {
        return oaUsageMapper.updateOaUsage(oaUsage);
    }

    /**
     * 批量删除参试设备——我的使用
     * 
     * @param usageIds 需要删除的参试设备——我的使用主键
     * @return 结果
     */
    @Override
    public int deleteOaUsageByUsageIds(String usageIds)
    {
        return oaUsageMapper.deleteOaUsageByUsageIds(Convert.toStrArray(usageIds));
    }

    /**
     * 删除参试设备——我的使用信息
     * 
     * @param usageId 参试设备——我的使用主键
     * @return 结果
     */
    @Override
    public int deleteOaUsageByUsageId(Long usageId)
    {
        return oaUsageMapper.deleteOaUsageByUsageId(usageId);
    }


    @Override
    public int upStorage(Long blockId,Long blockStatus, Long usageState) {
        return oaUsageMapper.upStorage(blockId,blockStatus,usageState);
    }
}
