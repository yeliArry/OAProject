package com.ruoyi.synergy.service;

import com.ruoyi.synergy.domain.OaReferenceBlock;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 参试设备Service接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface IOaReferenceBlockService 
{
    /**
     * 查询参试设备
     * 
     * @param blockId 参试设备主键
     * @return 参试设备
     */
    public OaReferenceBlock selectOaReferenceBlockByBlockId(Long blockId);

    /**
     * 查询参试设备列表
     * 
     * @param oaReferenceBlock 参试设备
     * @return 参试设备集合
     */
    public List<Map<String, Object>> selectOaReferenceBlockList(OaReferenceBlock oaReferenceBlock);

    /**
     * 新增参试设备
     * 
     * @param oaReferenceBlock 参试设备
     * @return 结果
     */
    public int insertOaReferenceBlock(OaReferenceBlock oaReferenceBlock);

    /**
     * 修改参试设备
     * 
     * @param oaReferenceBlock 参试设备
     * @return 结果
     */
    public int updateOaReferenceBlock(OaReferenceBlock oaReferenceBlock);

    /**
     * 批量删除参试设备
     * 
     * @param blockIds 需要删除的参试设备主键集合
     * @return 结果
     */
    public int deleteOaReferenceBlockByBlockIds(String blockIds);

    /**
     * 删除参试设备信息
     * 
     * @param blockId 参试设备主键
     * @return 结果
     */
    public int deleteOaReferenceBlockByBlockId(Long blockId);

    /**
     * 出库修改状态
     * @param blockId
     * @return
     */
    public int updateStorage(Long blockId,Long blockStatus);


}
