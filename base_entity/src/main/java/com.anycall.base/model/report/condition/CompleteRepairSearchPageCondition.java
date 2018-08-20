package com.anycall.base.model.report.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.Objects;


public class CompleteRepairSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = 8457146660424117215L;

    private Long companyId;
    private Date startTime;
    private Date endTime;

    private String startTimeStr;

    private String endTimeStr;
    private String allIn;

    public String getAllIn() {
        return allIn;
    }

    public void setAllIn(String allIn) {
        this.allIn = allIn;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getEndTimeStr() {
        return endTimeStr;
    }

    public void setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
    }

    public String getStartTimeStr() {
        return startTimeStr;
    }

    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CompleteRepairSearchPageCondition that = (CompleteRepairSearchPageCondition) o;
        return Objects.equals(companyId, that.companyId) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(startTimeStr, that.startTimeStr) &&
                Objects.equals(endTimeStr, that.endTimeStr)&&
                Objects.equals(allIn, that.allIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), allIn,companyId, startTime, endTime, startTimeStr, endTimeStr);
    }
}
