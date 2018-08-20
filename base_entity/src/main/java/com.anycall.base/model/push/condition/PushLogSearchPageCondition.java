package com.anycall.base.model.push.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;
import com.anycall.base.model.push.PushStatus;

import java.util.List;
import java.util.Objects;

public class PushLogSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -6798778784011222629L;

    private PushStatus status;

    private List<PushStatus> statuses;

    private Integer maxRepertCount;

    public PushStatus getStatus() {
        return status;
    }

    public void setStatus(PushStatus status) {
        this.status = status;
    }

    public List<PushStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<PushStatus> statuses) {
        this.statuses = statuses;
    }

    public Integer getMaxRepertCount() {
        return maxRepertCount;
    }

    public void setMaxRepertCount(Integer maxRepertCount) {
        this.maxRepertCount = maxRepertCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PushLogSearchPageCondition that = (PushLogSearchPageCondition) o;
        return Objects.equals(status, that.status) &&
                Objects.equals(statuses, that.statuses) &&
                Objects.equals(maxRepertCount, that.maxRepertCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), status, statuses,maxRepertCount);
    }
}
