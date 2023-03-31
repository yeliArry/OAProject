package com.ruoyi.synergy.mapper;

import com.ruoyi.synergy.domain.OaReferenceBlock;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 参试设备Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public interface OaReferenceBlockMapper 
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
    List<Map<String, Object>> selectOaReferenceBlockList(OaReferenceBlock oaReferenceBlock);

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
     * 删除参试设备
     * 
     * @param blockId 参试设备主键
     * @return 结果
     */
    public int deleteOaReferenceBlockByBlockId(Long blockId);

    /**
     * 批量删除参试设备
     * 
     * @param blockIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOaReferenceBlockByBlockIds(String[] blockIds);

    /**
     * 出库
     * @param blockId
     * @return
     */
    public int updateStorage(@Param("blockId") Long blockId,@Param("blockStatus") Long blockStatus);

}
