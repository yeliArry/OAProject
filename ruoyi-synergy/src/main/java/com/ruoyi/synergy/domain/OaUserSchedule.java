package com.ruoyi.synergy.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
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
public class OaUserSchedule extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 排班id */
    private Long sId;

    /** 排班名称 */
    @Excel(name = "排班名称")
    private String sName;

    /** 部门id */
    @Excel(name = "部门id")
    private Long deptId;

    /** 审批状态 */
    @Excel(name = "审批状态")
    private Long approvalState;

    /** 创建人 */
    @Excel(name = "创建人")
    private Long userId;

    /** 7天值班人员 */
    @Excel(name = "7天值班人员")
    private Long shiftId;

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

    public void setsId(Long sId) 
    {
        this.sId = sId;
    }

    public Long getsId() 
    {
        return sId;
    }
    public void setsName(String sName) 
    {
        this.sName = sName;
    }

    public String getsName() 
    {
        return sName;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setApprovalState(Long approvalState) 
    {
        this.approvalState = approvalState;
    }

    public Long getApprovalState() 
    {
        return approvalState;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setShiftId(Long shiftId) 
    {
        this.shiftId = shiftId;
    }

    public Long getShiftId() 
    {
        return shiftId;
    }
    public void setdAttachment(String dAttachment) 
    {
        this.dAttachment = dAttachment;
    }

    public String getdAttachment() 
    {
        return dAttachment;
    }
    public void setdComment(String dComment) 
    {
        this.dComment = dComment;
    }

    public String getdComment() 
    {
        return dComment;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setCreatedBy(String createdBy) 
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() 
    {
        return createdBy;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setUpdatedBy(String updatedBy) 
    {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy() 
    {
        return updatedBy;
    }
    public void setUpdatedTime(Date updatedTime) 
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime() 
    {
        return updatedTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sId", getsId())
            .append("sName", getsName())
            .append("deptId", getDeptId())
            .append("createTime", getCreateTime())
            .append("approvalState", getApprovalState())
            .append("userId", getUserId())
            .append("shiftId", getShiftId())
            .append("dAttachment", getdAttachment())
            .append("dComment", getdComment())
            .append("delFlag", getDelFlag())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .toString();
    }
}
