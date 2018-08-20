package com.anycall.base.model.finance.condition;

import com.anycall.base.model.business.UrgencyType;
import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Objects;

public class SettlementQuotationLineSearchPageCondition extends QuickSearchOrgPageCondition {
    private static final long serialVersionUID = 6171369245707046387L;
    private Long settlementQuotationId;

    private Long quotationId;
    private UrgencyType type;


    public Long getSettlementQuotationId() {
        return settlementQuotationId;
    }

    public void setSettlementQuotationId(Long settlementQuotationId) {
        this.settlementQuotationId = settlementQuotationId;
    }

    public Long getQuotationId() {
        return quotationId;
    }

    public void setQuotationId(Long quotationId) {
        this.quotationId = quotationId;
    }

    public UrgencyType getType() {
        return type;
    }

    public void setType(UrgencyType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SettlementQuotationLineSearchPageCondition that = (SettlementQuotationLineSearchPageCondition) o;
        return Objects.equals(settlementQuotationId, that.settlementQuotationId) &&
                Objects.equals(quotationId, that.quotationId) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), settlementQuotationId, quotationId, type);
    }
}
