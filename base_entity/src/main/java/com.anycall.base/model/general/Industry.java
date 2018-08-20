package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * Created by admin on 2016/7/29.
 */
public class Industry extends AbstractPersistable{

    private static final long serialVersionUID = -636495235040026334L;

    //行业名称
    private String industryName;

    private Boolean enabled = true;
    //是否已删除
    @JsonIgnore
    private boolean deleted = false;
    private String updater;
    private Date updateTime;

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName;
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
