package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.ChargingType;

/**
 * Created by Auser on 2016/9/26.
 */
public class AccountingBillOrderLine extends AbstractPersistable {

    //核算单Id
    private Long accountingBillOrderId;

    //结算单Id
    private Long settlementId;

    private String settlementNo;

    //结算方式
    private ChargingType type;

    //报价金额
    private Double quotationPrice;

    //减免金额
    private Double discount;

    //结算金额
    private Double settlementPrice;

    public Long getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Long settlementId) {
        this.settlementId = settlementId;
    }

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo;
    }

    public Long getAccountingBillOrderId() {
        return accountingBillOrderId;
    }

    public void setAccountingBillOrderId(Long accountingBillOrderId) {
        this.accountingBillOrderId = accountingBillOrderId;
    }

    public ChargingType getType() {
        return type;
    }

    public void setType(ChargingType type) {
        this.type = type;
    }

    public Double getQuotationPrice() {
        return quotationPrice;
    }

    public void setQuotationPrice(Double quotationPrice) {
        this.quotationPrice = quotationPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(Double settlementPrice) {
        this.settlementPrice = settlementPrice;
    }
}
