package com.ruoyi.synergy.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.synergy.domain.OaUserDuty;


/**
 * 值班Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
public interface OaUserDutyMapper 
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
    //public List<OaUserDuty> selectOaUserDutyList(OaUserDuty oaUserDuty);
    public List<Map<String, Object>> selectOaUserDutyList(OaUserDuty oaUserDuty);

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
     * 删除值班
     * 
     * @param dId 值班主键
     * @return 结果
     */
    public int deleteOaUserDutyByDId(Long dId);

    /**
     * 批量删除值班
     * 
     * @param dIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOaUserDutyByDIds(String[] dIds);
}
