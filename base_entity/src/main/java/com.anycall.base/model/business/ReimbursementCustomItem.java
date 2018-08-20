package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

public class ReimbursementCustomItem extends AbstractPersistable {

    private String itemName;

    private ReimburseLineStatus type;

    private Long orgId;

    private boolean deleted = false;

    private String creator;

    private Date createTime;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ReimburseLineStatus getType() {
        return type;
    }

    public void setType(ReimburseLineStatus type) {
        this.type = type;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
