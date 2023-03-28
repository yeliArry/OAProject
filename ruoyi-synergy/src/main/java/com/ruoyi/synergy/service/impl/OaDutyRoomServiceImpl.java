package com.ruoyi.synergy.service.impl;

import com.ruoyi.synergy.domain.OaDutyRoom;
import com.ruoyi.synergy.mapper.OaDutyRoomMapper;
import com.ruoyi.synergy.service.OaDutyRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OaDutyRoomServiceImpl implements OaDutyRoomService {
    @Autowired
    private OaDutyRoomMapper oaDutyRoomMapper;

    @Override
    public List<OaDutyRoom> query(OaDutyRoom oaDutyRoom) {
        return oaDutyRoomMapper.query(oaDutyRoom);
    }

    @Override
    public void add(OaDutyRoom oaDutyRoom) {
        oaDutyRoomMapper.add(oaDutyRoom);
    }
}
