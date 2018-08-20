package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by Amy on 2016/12/22.
 */
public class StockAdjustmentBill extends AbstractPersistable {

    private static final long serialVersionUID = -976128167671483508L;

    //库存单号
    private String stockBillNo;

    //工单ID
    private Long workOrderId;

    //工单Code
    private String workOrderCode;

    //物流公司ID
    private Long logisticsId;

    //快递单号
    private String logisticsBillCode;

    //发货状态
    private DeliveryStatus deliveryStatus;

    //数量总计
    private Integer totalNum;

    //成本总计
    private Double totalMoney;

    //调整人
    private String creator;

    //生成时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss Z")
    private Date createTime;

    //更新人
    private String updater;

    //更新时间
    private Date updateTime;

    //供应商id
    private Long suppliersId;

    //出库仓库id
    private Long warehouseId;

    public String getStockBillNo() {
        return stockBillNo;
    }

    public void setStockBillNo(String stockBillNo) {
        this.stockBillNo = stockBillNo;
    }

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getWorkOrderCode() {
        return workOrderCode;
    }

    public void setWorkOrderCode(String workOrderCode) {
        this.workOrderCode = workOrderCode;
    }

    public Long getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getLogisticsBillCode() {
        return logisticsBillCode;
    }

    public void setLogisticsBillCode(String logisticsBillCode) {
        this.logisticsBillCode = logisticsBillCode;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Long suppliersId) {
        this.suppliersId = suppliersId;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }
}
