package com.anycall.base.excelexport.general;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.business.ServiceOrderType;
import com.anycall.base.model.general.CatalogType;

/**
 * Created by fh on 2017/11/10.
 */
public class ServiceCatalogExport extends AbstractPersistable {

    private static final long serialVersionUID = -5388401851460541583L;

    private String oneLevelCatalogName;

    private String twoLevelCatalogName;

    private String threeLevelCatalogName;

    private String fourLevelCatalogName;

    private String fiveLevelCatalogName;

    private CatalogType catalogType;

    private ServiceOrderType configurationType;

    private Double slaDuration;

    private String unit;

    private String memo;

    private String fiveLevelCatalogCode;

    private Long row;

    public String getOneLevelCatalogName() {
        return oneLevelCatalogName;
    }

    public void setOneLevelCatalogName(String oneLevelCatalogName) {
        this.oneLevelCatalogName = oneLevelCatalogName;
    }

    public String getTwoLevelCatalogName() {
        return twoLevelCatalogName;
    }

    public void setTwoLevelCatalogName(String twoLevelCatalogName) {
        this.twoLevelCatalogName = twoLevelCatalogName;
    }

    public String getThreeLevelCatalogName() {
        return threeLevelCatalogName;
    }

    public void setThreeLevelCatalogName(String threeLevelCatalogName) {
        this.threeLevelCatalogName = threeLevelCatalogName;
    }

    public String getFourLevelCatalogName() {
        return fourLevelCatalogName;
    }

    public void setFourLevelCatalogName(String fourLevelCatalogName) {
        this.fourLevelCatalogName = fourLevelCatalogName;
    }

    public String getFiveLevelCatalogName() {
        return fiveLevelCatalogName;
    }

    public void setFiveLevelCatalogName(String fiveLevelCatalogName) {
        this.fiveLevelCatalogName = fiveLevelCatalogName;
    }

    public CatalogType getCatalogType() {
        return catalogType;
    }

    public void setCatalogType(CatalogType catalogType) {
        this.catalogType = catalogType;
    }

    public ServiceOrderType getConfigurationType() {
        return configurationType;
    }

    public void setConfigurationType(ServiceOrderType configurationType) {
        this.configurationType = configurationType;
    }

    public Double getSlaDuration() {
        return slaDuration;
    }

    public void setSlaDuration(Double slaDuration) {
        this.slaDuration = slaDuration;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Long getRow() {
        return row;
    }

    public void setRow(Long row) {
        this.row = row;
    }

    public String getFiveLevelCatalogCode() {
        return fiveLevelCatalogCode;
    }

    public void setFiveLevelCatalogCode(String fiveLevelCatalogCode) {
        this.fiveLevelCatalogCode = fiveLevelCatalogCode;
    }
}
