package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by yubotao on 16/7/25.
 */
public class ShopLocation extends AbstractPersistable {

    private static final long serialVersionUID = 1051095866202533125L;

    private String shopCode;

    private String shopName;

    private String address;

    private Double lon;

    private Double lat;

    private Date updateTime;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
