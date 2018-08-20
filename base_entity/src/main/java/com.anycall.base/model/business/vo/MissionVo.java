package com.anycall.base.model.business.vo;

import com.anycall.base.model.common.Mission;

public class MissionVo extends Mission{
    private static final long serialVersionUID = 7389900030946333802L;
    private  String missionSourceValue;

    private String  workerName;

    private String workerPhone;

    private String orgName;

    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWorkerPhone() {
        return workerPhone;
    }

    public void setWorkerPhone(String workerPhone) {
        this.workerPhone = workerPhone;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getMissionSourceValue() {
        return missionSourceValue;
    }

    public void setMissionSourceValue(String missionSourceValue) {
        this.missionSourceValue = missionSourceValue;
    }
}
