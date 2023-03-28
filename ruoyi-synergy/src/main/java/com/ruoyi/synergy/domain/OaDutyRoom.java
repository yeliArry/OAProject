package com.ruoyi.synergy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OaDutyRoom {

  private Long shiftId;
  private java.sql.Timestamp shiftDate;
  private Long userId;
  private Long delFlag;
  private Long createdBy;
  private java.sql.Timestamp createdTime;
  private Long updatedBy;
  private java.sql.Timestamp updatedTime;

}
