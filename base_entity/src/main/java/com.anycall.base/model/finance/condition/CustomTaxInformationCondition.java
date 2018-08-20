package com.anycall.base.model.finance.condition;


import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Objects;

/**
 * Created by fh on 17/10/24.
 */
public class CustomTaxInformationCondition extends QuickSearchPageCondition {

    private static final long serialVersionUID = 5641237386282279954L;

    private Long companyId;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CustomTaxInformationCondition that = (CustomTaxInformationCondition) o;
        return Objects.equals(companyId, that.companyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), companyId);
    }
}
