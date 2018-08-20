package com.anycall.base.model.account.vo;

import com.anycall.base.model.account.ContractServiceCatalog;
import com.anycall.base.model.account.ContractShop;

import java.util.List;

public class ContractServiceCatalogVo extends ContractServiceCatalog {
    private static final long serialVersionUID = 1125231799928818465L;
    private Long supplierId;
    private String supplierName;
    private String contractName;
    private String contractCode;
    private boolean allin;
    private String unit;
    private String qualityEndTime;

    public String getQualityEndTime() {
        return qualityEndTime;
    }

    public void setQualityEndTime(String qualityEndTime) {
        this.qualityEndTime = qualityEndTime;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public boolean isAllin() {
        return allin;
    }

    public void setAllin(boolean allin) {
        this.allin = allin;
    }
}
