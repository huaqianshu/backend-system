package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

public class Warehouse extends AbstractPersistable {


    private static final long serialVersionUID = 5827555759907393541L;
    //仓库名称
    private String warehouseName;

    //仓库编码
    private String warehouseCode;

    //仓库地址
    private String address;

    //描述
    private String memo;
    //是否可用
    private Boolean enabled = false;

    //是否已删除
    private Boolean deleted = false;

    //创建时间
    private Date createTime;

    //最后修改人
    private String updater;

    //修改时间
    private Date updateTime;

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
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
}
