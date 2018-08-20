package com.anycall.base.model.business.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Created by yubotao on 16/7/25.
 */
public class CompanySearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -4883644812624026818L;

    private Integer brandId;

    private Integer companyId;

    private List<String> companyIds;

    private Boolean enabled;
    private Boolean closed;

    private List<Long> orgTreeIds;
    private boolean inContract=false;

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }


    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public boolean getInContract() {
        return inContract;
    }

    public void setInContract(boolean inContract) {
        this.inContract = inContract;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public List<String> getCompanyIds() {
        return companyIds;
    }

    public void setCompanyIds(List<String> companyIds) {
        this.companyIds = companyIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CompanySearchPageCondition that = (CompanySearchPageCondition) o;
        return inContract == that.inContract &&
                Objects.equals(brandId, that.brandId) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(companyIds, that.companyIds) &&
                Objects.equals(enabled, that.enabled) &&
                Objects.equals(closed, that.closed) &&
                Objects.equals(orgTreeIds, that.orgTreeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brandId, companyId, companyIds, enabled, closed, orgTreeIds, inContract);
    }
}
