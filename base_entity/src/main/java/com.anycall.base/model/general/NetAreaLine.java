package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;
/**
 * Created by admin on 2016/8/18.
 */
public class NetAreaLine extends AbstractPersistable {

    private static final long serialVersionUID = -6841327737594837290L;

    private String shopCode;

    private Long netAreaId;

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Long getNetAreaId() {
        return netAreaId;
    }

    public void setNetAreaId(Long netAreaId) {
        this.netAreaId = netAreaId;
    }
}
