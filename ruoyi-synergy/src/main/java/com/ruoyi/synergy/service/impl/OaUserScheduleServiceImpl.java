package com.ruoyi.synergy.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.synergy.domain.OaUserSchedule;
import com.ruoyi.synergy.mapper.OaUserScheduleMapper;
import com.ruoyi.synergy.service.IOaUserScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 排班Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
@Service
public class OaUserScheduleServiceImpl implements IOaUserScheduleService
{
    @Autowired
    private OaUserScheduleMapper oaUserScheduleMapper;

    /**
     * 查询排班
     * 
     * @param sId 排班主键
     * @return 排班
     */
    @Override
    public OaUserSchedule selectOaUserScheduleBySId(Long sId)
    {
        return oaUserScheduleMapper.selectOaUserScheduleBySId(sId);
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
    @Override
    public int insertOaUserSchedule(OaUserSchedule oaUserSchedule)
    {
        oaUserSchedule.setCreateTime(DateUtils.getNowDate());

        return oaUserScheduleMapper.insertOaUserSchedule(oaUserSchedule);
    }

    /**
     * 修改排班
     * 
     * @param oaUserSchedule 排班
     * @return 结果
     */
    @Override
    public int updateOaUserSchedule(OaUserSchedule oaUserSchedule)
    {
        return oaUserScheduleMapper.updateOaUserSchedule(oaUserSchedule);
    }

    /**
     * 批量删除排班
     * 
     * @param sIds 需要删除的排班主键
     * @return 结果
     */
    @Override
    public int deleteOaUserScheduleBySIds(String sIds)
    {
        return oaUserScheduleMapper.deleteOaUserScheduleBySIds(Convert.toStrArray(sIds));
    }

    /**
     * 删除排班信息
     * 
     * @param sId 排班主键
     * @return 结果
     */
    @Override
    public int deleteOaUserScheduleBySId(Long sId)
    {
        return oaUserScheduleMapper.deleteOaUserScheduleBySId(sId);
    }

    @Override
    public List<OaUserSchedule> query(OaUserSchedule oaUserSchedule) {
        return oaUserScheduleMapper.query(oaUserSchedule);
    }
}
