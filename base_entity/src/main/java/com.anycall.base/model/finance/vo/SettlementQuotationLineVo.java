package com.anycall.base.model.finance.vo;

import com.anycall.base.model.finance.SettlementQuotationLine;

import java.util.List;


public class SettlementQuotationLineVo extends SettlementQuotationLine {
    private static final long serialVersionUID = -3615974011552167880L;

    private String brandName;
    private String region;
    private String shopName;
    //是否在保
    private Boolean isInService;

    private String serviceOrderNo;
    private String quotationOrderNo;

    public Boolean getInService() {
        return isInService;
    }

    public void setInService(Boolean inService) {
        isInService = inService;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public String getQuotationOrderNo() {
        return quotationOrderNo;
    }

    public void setQuotationOrderNo(String quotationOrderNo) {
        this.quotationOrderNo = quotationOrderNo;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    private List<SettlementQuotationLineItemVo> items;

    public List<SettlementQuotationLineItemVo> getItems() {
        return items;
    }

    public void setItems(List<SettlementQuotationLineItemVo> items) {
        this.items = items;
    }
}
