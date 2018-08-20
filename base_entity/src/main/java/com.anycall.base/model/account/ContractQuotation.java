package com.anycall.base.model.account;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Auser on 2016/8/16.
 */
public class ContractQuotation extends AbstractPersistable {

    private static final long serialVersionUID = -1817563486638596214L;

    private Long contractId;

    private Long itemId;

    private String itemName;
    /**
     * 人工/物料,human,material
     */
    private SkuType skuType;

    private String skuName;

    private String skuCode;

    private Double price;

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
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

    public SkuType getSkuType() {
        return skuType;
    }

    public void setSkuType(SkuType skuType) {
        this.skuType = skuType;
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
}
