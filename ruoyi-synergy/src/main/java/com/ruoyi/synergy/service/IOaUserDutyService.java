package com.ruoyi.synergy.service;

import com.ruoyi.synergy.domain.OaUserDuty;

import java.util.List;


/**
 * 值班Service接口
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
public interface IOaUserDutyService 
{
    /**
     * 查询值班
     * 
     * @param dId 值班主键
     * @return 值班
     */
    public OaUserDuty selectOaUserDutyByDId(Long dId);

    /**
     * 查询值班列表
     * 
     * @param oaUserDuty 值班
     * @return 值班集合
     */
    public List<OaUserDuty> selectOaUserDutyList(OaUserDuty oaUserDuty);

    /**
     * 新增值班
     * 
     * @param oaUserDuty 值班
     * @return 结果
     */
    public int insertOaUserDuty(OaUserDuty oaUserDuty);

    /**
     * 修改值班
     * 
     * @param oaUserDuty 值班
     * @return 结果
     */
    public int updateOaUserDuty(OaUserDuty oaUserDuty);

    /**
     * 批量删除值班
     * 
     * @param dIds 需要删除的值班主键集合
     * @return 结果
     */
    public int deleteOaUserDutyByDIds(String dIds);

    /**
     * 删除值班信息
     * 
     * @param dId 值班主键
     * @return 结果
     */
    public int deleteOaUserDutyByDId(Long dId);
}
