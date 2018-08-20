package com.anycall.base.model.push;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by Robin on 16/8/30.
 */
public class PushReq extends AbstractPersistable {

    private static final long serialVersionUID = 1796853221452242294L;

    protected PushMsgType msgType = PushMsgType.ACTION;
    protected String msgTitle;
    protected String msgContent;
    protected PushOrderType orderType;
    protected String orderNo;
    protected Object data;
    protected String toAccount;

    public String getToAccount() {
        return toAccount;
    }

    public void setToAccount(String toAccount) {
        this.toAccount = toAccount;
    }

    public PushMsgType getMsgType() {
        return msgType;
    }

    public void setMsgType(PushMsgType msgType) {
        this.msgType = msgType;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public PushOrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(PushOrderType orderType) {
        this.orderType = orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
