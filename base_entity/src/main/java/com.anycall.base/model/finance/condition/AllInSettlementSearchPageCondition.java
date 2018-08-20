package com.anycall.base.model.finance.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Objects;

public class AllInSettlementSearchPageCondition extends QuickSearchOrgPageCondition {
    private static final long serialVersionUID = 9198239134963258165L;

    private String shopCode;
    private String status;
    private Long companyId;
    private Long brandId;
    private Integer year;
    private Integer month;
    private  String region;

    private  Long cityId;

    private  Long districtId;

    private  Long stateId;

    private String shopAuths;

    private Integer allInSettlementDay;

    private String settlementWay;

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
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

    public String getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String shopAuths) {
        this.shopAuths = shopAuths;
    }

    public Integer getAllInSettlementDay() {
        return allInSettlementDay;
    }

    public void setAllInSettlementDay(Integer allInSettlementDay) {
        this.allInSettlementDay = allInSettlementDay;
    }

    public String getSettlementWay() {
        return settlementWay;
    }

    public void setSettlementWay(String settlementWay) {
        this.settlementWay = settlementWay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AllInSettlementSearchPageCondition that = (AllInSettlementSearchPageCondition) o;
        return Objects.equals(shopCode, that.shopCode) &&
                Objects.equals(status, that.status) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(brandId, that.brandId) &&
                Objects.equals(year, that.year) &&
                Objects.equals(month, that.month) &&
                Objects.equals(region, that.region) &&
                Objects.equals(cityId, that.cityId) &&
                Objects.equals(districtId, that.districtId) &&
                Objects.equals(stateId, that.stateId) &&
                Objects.equals(shopAuths, that.shopAuths) &&
                Objects.equals(allInSettlementDay, that.allInSettlementDay) &&
                Objects.equals(settlementWay, that.settlementWay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shopCode, status, companyId, brandId, year, month, region, cityId, districtId, stateId, shopAuths, allInSettlementDay, settlementWay);
    }
}
