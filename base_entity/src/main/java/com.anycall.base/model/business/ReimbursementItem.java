package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.SkuType;

public class ReimbursementItem extends AbstractPersistable {

    private Long reimbursementId;

    //库存出库单号
    private String stockBillNo;

    private Long itemId;

    private String itemName;

    private String skuName;

    private String skuCode;

    private Double price;

    private Long quatity;

    //行成本总计
    private Double subtotal;

    public Long getQuatity() {
        return quatity;
    }

    public void setQuatity(Long quatity) {
        this.quatity = quatity;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Long getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(Long reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
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

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStockBillNo() {
        return stockBillNo;
    }

    public void setStockBillNo(String stockBillNo) {
        this.stockBillNo = stockBillNo;
    }
}
