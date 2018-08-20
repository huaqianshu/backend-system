package com.anycall.base.model.account;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Auser on 2016/7/29.
 */
public class ServiceProvider extends AbstractPersistable {

    //名称
    private String providerName;

    //备注
    private String memo;

    //类型
    private ServiceProviderType providerType = ServiceProviderType.ANYCALL;

    //大区
    private String region;

    //省
    private String state;

    //市
    private String city;

    //区
    private String district;

    //大区
    private String regionId;

    //省
    private String stateId;

    //市
    private String cityId;

    //区
    private String districtId;

    //是否启用
    private Boolean enabled = false;

    private Boolean deleted = false;

    private String updater;

    private Date createTime;

    private Date updateTime;

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public ServiceProviderType getProviderType() {
        return providerType;
    }

    public void setProviderType(ServiceProviderType providerType) {
        this.providerType = providerType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
