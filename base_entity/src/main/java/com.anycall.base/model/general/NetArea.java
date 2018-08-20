package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.Objects;

/**
 * Created by admin on 2016/8/18.
 */
public class NetArea extends AbstractPersistable{

    private static final long serialVersionUID = 8057161511657696646L;

    //网格名称
    private String netAreaName;
    //调度人
    private String dispatcherIds;

    private String workerIds;

    private String netAreaCode;
    //顶级组织
    private Long rootOrgId;

    private Boolean enabled = true;

    //是否已删除
    @JsonIgnore
    private boolean deleted = false;

    private String updater;

    private Date updateTime;

    public String getNetAreaName() {
        return netAreaName;
    }

    public void setNetAreaName(String netAreaName) {
        this.netAreaName = netAreaName;
    }

    public String getDispatcherIds() {
        return dispatcherIds;
    }

    public void setDispatcherIds(String dispatcherIds) {
        this.dispatcherIds = dispatcherIds;
    }

    public String getWorkerIds() {
        return workerIds;
    }

    public void setWorkerIds(String workerIds) {
        this.workerIds = workerIds;
    }

    public String getNetAreaCode() {
        return netAreaCode;
    }

    public void setNetAreaCode(String netAreaCode) {
        this.netAreaCode = netAreaCode;
    }

    public Long getRootOrgId() {
        return rootOrgId;
    }

    public void setRootOrgId(Long rootOrgId) {
        this.rootOrgId = rootOrgId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
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
