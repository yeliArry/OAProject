package com.ruoyi.synergy.service;

import com.ruoyi.synergy.domain.OaDutyRoom;

import java.util.List;

public interface OaDutyRoomService {
    /**
     * 查询所有的中间表数据
     * @param oaDutyRoom
     * @return
     */
    List<OaDutyRoom> query(OaDutyRoom oaDutyRoom);

    /**
     * 新增中间表数据
     * @param oaDutyRoom
     */
    void add(OaDutyRoom oaDutyRoom);
}
