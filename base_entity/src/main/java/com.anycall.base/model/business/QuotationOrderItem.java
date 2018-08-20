package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.SkuType;

import java.util.Date;


public class QuotationOrderItem extends AbstractPersistable {

    //报价项目
    private Long quotationOrderProjectId;

    //类目
    private Long categoryId;

    private String catName;

    //品牌
    private Long brandId;

    private String brandName;

    //名称
    private String itemName;

    //规格编码
    private String skuCode;

    //单位
    private String unit;

    //物料销售价格
    private Double salePrice;

    //数量
    private Double number;

    //总计
    private Double itemTotal;

    public Long getQuotationOrderProjectId() {
        return quotationOrderProjectId;
    }

    public void setQuotationOrderProjectId(Long quotationOrderProjectId) {
        this.quotationOrderProjectId = quotationOrderProjectId;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(Double itemTotal) {
        this.itemTotal = itemTotal;
    }
}
