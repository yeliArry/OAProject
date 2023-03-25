package com.ruoyi.synergy.mapper;

import java.util.List;

import com.ruoyi.synergy.domain.OaUserSchedule;
import org.apache.ibatis.annotations.Mapper;

/**
 * 排班Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
@Mapper
public interface OaUserScheduleMapper 
{
    /**
     * 查询排班
     * 
     * @param sId 排班主键
     * @return 排班
     */
    public OaUserSchedule selectOaUserScheduleBySId(Long sId);

    /**
     * 查询排班列表
     * 
     * @param oaUserSchedule 排班
     * @return 排班集合
     */
    public List<OaUserSchedule> selectOaUserScheduleList(OaUserSchedule oaUserSchedule);

    /**
     * 新增排班
     * 
     * @param oaUserSchedule 排班
     * @return 结果
     */
    public int insertOaUserSchedule(OaUserSchedule oaUserSchedule);

    /**
     * 修改排班
     * 
     * @param oaUserSchedule 排班
     * @return 结果
     */
    public int updateOaUserSchedule(OaUserSchedule oaUserSchedule);

    /**
     * 删除排班
     * 
     * @param sId 排班主键
     * @return 结果
     */
    public int deleteOaUserScheduleBySId(Long sId);

    /**
     * 批量删除排班
     * 
     * @param sIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOaUserScheduleBySIds(String[] sIds);
}
