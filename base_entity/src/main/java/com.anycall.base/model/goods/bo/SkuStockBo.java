package com.anycall.base.model.goods.bo;

import com.anycall.base.model.goods.SkuStock;

/**
 * Created by Amy on 2016/12/23.
 */
public class SkuStockBo extends SkuStock {

    private static final long serialVersionUID = -1563917441677282010L;

    private String skuCode;

    private String itemName;

    private String itemCode;

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

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
}
