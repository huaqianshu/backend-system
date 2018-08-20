package com.anycall.base.model.account.condition;

import com.anycall.base.model.account.MemberType;
import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Objects;


public class RoleSearchPageCondition extends QuickSearchPageCondition {


    private static final long serialVersionUID = 2080864298616585836L;

    private MemberType memberType;

    private Long orgId;

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RoleSearchPageCondition that = (RoleSearchPageCondition) o;
        return memberType == that.memberType &&
                Objects.equals(orgId, that.orgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memberType, orgId);
    }
}
