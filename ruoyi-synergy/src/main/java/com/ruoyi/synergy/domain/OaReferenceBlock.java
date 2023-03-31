package com.ruoyi.synergy.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.common.core.domain.entity.SysUser;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 参试设备对象 oa_reference_block
 * 
 * @author ruoyi
 * @date 2023-03-30
 */
public class OaReferenceBlock extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long blockId;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String blockName;

    /** 设备型号 */
    @Excel(name = "设备型号")
    private String unitType;

    /** 存放位置 */
    @Excel(name = "存放位置")
    private String storageId;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    private SysUser sysUser;
    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    /** 设备状态 */
    @Excel(name = "设备状态")
    private Long blockStatus;

    /** 使用状态 */
    @Excel(name = "使用状态")
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

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public void setBlockId(Long blockId)
    {
        this.blockId = blockId;
    }

    public Long getBlockId() 
    {
        return blockId;
    }
    public void setBlockName(String blockName) 
    {
        this.blockName = blockName;
    }

    public String getBlockName() 
    {
        return blockName;
    }
    public void setUnitType(String unitType) 
    {
        this.unitType = unitType;
    }

    public String getUnitType() 
    {
        return unitType;
    }
    public void setStorageId(String storageId) 
    {
        this.storageId = storageId;
    }

    public String getStorageId() 
    {
        return storageId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setCreationTime(Date creationTime) 
    {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() 
    {
        return creationTime;
    }
    public void setBlockStatus(Long blockStatus) 
    {
        this.blockStatus = blockStatus;
    }

    public Long getBlockStatus() 
    {
        return blockStatus;
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
            .append("blockId", getBlockId())
            .append("blockName", getBlockName())
            .append("unitType", getUnitType())
            .append("storageId", getStorageId())
            .append("userId", getUserId())
            .append("creationTime", getCreationTime())
            .append("blockStatus", getBlockStatus())
            .append("usageState", getUsageState())
            .append("delFlag", getDelFlag())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .toString();
    }
}
