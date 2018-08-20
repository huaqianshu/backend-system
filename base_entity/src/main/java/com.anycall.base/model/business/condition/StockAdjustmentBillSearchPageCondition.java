package com.anycall.base.model.business.condition;

import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Objects;

/**
 * Created by Amy on 2016/12/6.
 */
public class StockAdjustmentBillSearchPageCondition extends QuickSearchPageCondition {

    private static final long serialVersionUID = -910976847101667970L;
    private Long workOrderId;

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        StockAdjustmentBillSearchPageCondition that = (StockAdjustmentBillSearchPageCondition) o;
        return Objects.equals(workOrderId, that.workOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workOrderId);
    }
}
