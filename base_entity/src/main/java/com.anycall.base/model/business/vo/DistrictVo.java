package com.anycall.base.model.business.vo;

import java.util.List;

public class DistrictVo {

    private Long districtId;
    private String districtName;

    private List<Shop2Vo> shopList;

    public List<Shop2Vo> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop2Vo> shopList) {
        this.shopList = shopList;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
