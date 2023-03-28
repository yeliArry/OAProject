package com.ruoyi.synergy.service;

import java.util.List;

import com.ruoyi.synergy.domain.OaUserSchedule;

/**
 * 排班Service接口
 * 
 * @author ruoyi
 * @date 2023-03-28
 */
public interface IOaUserScheduleService 
{
    /**
     * 查询排班
     * 
     * @param scheduleId 排班主键
     * @return 排班
     */
    public OaUserSchedule selectOaUserScheduleBySId(Long scheduleId);

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
     * 批量删除排班
     * 
     * @param scheduleIds 需要删除的排班主键集合
     * @return 结果
     */
    public int deleteOaUserScheduleBySIds(String scheduleIds);

    /**
     * 删除排班信息
     * 
     * @param scheduleId 排班主键
     * @return 结果
     */
    public int deleteOaUserScheduleBySId(Long scheduleId);
}
