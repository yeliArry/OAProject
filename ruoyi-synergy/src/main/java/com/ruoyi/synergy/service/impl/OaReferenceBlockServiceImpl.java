package com.ruoyi.synergy.service.impl;

import java.util.List;

import com.ruoyi.synergy.domain.OaReferenceBlock;
import com.ruoyi.synergy.mapper.OaReferenceBlockMapper;
import com.ruoyi.synergy.service.IOaReferenceBlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 参试设备Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
@Service
public class OaReferenceBlockServiceImpl implements IOaReferenceBlockService
{
    @Autowired
    private OaReferenceBlockMapper oaReferenceBlockMapper;

    /**
     * 查询参试设备
     * 
     * @param blockId 参试设备主键
     * @return 参试设备
     */
    @Override
    public OaReferenceBlock selectOaReferenceBlockByBlockId(Long blockId)
    {
        return oaReferenceBlockMapper.selectOaReferenceBlockByBlockId(blockId);
    }

    /**
     * 查询参试设备列表
     * 
     * @param oaReferenceBlock 参试设备
     * @return 参试设备
     */
    @Override
    public List<OaReferenceBlock> selectOaReferenceBlockList(OaReferenceBlock oaReferenceBlock)
    {
        return oaReferenceBlockMapper.selectOaReferenceBlockList(oaReferenceBlock);
    }

    /**
     * 新增参试设备
     * 
     * @param oaReferenceBlock 参试设备
     * @return 结果
     */
    @Override
    public int insertOaReferenceBlock(OaReferenceBlock oaReferenceBlock)
    {
        return oaReferenceBlockMapper.insertOaReferenceBlock(oaReferenceBlock);
    }

    /**
     * 修改参试设备
     * 
     * @param oaReferenceBlock 参试设备
     * @return 结果
     */
    @Override
    public int updateOaReferenceBlock(OaReferenceBlock oaReferenceBlock)
    {
        return oaReferenceBlockMapper.updateOaReferenceBlock(oaReferenceBlock);
    }

    /**
     * 批量删除参试设备
     * 
     * @param blockIds 需要删除的参试设备主键
     * @return 结果
     */
    @Override
    public int deleteOaReferenceBlockByBlockIds(String blockIds)
    {
        return oaReferenceBlockMapper.deleteOaReferenceBlockByBlockIds(Convert.toStrArray(blockIds));
    }

    /**
     * 删除参试设备信息
     * 
     * @param blockId 参试设备主键
     * @return 结果
     */
    @Override
    public int deleteOaReferenceBlockByBlockId(Long blockId)
    {
        return oaReferenceBlockMapper.deleteOaReferenceBlockByBlockId(blockId);
    }
}
