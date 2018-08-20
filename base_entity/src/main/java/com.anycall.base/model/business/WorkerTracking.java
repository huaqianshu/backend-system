package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class WorkerTracking extends AbstractPersistable {

    //工人
    private Long workerId;

    //工人姓名
    private String workerName;

    //经度
    private String longitude;

    //纬度
    private String latitude;

    //上传时间
    private Date uploadDate;

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }
}
