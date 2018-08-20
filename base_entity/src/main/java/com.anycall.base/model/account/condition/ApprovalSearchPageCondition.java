package com.anycall.base.model.account.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.List;
import java.util.Objects;


public class ApprovalSearchPageCondition extends QuickSearchOrgPageCondition{

    private static final long serialVersionUID = -134319104051996142L;
    private List<Long> orgTreeIds;
    private String status;
    private String unstatus;
    private String type;

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUnstatus() {
        return unstatus;
    }

    public void setUnstatus(String unstatus) {
        this.unstatus = unstatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ApprovalSearchPageCondition that = (ApprovalSearchPageCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(status, that.status) &&
                Objects.equals(unstatus, that.unstatus) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orgTreeIds, status, unstatus, type);
    }
}
