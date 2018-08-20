package com.anycall.base.model.push;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

public class Smslog extends AbstractPersistable {

    private static final long serialVersionUID = 1722583221452248094L;

    private String toaccount;

    private String msgtitle;

    private String msgmodel;

    private String ordertype;

    private String orderno;

    private String status;

    private String result;

    private String memo;

    private String operator;

    private Date createtime;


    public String getToaccount() {
        return toaccount;
    }

    public void setToaccount(String toaccount) {
        this.toaccount = toaccount == null ? null : toaccount.trim();
    }

    public String getMsgtitle() {
        return msgtitle;
    }

    public void setMsgtitle(String msgtitle) {
        this.msgtitle = msgtitle == null ? null : msgtitle.trim();
    }

    public String getMsgmodel() {
        return msgmodel;
    }

    public void setMsgmodel(String msgmodel) {
        this.msgmodel = msgmodel == null ? null : msgmodel.trim();
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype == null ? null : ordertype.trim();
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}