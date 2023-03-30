package com.ruoyi.synergy.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.synergy.domain.OaUserDuty;
import com.ruoyi.synergy.domain.OaUserSchedule;
import com.ruoyi.synergy.mapper.OaUserDutyMapper;
import com.ruoyi.synergy.mapper.OaUserScheduleMapper;
import com.ruoyi.synergy.service.IOaUserDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

/**
 * 值班Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
@Service
public class OaUserDutyServiceImpl implements IOaUserDutyService
{
    @Autowired
    private OaUserDutyMapper oaUserDutyMapper;


    /**
     * 查询值班
     * 
     * @param dId 值班主键
     * @return 值班
     */
    @Override
    public OaUserDuty selectOaUserDutyByDId(Long dId)
    {
        return oaUserDutyMapper.selectOaUserDutyByDId(dId);
    }

    /**
     * 查询值班列表
     * 
     * @param oaUserDuty 值班
     * @return 值班
     */
    @Override
    //public List<OaUserDuty> selectOaUserDutyList(OaUserDuty oaUserDuty)
    public List<Map<String, Object>> selectOaUserDutyList(OaUserDuty oaUserDuty)
    {
        return oaUserDutyMapper.selectOaUserDutyList(oaUserDuty);
    }

    /**
     * 新增值班
     * 
     * @param oaUserDuty 值班
     * @return 结果
     */
    @Override
    public int insertOaUserDuty(OaUserDuty oaUserDuty)
    {
        return oaUserDutyMapper.insertOaUserDuty(oaUserDuty);
    }

    /**
     * 修改值班
     * 
     * @param oaUserDuty 值班
     * @return 结果
     */
    @Override
    public int updateOaUserDuty(OaUserDuty oaUserDuty)
    {

        return oaUserDutyMapper.updateOaUserDuty(oaUserDuty);
    }

    /**
     * 批量删除值班
     * 
     * @param dIds 需要删除的值班主键
     * @return 结果
     */
    @Override
    public int deleteOaUserDutyByDIds(String dIds)
    {
        return oaUserDutyMapper.deleteOaUserDutyByDIds(Convert.toStrArray(dIds));
    }

    /**
     * 删除值班信息
     * 
     * @param dId 值班主键
     * @return 结果
     */
    @Override
    public int deleteOaUserDutyByDId(Long dId)
    {
        return oaUserDutyMapper.deleteOaUserDutyByDId(dId);
    }
}
