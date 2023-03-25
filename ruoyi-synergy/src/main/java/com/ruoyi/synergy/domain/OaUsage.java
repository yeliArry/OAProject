package com.ruoyi.synergy.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 参试设备——我的使用对象 oa_usage
 * 
 * @author ruoyi
 * @date 2023-03-25
 */
public class OaUsage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long usageId;

    /** 参试设备id */
    @Excel(name = "参试设备id")
    private Long blockId;

    /** 参试设备使用状态 */
    @Excel(name = "参试设备使用状态")
    private Long usageState;

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

    public void setUsageId(Long usageId) 
    {
        this.usageId = usageId;
    }

    public Long getUsageId() 
    {
        return usageId;
    }
    public void setBlockId(Long blockId) 
    {
        this.blockId = blockId;
    }

    public Long getBlockId() 
    {
        return blockId;
    }
    public void setUsageState(Long usageState) 
    {
        this.usageState = usageState;
    }

    public Long getUsageState() 
    {
        return usageState;
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
            .append("usageId", getUsageId())
            .append("blockId", getBlockId())
            .append("usageState", getUsageState())
            .append("delFlag", getDelFlag())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .toString();
    }
}
