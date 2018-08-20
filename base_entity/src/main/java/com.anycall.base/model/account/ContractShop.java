package com.anycall.base.model.account;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.Region;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Auser on 2016/8/16.
 */
public class ContractShop extends AbstractPersistable {

    private static final long serialVersionUID = 4778654028590496152L;

    private Long contractId;

    private Boolean stop = false;

    /**
     * 服务类型：统包/计件
     */
    private ChargingType chargingType;

    private Double allInPrice;

    private String shopCode;
    private String shopName;
    private Region region;
    private Long districtId;
    private Long cityId;
    private Long stateId;
    private String districtName;
    private String cityName;
    private String stateName;
    //<column name="doWithoutApply" type="BIT"/>
    private Boolean doWithoutApply = false;
    //质保截止时间
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date qualityEndTime;

    public Date getQualityEndTime() {
        return qualityEndTime;
    }

    public void setQualityEndTime(Date qualityEndTime) {
        this.qualityEndTime = qualityEndTime;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Boolean getStop() {
        return stop;
    }

    public void setStop(Boolean stop) {
        this.stop = stop;
    }

    public ChargingType getChargingType() {
        return chargingType;
    }

    public void setChargingType(ChargingType chargingType) {
        this.chargingType = chargingType;
    }

    public Double getAllInPrice() {
        return allInPrice;
    }

    public void setAllInPrice(Double allInPrice) {
        this.allInPrice = allInPrice;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
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

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Boolean getDoWithoutApply() {
        return doWithoutApply;
    }

    public void setDoWithoutApply(Boolean doWithoutApply) {
        this.doWithoutApply = doWithoutApply;
    }
}
