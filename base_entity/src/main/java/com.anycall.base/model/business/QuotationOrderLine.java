package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.SkuType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;


public class QuotationOrderLine extends AbstractPersistable {

    private Long quotationOrderId;

    //报价类型
    private SkuType skuType;

    //类目
    private Long categoryId;

    private String catName;

    //品牌
    private Long contractId;

    private String brandName;

    //名称
    private String itemName;

    //品牌
    private Long brandId;

    //规格编码
    private String skuCode;

    private String unit;

    //数量
    private Integer number;

    //最大对外价
    private Double maxValue;

    //成本价(costLinePrice)
    private Double costLine;

    //对外报价
    private Double quoteLinePrice;

    //成本总计(costPrice)
    private Double cost;

    //报价总计
    private Double quoteTotal;

    //行毛利率
    private String grossProfitRateLine;

    private String memo;

    public Long getQuotationOrderId() {
        return quotationOrderId;
    }

    public void setQuotationOrderId(Long quotationOrderId) {
        this.quotationOrderId = quotationOrderId;
    }

    public SkuType getSkuType() {
        return skuType;
    }

    public void setSkuType(SkuType skuType) {
        this.skuType = skuType;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
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

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getCostLine() {
        return costLine;
    }

    public void setCostLine(Double costLine) {
        this.costLine = costLine;
    }

    public Double getQuoteLinePrice() {
        return quoteLinePrice;
    }

    public void setQuoteLinePrice(Double quoteLinePrice) {
        this.quoteLinePrice = quoteLinePrice;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getQuoteTotal() {
        return quoteTotal;
    }

    public void setQuoteTotal(Double quoteTotal) {
        this.quoteTotal = quoteTotal;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getGrossProfitRateLine() {
        return grossProfitRateLine;
    }

    public void setGrossProfitRateLine(String grossProfitRateLine) {
        this.grossProfitRateLine = grossProfitRateLine;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}

