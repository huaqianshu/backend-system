package com.anycall.base.model.common.condition;

import java.util.List;

/**
 * Created by yubotao on 16/9/29.app 日历提醒model
 */
public class CalenderTipCondition extends QuickSearchOrgPageCondition {


    private Long staffId;

    private String status;

    private List<String> statuses;


    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<String> statuses) {
        this.statuses = statuses;
    }
}
