package com.anycall.base.model.business.bo;

import com.anycall.base.model.AbstractPersistable;

import java.util.List;


public class ReimbursementRroupPayeeBo extends AbstractPersistable {

    private String payeeName;
    private String payeeCardNum;
    private String payeeBankName;
    private Integer payeeId;
    private Integer orderQuantity;

    private Double reimburseAmout;

    private Double paymentPrice;
    private String payeeCity;
    private String payeeNameAndCity;
    List<ReimbursementBo> reimbursementBoList;

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Double getReimburseAmout() {
        return reimburseAmout;
    }

    public void setReimburseAmout(Double reimburseAmout) {
        this.reimburseAmout = reimburseAmout;
    }

    public List<ReimbursementBo> getReimbursementBoList() {
        return reimbursementBoList;
    }

    public void setReimbursementBoList(List<ReimbursementBo> reimbursementBoList) {
        this.reimbursementBoList = reimbursementBoList;
    }

    public Double getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentPrice(Double paymentPrice) {
        this.paymentPrice = paymentPrice;
    }

    public Integer getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(Integer payeeId) {
        this.payeeId = payeeId;
    }

    public String getPayeeCardNum() {
        return payeeCardNum;
    }

    public void setPayeeCardNum(String payeeCardNum) {
        this.payeeCardNum = payeeCardNum;
    }

    public String getPayeeBankName() {
        return payeeBankName;
    }

    public void setPayeeBankName(String payeeBankName) {
        this.payeeBankName = payeeBankName;
    }

    public String getPayeeCity() {
        return payeeCity;
    }

    public void setPayeeCity(String payeeCity) {
        this.payeeCity = payeeCity;
    }

    public String getPayeeNameAndCity() {
        return payeeNameAndCity;
    }

    public void setPayeeNameAndCity(String payeeNameAndCity) {
        this.payeeNameAndCity = payeeNameAndCity;
    }
}
