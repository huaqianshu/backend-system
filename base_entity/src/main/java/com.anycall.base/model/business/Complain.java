package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Robin on 16/8/30.
 */
public class Complain extends AbstractPersistable {

    private static final long serialVersionUID = -891591910462902680L;

    private String complainNo;
    private String complainMan;
    private String complainManTel;
    private String complainContent;
    private String serviceOrderNo;

    private String replyMan;
    private Long replyManId;
    private String replyContent;
    private String shopCode;
    private ComplainStatus status = ComplainStatus.COMPLAINED;
    private String memo;

    private Date createTime;
    private Date updateTime;
    private String updater;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public String getComplainNo() {
        return complainNo;
    }

    public void setComplainNo(String complainNo) {
        this.complainNo = complainNo;
    }

    public String getComplainMan() {
        return complainMan;
    }

    public void setComplainMan(String complainMan) {
        this.complainMan = complainMan;
    }

    public String getComplainManTel() {
        return complainManTel;
    }

    public void setComplainManTel(String complainManTel) {
        this.complainManTel = complainManTel;
    }

    public String getComplainContent() {
        return complainContent;
    }

    public void setComplainContent(String complainContent) {
        this.complainContent = complainContent;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public String getReplyMan() {
        return replyMan;
    }

    public void setReplyMan(String replyMan) {
        this.replyMan = replyMan;
    }

    public Long getReplyManId() {
        return replyManId;
    }

    public void setReplyManId(Long replyManId) {
        this.replyManId = replyManId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public ComplainStatus getStatus() {
        return status;
    }

    public void setStatus(ComplainStatus status) {
        this.status = status;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

}
