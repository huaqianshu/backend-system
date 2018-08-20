package com.anycall.base.model.business.vo;

import com.anycall.base.model.business.Complain;

/**
 * Created by Robin on 16/8/30.
 */
public class ComplainVo extends Complain {

    private static final long serialVersionUID = 8854438315175104275L;

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    private String shopName;



}
