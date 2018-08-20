package com.anycall.base.model.general.bo;

import com.anycall.base.model.account.ChargingType;
import com.anycall.base.model.business.Shop;

import java.util.Date;

/**
 * Created by Robin on 16/8/25.
 */
public class ShopBo extends Shop {

    private static final long serialVersionUID = 6292350902338014931L;

    private Long brandId;

    private String brandName;

    private Long contractId;

    private ChargingType chargingType;

    private Long orgId;

    private String supplierName;

    private String contractCode;

    private String contractName;

    private Double allInPrice;

    private Boolean doWithoutApply;
    //优衣库合约门店质保截止日期
    private Date qualityEndTime;
    private Long serviceCatalogId;
    private String orgName;

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public Long getServiceCatalogId() {
        return serviceCatalogId;
    }

    public void setServiceCatalogId(Long serviceCatalogId) {
        this.serviceCatalogId = serviceCatalogId;
    }

    public Date getQualityEndTime() {
        return qualityEndTime;
    }

    public void setQualityEndTime(Date qualityEndTime) {
        this.qualityEndTime = qualityEndTime;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public ChargingType getChargingType() {
        return chargingType;
    }

    public void setChargingType(ChargingType chargingType) {
        this.chargingType = chargingType;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Double getAllInPrice() {
        return allInPrice;
    }

    public void setAllInPrice(Double allInPrice) {
        this.allInPrice = allInPrice;
    }

    public Boolean getDoWithoutApply() {
        return doWithoutApply;
    }

    public void setDoWithoutApply(Boolean doWithoutApply) {
        this.doWithoutApply = doWithoutApply;
    }
}
