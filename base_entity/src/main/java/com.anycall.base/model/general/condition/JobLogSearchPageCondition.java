package com.anycall.base.model.general.condition;


import com.anycall.base.model.common.condition.QuickSearchPageCondition;

import java.util.Date;
import java.util.Objects;

/**
 * Created by Allen on 2016/11/3.
 */
public class JobLogSearchPageCondition extends QuickSearchPageCondition {

    private static final long serialVersionUID = 8295396250543387260L;

    private String jobName;

    private String logStatus;

    private String result;

    private Date beginTime;

    private Date endTime;

    private String jobType;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(String logStatus) {
        this.logStatus = logStatus;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobLogSearchPageCondition that = (JobLogSearchPageCondition) o;
        return Objects.equals(jobName, that.jobName) &&
                Objects.equals(logStatus, that.logStatus) &&
                Objects.equals(result, that.result) &&
                Objects.equals(beginTime, that.beginTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(jobType, that.jobType) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),jobName,logStatus,result,beginTime,endTime,jobType);
    }
}
