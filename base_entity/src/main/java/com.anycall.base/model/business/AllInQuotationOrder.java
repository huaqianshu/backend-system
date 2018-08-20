package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;


public class AllInQuotationOrder extends AbstractPersistable {

    //单号
    private String allInQuotationOrderNo;

    //品牌
    private Long companyBrandId;

    //门店
    private String shopCode;

    //总报价
    private Double allInquoteTotals;

    //总成本
    private Double allIncostTotals;

    //总毛利率
    private Double allIngrossProfitRate;

    //最后更新时间
    private Date updateTime;

    public String getAllInQuotationOrderNo() {
        return allInQuotationOrderNo;
    }

    public void setAllInQuotationOrderNo(String allInQuotationOrderNo) {
        this.allInQuotationOrderNo = allInQuotationOrderNo;
    }

    public Long getCompanyBrandId() {
        return companyBrandId;
    }

    public void setCompanyBrandId(Long companyBrandId) {
        this.companyBrandId = companyBrandId;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Double getAllInquoteTotals() {
        return allInquoteTotals;
    }

    public void setAllInquoteTotals(Double allInquoteTotals) {
        this.allInquoteTotals = allInquoteTotals;
    }

    public Double getAllIncostTotals() {
        return allIncostTotals;
    }

    public void setAllIncostTotals(Double allIncostTotals) {
        this.allIncostTotals = allIncostTotals;
    }

    public Double getAllIngrossProfitRate() {
        return allIngrossProfitRate;
    }

    public void setAllIngrossProfitRate(Double allIngrossProfitRate) {
        this.allIngrossProfitRate = allIngrossProfitRate;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
