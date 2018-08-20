package com.anycall.base.model.business.bo;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by admin on 2016/7/29.
 */
public class SelectShopPriceBo implements Serializable {

    private static final long serialVersionUID = 13595820667133323L;

    private String shopName;
    private BigDecimal priceSum;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BigDecimal getPriceSum() {
        return priceSum;
    }

    public void setPriceSum(BigDecimal priceSum) {
        this.priceSum = priceSum;
    }
}
