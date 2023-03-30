package com.ruoyi.synergy.mapper;

import com.ruoyi.synergy.domain.OaDutyRoom;
import com.ruoyi.synergy.domain.OaUserSchedule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 排班Mapper接口
 * 
 * @author ruoyi
 * @date 2023-03-28
 */
public interface OaUserScheduleMapper 
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
     * 删除排班
     * 
     * @param scheduleId 排班主键
     * @return 结果
     */
    public int deleteOaUserScheduleBysId(@Param("scheduleId") Long scheduleId);

    /**
     * 批量删除排班
     * 
     * @param scheduleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOaUserScheduleBysIds(String[] scheduleIds);

    /**
     * 批量删除排班中间
     * 
     * @param scheduleIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOaDutyRoomByShiftIds(String[] scheduleIds);
    
    /**
     * 批量新增排班中间
     * 
     * @param oaDutyRoomList 排班中间列表
     * @return 结果
     */
    public int batchOaDutyRoom(List<OaDutyRoom> oaDutyRoomList);
    

    /**
     * 通过排班主键删除排班中间信息
     * 
     * @param scheduleId 排班ID
     * @return 结果
     */
    public int deleteOaDutyRoomByShiftId(@Param("scheduleId") Long scheduleId);

}
