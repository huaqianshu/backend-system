package com.anycall.base.model.common.condition;

import java.util.List;
import java.util.Objects;

public class SpreadOderBySearchPageCondition extends QuickSearchOrgPageCondition {


    private static final long serialVersionUID = -1652048002602103957L;
    private List<Long> orgTreeIds;

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpreadOderBySearchPageCondition that = (SpreadOderBySearchPageCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orgTreeIds);
    }
}
