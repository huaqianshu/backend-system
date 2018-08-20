package com.anycall.base.model.business.condition;


import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Objects;

/**
 * Created by fh on 17/9/19.
 */
public class ReimbursementCustomItemCondition extends QuickSearchPageCondition {
    
    private String type;

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
        ReimbursementCustomItemCondition that = (ReimbursementCustomItemCondition) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }
}
