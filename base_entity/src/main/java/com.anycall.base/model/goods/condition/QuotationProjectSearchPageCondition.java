package com.anycall.base.model.goods.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.List;
import java.util.Objects;


public class QuotationProjectSearchPageCondition extends QuickSearchOrgPageCondition {

    private List<Long> orgTreeIds;

    private List<String> projectCodes;

    private String projectCode;
    //应用于选子公司获取顶级组织机构
    private Long contractOrgId;

    public Long getContractOrgId() {
        return contractOrgId;
    }

    public void setContractOrgId(Long contractOrgId) {
        this.contractOrgId = contractOrgId;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public List<String> getProjectCodes() {
        return projectCodes;
    }

    public void setProjectCodes(List<String> projectCodes) {
        this.projectCodes = projectCodes;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        QuotationProjectSearchPageCondition that = (QuotationProjectSearchPageCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(projectCodes, that.projectCodes) &&
                Objects.equals(projectCode, that.projectCode)&&
                Objects.equals(contractOrgId, that.contractOrgId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contractOrgId,orgTreeIds, projectCodes, projectCode);
    }
}
