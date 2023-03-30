package com.ruoyi.synergy.domain;

import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.entity.SysUser;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 值班对象 oa_user_duty
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
public class OaUserDuty extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 值班表id主键 */
    private Long dId;

    /** 值班名称 */
    @Excel(name = "值班名称")
    private String dName;

    /** 排班id */
    @Excel(name = "排班id")
    private Long scheduleId;
    private OaUserSchedule oaUserSchedule;

    /** 当前时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "当前时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date currentTime;

    /** 值班人 */
    @Excel(name = "值班人")
    private String dPeople;

    /** 值班状态 */
    @Excel(name = "值班状态")
    private Long dState;

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




    public void setdId(Long dId)
    {
        this.dId = dId;
    }

    public Long getdId() 
    {
        return dId;
    }

    public OaUserSchedule getOaUserSchedule() {
        return oaUserSchedule;
    }

    public void setOaUserSchedule(OaUserSchedule oaUserSchedule) {
        this.oaUserSchedule = oaUserSchedule;
    }

    public void setdName(String dName)
    {
        this.dName = dName;
    }

    public String getdName() 
    {
        return dName;
    }
    public void setScheduleId(Long scheduleId) 
    {
        this.scheduleId = scheduleId;
    }

    public Long getScheduleId() 
    {
        return scheduleId;
    }

    public void setCurrentTime(Date currentTime) 
    {
        this.currentTime = currentTime;
    }

    public Date getCurrentTime() 
    {
        return currentTime;
    }
    public void setdPeople(String dPeople) 
    {
        this.dPeople = dPeople;
    }

    public String getdPeople() 
    {
        return dPeople;
    }
    public void setdState(Long dState) 
    {
        this.dState = dState;
    }

    public Long getdState() 
    {
        return dState;
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
            .append("dId", getdId())
            .append("dName", getdName())
            .append("scheduleId", getScheduleId())
            .append("currentTime", getCurrentTime())
            .append("dPeople", getdPeople())
            .append("dState", getdState())
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
