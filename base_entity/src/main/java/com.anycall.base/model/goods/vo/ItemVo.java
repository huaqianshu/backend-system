package com.anycall.base.model.goods.vo;

import com.anycall.base.model.goods.Item;
import com.anycall.base.model.goods.Sku;

import java.util.List;

/**
 * 前台提交的商品资料
 * Created by lujun on 16/6/23.
 * Copyright © 2014-2016 ants-city.com
 */
public class ItemVo extends Item {

    private static final long serialVersionUID = 3528899449745409722L;
    //对于未开启规格的商品,多加sku信息
    //单位
    private String unit;
    //销售价
    private Double salePrice;
    //成本价/供货结算价
    private Double costPrice;
    private Double taxRate;
    private String brandName;

    private String skuCode;
    //包含的sku信息
    private List<Sku> skus;

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

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        this.costPrice = costPrice;
    }

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }
}
