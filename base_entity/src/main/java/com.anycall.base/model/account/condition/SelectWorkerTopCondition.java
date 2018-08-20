package com.anycall.base.model.account.condition;

import com.anycall.base.common.BaseCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;


public class SelectWorkerTopCondition implements BaseCondition {


    private static final long serialVersionUID = 1404945459807788340L;


    private  String workerTopType;
    private  Long memberId;

    private  String memberName;

    private List<Long> orgTreeIds;
    private  Long  provinceId;//省id
    private  Long  brandId;//品牌id
    private  Long  districtId;//区id
    private  Long  cityId;//城市id
    private  String  shopCode;//门店code
    private  String  region;//大区  "EAST"
    private  String  sortProperty;
    private  String  sortDirection;//排序  DESC  ASC
    private  Date  startTime;// 开始时间
    private  Date endTime;//结束时时间
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getWorkerTopType() {
        return workerTopType;
    }

    public void setWorkerTopType(String workerTopType) {
        this.workerTopType = workerTopType;
    }

    public Long getMemberId() {
        return memberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SelectWorkerTopCondition condition = (SelectWorkerTopCondition) o;
        return Objects.equals(workerTopType, condition.workerTopType) &&
                Objects.equals(memberId, condition.memberId) &&
                Objects.equals(memberName, condition.memberName) &&
                Objects.equals(orgTreeIds, condition.orgTreeIds) &&
                Objects.equals(provinceId, condition.provinceId) &&
                Objects.equals(brandId, condition.brandId) &&
                Objects.equals(districtId, condition.districtId) &&
                Objects.equals(cityId, condition.cityId) &&
                Objects.equals(shopCode, condition.shopCode) &&
                Objects.equals(region, condition.region) &&
                Objects.equals(sortProperty, condition.sortProperty) &&
                Objects.equals(sortDirection, condition.sortDirection) &&
                Objects.equals(startTime, condition.startTime) &&
                Objects.equals(endTime, condition.endTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(workerTopType, memberId, memberName, orgTreeIds, provinceId, brandId, districtId, cityId, shopCode, region, sortProperty, sortDirection, startTime, endTime);
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSortProperty() {
        return sortProperty;
    }

    public void setSortProperty(String sortProperty) {
        this.sortProperty = sortProperty;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
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
}
