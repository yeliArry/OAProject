package com.ruoyi.synergy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OaDutyRoom {

  private long shiftId;
  private java.sql.Timestamp shiftDate;
  private long userId;
  private long delFlag;
  private long createdBy;
  private java.sql.Timestamp createdTime;
  private long updatedBy;
  private java.sql.Timestamp updatedTime;

}
