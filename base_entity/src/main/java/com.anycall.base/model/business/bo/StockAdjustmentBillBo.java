package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.StockAdjustmentBill;
import com.anycall.base.model.business.StockAdjustmentItem;

import java.util.List;

/**
 * Created by Amy on 2016/12/23.
 */
public class StockAdjustmentBillBo extends StockAdjustmentBill {

    private static final long serialVersionUID = -3286900365748413370L;

    private String logisticsName;

    private String statusContent;
    private String skuCode;
    private String itemCode;
    private String itemName;
    private String supName;
    private String warehouseName;

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private List<StockAdjustmentItemBo> lines;

    public String getLogisticsName() {
        return logisticsName;
    }

    public void setLogisticsName(String logisticsName) {
        this.logisticsName = logisticsName;
    }

    public List<StockAdjustmentItemBo> getLines() {
        return lines;
    }

    public void setLines(List<StockAdjustmentItemBo> lines) {
        this.lines = lines;
    }

    public String getStatusContent() {
        return statusContent;
    }

    public void setStatusContent(String statusContent) {
        this.statusContent = statusContent;
    }
}
