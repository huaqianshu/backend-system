package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;


public class ExportOrgQuotation extends AbstractPersistable {

    private Long supplierId;

    private String shopCode;

    private String shopName;

    private String supplierName;

    private Double priceStatistics;

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Double getPriceStatistics() {
        return priceStatistics;
    }

    public void setPriceStatistics(Double priceStatistics) {
        this.priceStatistics = priceStatistics;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
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
}
