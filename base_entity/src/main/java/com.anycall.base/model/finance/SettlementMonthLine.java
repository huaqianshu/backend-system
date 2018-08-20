package com.anycall.base.model.finance;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.ChargingType;

import java.util.Date;

/**
 * Created by zheng on 2016/9/26.
 */
public class SettlementMonthLine extends AbstractPersistable {
    private static final long serialVersionUID = 1291922554827378777L;

    private Long settlementId;
    //      报价单Id
    private Long quotationOrderId;
    //    统包结算Id
    private Long allinSettlementId;
    //    所属年份
    private Integer year;
    //    所属月份1-12
    private Integer month;
    //    所属门店
    private String shopCode;
    //    类型
    private ChargingType type;
    //    报价金额
    private Double quotationPrice;
    //    减免金额
    private Double discount;
    //    结算金额
    private Double settlementPrice;

    public Long getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Long settlementId) {
        this.settlementId = settlementId;
    }

    public Long getQuotationOrderId() {
        return quotationOrderId;
    }

    public void setQuotationOrderId(Long quotationOrderId) {
        this.quotationOrderId = quotationOrderId;
    }

    public Long getAllinSettlementId() {
        return allinSettlementId;
    }

    public void setAllinSettlementId(Long allinSettlementId) {
        this.allinSettlementId = allinSettlementId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
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
