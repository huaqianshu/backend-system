package com.anycall.base.model.account.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;

public class LocationSearchCondition extends QuickSearchOrgPageCondition {
    private Long memberId;
    private Date startTime;
    private Date endTime;
    private List<Long> notInMemberIds;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
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

    public List<Long> getNotInMemberIds() {
        return notInMemberIds;
    }

    public void setNotInMemberIds(List<Long> notInMemberIds) {
        this.notInMemberIds = notInMemberIds;
    }
}
