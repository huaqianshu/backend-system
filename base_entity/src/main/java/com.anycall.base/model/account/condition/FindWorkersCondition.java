package com.anycall.base.model.account.condition;

import com.anycall.base.common.BaseCondition;

import java.util.Date;
import java.util.Objects;


public class FindWorkersCondition implements BaseCondition {


    private static final long serialVersionUID = 1404942399807788340L;

    private Long orgRootId;

    private String mode;

    private Long dispatcherId;

    private String netAreaIds;

    private Date startDate;

    private Date endDate;

    public String getNetAreaIds() {
        return netAreaIds;
    }

    public void setNetAreaIds(String netAreaIds) {
        this.netAreaIds = netAreaIds;
    }

    public Long getOrgRootId() {
        return orgRootId;
    }

    public void setOrgRootId(Long orgRootId) {
        this.orgRootId = orgRootId;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FindWorkersCondition that = (FindWorkersCondition) o;
        return Objects.equals(orgRootId, that.orgRootId) &&
                Objects.equals(mode, that.mode) &&
                Objects.equals(dispatcherId, that.dispatcherId) &&
                Objects.equals(netAreaIds, that.netAreaIds) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgRootId, mode, dispatcherId, netAreaIds, startDate, endDate);
    }
}
