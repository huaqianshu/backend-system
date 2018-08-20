package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by Amy on 2016/12/22.
 */
public class StockAdjustmentItem extends AbstractPersistable {

    private static final long serialVersionUID = 1580331013860555686L;

    //库存调整单ID
    private Long stockAdjustBillId;

    //库存ID
    private Long stockId;

    //调整数量
    private Integer adjustNum;

    //成本单价
    private Double price;

    //行成本总计
    private Double money;

    //备注
    private String memo;

    public Long getStockAdjustBillId() {
        return stockAdjustBillId;
    }

    public void setStockAdjustBillId(Long stockAdjustBillId) {
        this.stockAdjustBillId = stockAdjustBillId;
    }

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public Integer getAdjustNum() {
        return adjustNum;
    }

    public void setAdjustNum(Integer adjustNum) {
        this.adjustNum = adjustNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
