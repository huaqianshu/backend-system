package com.anycall.base.model.business.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PaymentOrderSearchPageCondition extends QuickSearchOrgPageCondition {

    private List<Long> orgTreeIds;

    private String paymentOrderNo;

    private String creater;

    private String issuer;

    private String status;

    private Date createTime;

    private Date endTime;

    private String paymentOrderNoText;

    private Long staffId;

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }

    public String getPaymentOrderNoText() {
        return paymentOrderNoText;
    }

    public void setPaymentOrderNoText(String paymentOrderNoText) {
        this.paymentOrderNoText = paymentOrderNoText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PaymentOrderSearchPageCondition that = (PaymentOrderSearchPageCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(paymentOrderNo, that.paymentOrderNo) &&
                Objects.equals(creater, that.creater) &&
                Objects.equals(issuer, that.issuer) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(paymentOrderNoText, that.paymentOrderNoText) &&
                Objects.equals(staffId, that.staffId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orgTreeIds, paymentOrderNo, creater, issuer, status, createTime, endTime, paymentOrderNoText, staffId);
    }
}
