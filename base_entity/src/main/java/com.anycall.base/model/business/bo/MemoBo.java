package com.anycall.base.model.business.bo;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Robin on 16/8/30.
 */
public class MemoBo extends AbstractPersistable {

    private static final long serialVersionUID = -5140270140280011117L;

    private String orderName;

    private String orderType;

    private String memoFrom;

    private String memoFromPhone;

    private String memoFromAvatar;

    private Date memoTime;

    private String memoContent;

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getMemoFrom() {
        return memoFrom;
    }

    public void setMemoFrom(String memoFrom) {
        this.memoFrom = memoFrom;
    }

    public String getMemoFromPhone() {
        return memoFromPhone;
    }

    public void setMemoFromPhone(String memoFromPhone) {
        this.memoFromPhone = memoFromPhone;
    }

    public Date getMemoTime() {
        return memoTime;
    }

    public void setMemoTime(Date memoTime) {
        this.memoTime = memoTime;
    }

    public String getMemoContent() {
        return memoContent;
    }

    public void setMemoContent(String memoContent) {
        this.memoContent = memoContent;
    }

    public String getMemoFromAvatar() {
        return memoFromAvatar;
    }

    public void setMemoFromAvatar(String memoFromAvatar) {
        this.memoFromAvatar = memoFromAvatar;
    }
}
