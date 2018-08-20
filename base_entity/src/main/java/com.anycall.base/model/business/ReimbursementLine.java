package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

public class ReimbursementLine extends AbstractPersistable {

    private Long reimbursementId;

    //类别
    private ReimburseLineStatus type;

    private String itemName;

    private String skuName;

    private Double price;

    private Double quatity;

    //小计
    private Double subtotal;

    private String skuCode;

    //初审扣款金额
    private Double approveDiscount;

    //初审扣款后金额
    private Double approvedDiscount;

    //初审扣款原因
    private String approvedDiscountReasion;

    //复审扣款金额
    private Double reApproveDiscount;

    //复审扣款后金额
    private Double reApprovedDiscount;

    //复审扣款原因
    private String reApprovedDiscountReasion;

    //支付增减金额
    private Double paymentChangesPrice;

    //支付增减原因
    private String paymentChangesCause;

    //支付金额
    private Double paymentPrice;

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public Long getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(Long reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public ReimburseLineStatus getType() {
        return type;
    }

    public void setType(ReimburseLineStatus type) {
        this.type = type;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuatity() {
        return quatity;
    }

    public void setQuatity(Double quatity) {
        this.quatity = quatity;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getApproveDiscount() {
        return approveDiscount;
    }

    public void setApproveDiscount(Double approveDiscount) {
        this.approveDiscount = approveDiscount;
    }

    public Double getApprovedDiscount() {
        return approvedDiscount;
    }

    public void setApprovedDiscount(Double approvedDiscount) {
        this.approvedDiscount = approvedDiscount;
    }

    public String getApprovedDiscountReasion() {
        return approvedDiscountReasion;
    }

    public void setApprovedDiscountReasion(String approvedDiscountReasion) {
        this.approvedDiscountReasion = approvedDiscountReasion;
    }

    public Double getReApproveDiscount() {
        return reApproveDiscount;
    }

    public void setReApproveDiscount(Double reApproveDiscount) {
        this.reApproveDiscount = reApproveDiscount;
    }

    public Double getReApprovedDiscount() {
        return reApprovedDiscount;
    }

    public void setReApprovedDiscount(Double reApprovedDiscount) {
        this.reApprovedDiscount = reApprovedDiscount;
    }

    public String getReApprovedDiscountReasion() {
        return reApprovedDiscountReasion;
    }

    public void setReApprovedDiscountReasion(String reApprovedDiscountReasion) {
        this.reApprovedDiscountReasion = reApprovedDiscountReasion;
    }

    public Double getPaymentChangesPrice() {
        return paymentChangesPrice;
    }

    public void setPaymentChangesPrice(Double paymentChangesPrice) {
        this.paymentChangesPrice = paymentChangesPrice;
    }

    public String getPaymentChangesCause() {
        return paymentChangesCause;
    }

    public void setPaymentChangesCause(String paymentChangesCause) {
        this.paymentChangesCause = paymentChangesCause;
    }

    public Double getPaymentPrice() {
        return paymentPrice;
    }

    public void setPaymentPrice(Double paymentPrice) {
        this.paymentPrice = paymentPrice;
    }
}
