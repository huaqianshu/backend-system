package com.anycall.base.model.account.condition;

import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Objects;

/**
 * Created by lujun on 16/6/20.
 * Copyright © 2014-2016 ants-city.com
 */
public class OrgSearchPageCondition extends QuickSearchPageCondition {

    private static final long serialVersionUID = 1269307258740428053L;

    private String orgType;

    private String approvalStatus;

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OrgSearchPageCondition that = (OrgSearchPageCondition) o;
        return Objects.equals(orgType, that.orgType) &&
                Objects.equals(approvalStatus, that.approvalStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orgType, approvalStatus);
    }
}
