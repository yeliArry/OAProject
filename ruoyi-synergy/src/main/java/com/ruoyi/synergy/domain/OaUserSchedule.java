package com.ruoyi.synergy.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.entity.SysDept;
import com.ruoyi.common.core.domain.entity.SysUser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 排班对象 oa_user_schedule
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OaUserSchedule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 排班id */
    private Long scheduleId;

    /** 排班名称 */
    @Excel(name = "排班名称")
    private String scheduleName;

    /** 部门id */
    @Excel(name = "部门id")
    private Long deptId;
private SysDept dept;

    /** 审批状态 */
    @Excel(name = "审批状态")
    private Long approvalState;

    /** 创建人 */
    @Excel(name = "创建人")
    private Long userId;

    private SysUser sysUser;

    /** 7天值班人员 */
    @Excel(name = "7天值班人员")
    private Long shiftId;
    private OaDutyRoom oaDutyRoom;

    /** 附件 */
    @Excel(name = "附件")
    private String dAttachment;

    /** 备注 */
    @Excel(name = "备注")
    private String dComment;

    /** 删除标志 */
    private String delFlag;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;



//    @Override
//    public String toString() {
//        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
//            .append("deptId", getDeptId())
//            .append("createTime", getCreateTime())
//            .append("approvalState", getApprovalState())
//            .append("userId", getUserId())
//            .append("shiftId", getShiftId())
//            .append("delFlag", getDelFlag())
//            .append("createdBy", getCreatedBy())
//            .append("createdTime", getCreatedTime())
//            .append("updatedBy", getUpdatedBy())
//            .append("updatedTime", getUpdatedTime())
//            .toString();
//    }


    @Override
    public String toString() {
        return "OaUserSchedule{" +
                "sId=" + scheduleId +
                ", sName='" + scheduleName + '\'' +
                ", deptId=" + deptId +
                ", sysDept=" + dept +
                ", approvalState=" + approvalState +
                ", userId=" + userId +
                ", sysUser=" + sysUser +
                ", shiftId=" + shiftId +
                ", oaDutyRoom=" + oaDutyRoom +
                ", dAttachment='" + dAttachment + '\'' +
                ", dComment='" + dComment + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdTime=" + createdTime +
                ", updatedBy='" + updatedBy + '\'' +
                ", updatedTime=" + updatedTime +
                '}';
    }
}
