package com.anycall.base.model.account.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.List;
import java.util.Objects;

/**
 * Created by lujun on 16/6/20.
 * Copyright © 2014-2016 ants-city.com
 */
public class ContractSearchPageCondition extends QuickSearchOrgPageCondition{

    private static final long serialVersionUID = 2292198029963597710L;
    private List<Long> orgTreeIds;
    private Long contractId;
    private String memberType;
    private List<String> projectCodes;
    private Long companyId;
    private List<String> companyIds;
    private List<String> statuses;

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public List<String> getProjectCodes() {
        return projectCodes;
    }

    public void setProjectCodes(List<String> projectCodes) {
        this.projectCodes = projectCodes;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public List<String> getCompanyIds() {
        return companyIds;
    }

    public void setCompanyIds(List<String> companyIds) {
        this.companyIds = companyIds;
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ContractSearchPageCondition that = (ContractSearchPageCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(contractId, that.contractId) &&
                Objects.equals(memberType, that.memberType) &&
                Objects.equals(projectCodes, that.projectCodes) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(companyIds, that.companyIds) &&
                Objects.equals(statuses, that.statuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orgTreeIds, contractId, memberType, projectCodes, companyId, companyIds, statuses);
    }
}
