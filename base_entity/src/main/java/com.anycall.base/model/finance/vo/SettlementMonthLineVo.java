package com.anycall.base.model.finance.vo;

import com.anycall.base.model.finance.SettlementMonthLine;
import com.anycall.base.model.general.Region;


public class SettlementMonthLineVo extends SettlementMonthLine {
    private static final long serialVersionUID = 1449189695701193389L;

    //品牌
    private String brandName;

    //门店
    private String shopName;

    //地区
    private Region region;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
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
}
