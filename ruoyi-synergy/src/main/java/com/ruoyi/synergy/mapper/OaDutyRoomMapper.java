package com.ruoyi.synergy.mapper;

import com.ruoyi.synergy.domain.OaDutyRoom;

import java.util.List;

public interface OaDutyRoomMapper {
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
