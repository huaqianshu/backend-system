package com.anycall.base.model.general;


import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * 调度日志
 */
public class JobLog extends AbstractPersistable {

    private static final long serialVersionUID = 1258789517688088047L;

    //任务类型
    private String jobType;

    //任务名称
    private String jobName;

    //任务状态
    private JobLogStatus logStatus;

    //运行结果
    private String result;

    //开始时间
    private Date beginTime;

    //结束时间
    private Date endTime;

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobLogStatus getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(JobLogStatus logStatus) {
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
}
