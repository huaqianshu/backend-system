package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.business.ServiceOrderType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * Created by .
 */
public class ServiceCatalog extends AbstractPersistable {


    private static final long serialVersionUID = -4412445402470383550L;

    //父节点
    private Long parentId = 0L;

    //类目名称
    private String catalogName;

    //类目编码
    private String catalogCode;

    //属性
    private CatalogType catalogType = CatalogType.STANDARD;
    //配置类型
    private ServiceOrderType configurationType;
    //SLA服务时长
    private Double slaDuration;

    //描述
    private String memo;

    //层级1,2,3,4,5
    private Integer level;

    //是否叶子节点
    private Boolean leaf=false;

    //是否生效
    private Boolean takeEffect = false;

    private String updater;

    private Date updateTime;

    //是否已删除
    @JsonIgnore
    private boolean deleted = false;
    //优衣库单位
    private String unit;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public CatalogType getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(CatalogType catalogType) {
        this.catalogType = catalogType;
    }

    public Double getSlaDuration() {
        return slaDuration;
    }

    public void setSlaDuration(Double slaDuration) {
        this.slaDuration = slaDuration;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Boolean getTakeEffect() {
        return takeEffect;
    }

    public void setTakeEffect(Boolean takeEffect) {
        this.takeEffect = takeEffect;
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

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public ServiceOrderType getConfigurationType() {
        return configurationType;
    }

    public void setConfigurationType(ServiceOrderType configurationType) {
        this.configurationType = configurationType;
    }
}
