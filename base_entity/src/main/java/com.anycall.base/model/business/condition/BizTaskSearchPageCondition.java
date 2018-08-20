package com.anycall.base.model.business.condition;

import com.anycall.base.model.business.BizTaskStatus;
import com.anycall.base.model.business.BizTaskType;
import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.List;
import java.util.Objects;

public class BizTaskSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -6798711784011222629L;

    private Long fromMemberId;
    private Long toMemberId;
    private BizTaskType taskType;
    private String orderType;
    private String orderNo;
    private List<BizTaskStatus> statuses;


    public Long getFromMemberId() {
        return fromMemberId;
    }

    public void setFromMemberId(Long fromMemberId) {
        this.fromMemberId = fromMemberId;
    }

    public Long getToMemberId() {
        return toMemberId;
    }

    public void setToMemberId(Long toMemberId) {
        this.toMemberId = toMemberId;
    }

    public BizTaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(BizTaskType taskType) {
        this.taskType = taskType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public List<BizTaskStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<BizTaskStatus> statuses) {
        this.statuses = statuses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BizTaskSearchPageCondition that = (BizTaskSearchPageCondition) o;
        return Objects.equals(fromMemberId, that.fromMemberId) &&
                Objects.equals(toMemberId, that.toMemberId) &&
                Objects.equals(taskType, that.taskType) &&
                Objects.equals(orderType, that.orderType) &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(statuses, that.statuses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fromMemberId, toMemberId, taskType, orderType, orderNo, statuses);
    }
}
