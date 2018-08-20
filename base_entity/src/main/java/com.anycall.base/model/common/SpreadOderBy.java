package com.anycall.base.model.common;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by harold on  16/12/26.
 * Copyright © 2014-2016 ants-city.com
 */
public class SpreadOderBy extends AbstractPersistable {


    private static final long serialVersionUID = -1562415033173463865L;
    // 品牌
    private String brandName;
    // 门店
    private String shopName;
    // 数量
    private Integer orderCount;

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

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }
}
