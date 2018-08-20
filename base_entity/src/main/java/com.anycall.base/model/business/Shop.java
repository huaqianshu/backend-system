package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.Region;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by yubotao on 16/7/25.
 */
public class Shop extends AbstractPersistable {

    private static final long serialVersionUID = 1052095866209533525L;

    private String shopName;

    private Long companyId;

    private Long brandId;

    private String address;

    private String shopCode;

    private Boolean closed = false;

    private String phoneNum;

    private String billrsp;

    private String remarks;

    private String contactName;

    private Date createTime;

    private Date updateTime;

    private String updater;

    private Region region;

    private Long cityId;

    private Long districtId;

    private Long stateId;

    private String cityName;

    private String districtName;

    private String stateName;

    private String contactAndPhoneOne;

    private String contactAndPhoneTwo;

    private String contactAndPhoneThree;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date expiredTime;//保修截止日

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date openTime;//开店日期

    private String shopMemo;   //门店说明

    private String serviceTimeMemo;  //服务时间说明

    private String shopNum;  //门店号

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getBillrsp() {
        return billrsp;
    }

    public void setBillrsp(String billrsp) {
        this.billrsp = billrsp;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
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

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getContactAndPhoneOne() {
        return contactAndPhoneOne;
    }

    public void setContactAndPhoneOne(String contactAndPhoneOne) {
        this.contactAndPhoneOne = contactAndPhoneOne;
    }

    public String getContactAndPhoneTwo() {
        return contactAndPhoneTwo;
    }

    public void setContactAndPhoneTwo(String contactAndPhoneTwo) {
        this.contactAndPhoneTwo = contactAndPhoneTwo;
    }

    public String getContactAndPhoneThree() {
        return contactAndPhoneThree;
    }

    public void setContactAndPhoneThree(String contactAndPhoneThree) {
        this.contactAndPhoneThree = contactAndPhoneThree;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public String getShopMemo() {
        return shopMemo;
    }

    public void setShopMemo(String shopMemo) {
        this.shopMemo = shopMemo;
    }

    public String getServiceTimeMemo() {
        return serviceTimeMemo;
    }

    public void setServiceTimeMemo(String serviceTimeMemo) {
        this.serviceTimeMemo = serviceTimeMemo;
    }

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
    }
}
