package com.anycall.base.model.finance.condition;


import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Objects;

/**
 * Created by fh on 17/10/13.
 */
public class CustomInvoiceTitleCondition extends QuickSearchPageCondition {
    
    private String type;

    private Long companyId;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
        CustomInvoiceTitleCondition that = (CustomInvoiceTitleCondition) o;
        return Objects.equals(type, that.type) &&
                Objects.equals(companyId, that.companyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, companyId);
    }
}
