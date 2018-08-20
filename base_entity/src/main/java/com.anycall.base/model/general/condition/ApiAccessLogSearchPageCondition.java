package com.anycall.base.model.general.condition;

import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Date;

/**
 * Created by Amy on 2017/1/11.
 */
public class ApiAccessLogSearchPageCondition extends QuickSearchPageCondition {

    private String username;

    private String apiName;

    private boolean retSuccess;

    private Date startTime;

    private Date endTime;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public boolean isRetSuccess() {
        return retSuccess;
    }

    public void setRetSuccess(boolean retSuccess) {
        this.retSuccess = retSuccess;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
