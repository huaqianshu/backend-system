package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.Region;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Suppliers extends AbstractPersistable {


    private static final long serialVersionUID = -8811964543841555816L;

    //供应商名称
    private String supName;

    //供应商编码
    private String supCode;

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

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode;
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
