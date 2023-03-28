package com.ruoyi.synergy.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.synergy.domain.OaDutyRoom;
import com.ruoyi.synergy.domain.OaUserSchedule;
import com.ruoyi.synergy.mapper.OaUserScheduleMapper;
import com.ruoyi.synergy.service.IOaUserScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.common.core.text.Convert;

/**
 * 排班Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-28
 */
@Service
public class OaUserScheduleServiceImpl implements IOaUserScheduleService
{
    @Autowired
    private OaUserScheduleMapper oaUserScheduleMapper;

    /**
     * 查询排班
     * 
     * @param scheduleId 排班主键
     * @return 排班
     */
    @Override
    public OaUserSchedule selectOaUserScheduleBySId(Long scheduleId)
    {
        return oaUserScheduleMapper.selectOaUserScheduleBysId(scheduleId);
    }

    /**
     * 查询排班列表
     * 
     * @param oaUserSchedule 排班
     * @return 排班
     */
    @Override
    public List<OaUserSchedule> selectOaUserScheduleList(OaUserSchedule oaUserSchedule)
    {
        return oaUserScheduleMapper.selectOaUserScheduleList(oaUserSchedule);
    }

    /**
     * 新增排班
     * 
     * @param oaUserSchedule 排班
     * @return 结果
     */
    @Transactional
    @Override
    public int insertOaUserSchedule(OaUserSchedule oaUserSchedule)
    {
        oaUserSchedule.setCreateTime(DateUtils.getNowDate());
        int rows = oaUserScheduleMapper.insertOaUserSchedule(oaUserSchedule);
        insertOaDutyRoom(oaUserSchedule);
        return rows;
    }

    /**
     * 修改排班
     * 
     * @param oaUserSchedule 排班
     * @return 结果
     */
    @Transactional
    @Override
    public int updateOaUserSchedule(OaUserSchedule oaUserSchedule)
    {
        oaUserScheduleMapper.deleteOaDutyRoomByShiftId(oaUserSchedule.getScheduleId());
        insertOaDutyRoom(oaUserSchedule);
        return oaUserScheduleMapper.updateOaUserSchedule(oaUserSchedule);
    }

    /**
     * 批量删除排班
     * 
     * @param scheduleIds 需要删除的排班主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteOaUserScheduleBySIds(String scheduleIds)
    {
        oaUserScheduleMapper.deleteOaDutyRoomByShiftIds(Convert.toStrArray(scheduleIds));
        return oaUserScheduleMapper.deleteOaUserScheduleBysIds(Convert.toStrArray(scheduleIds));
    }

    /**
     * 删除排班信息
     * 
     * @param scheduleId 排班主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteOaUserScheduleBySId(Long scheduleId)
    {
        oaUserScheduleMapper.deleteOaDutyRoomByShiftId(scheduleId);
        return oaUserScheduleMapper.deleteOaUserScheduleBysId(scheduleId);
    }

    /**
     * 新增排班中间信息
     * 
     * @param oaUserSchedule 排班对象
     */
    public void insertOaDutyRoom(OaUserSchedule oaUserSchedule)
    {
        List<OaDutyRoom> oaDutyRoomList = oaUserSchedule.getOaDutyRoomList();
        Long sId = oaUserSchedule.getScheduleId();
        if (StringUtils.isNotNull(oaDutyRoomList))
        {
            List<OaDutyRoom> list = new ArrayList<OaDutyRoom>();
            for (OaDutyRoom oaDutyRoom : oaDutyRoomList)
            {
                oaDutyRoom.setShiftId(sId);
                list.add(oaDutyRoom);
            }
            if (list.size() > 0)
            {
                oaUserScheduleMapper.batchOaDutyRoom(list);
            }
        }
    }
}
