package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.StockAdjustmentItem;

/**
 * Created by Amy on 2016/12/27.
 */
public class StockAdjustmentItemBo extends StockAdjustmentItem {
    private static final long serialVersionUID = 7273921789606147657L;

    private String itemName;

    private String itemCode;

    private String skuCode;

    private Long skuId;

    private String stockBillNo;

    private String  workOrderCode;

    private String logisticsName;

    private String logisticsBillCode;

    private Double taxRate;

    private String skuMemo;

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    private String skuName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public String getStockBillNo() {
        return stockBillNo;
    }

    public void setStockBillNo(String stockBillNo) {
        this.stockBillNo = stockBillNo;
    }

    public String getWorkOrderCode() {
        return workOrderCode;
    }

    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
    }

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public String getLogisticsBillCode() {
        return logisticsBillCode;
    }

    public void setLogisticsBillCode(String logisticsBillCode) {
        this.logisticsBillCode = logisticsBillCode;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public String getSkuMemo() {
        return skuMemo;
    }

    public void setSkuMemo(String skuMemo) {
        this.skuMemo = skuMemo;
    }
}
