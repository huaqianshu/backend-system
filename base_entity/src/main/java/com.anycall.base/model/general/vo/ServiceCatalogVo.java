package com.anycall.base.model.general.vo;

import com.anycall.base.model.general.ServiceCatalog;


public class ServiceCatalogVo extends ServiceCatalog {

    private String upCatalogType;

    private String upConfigurationType;

    private String upSlaDuration;

    private String upParentCode;

    private String upLevel;

    //导入行
    private long excelNum;

    //报错信息
    private String errorMessage;

    //四级目录的集合
    private  String allLevelCatalogName;

    public String getAllLevelCatalogName() {
        return allLevelCatalogName;
    }

    public void setAllLevelCatalogName(String allLevelCatalogName) {
        this.allLevelCatalogName = allLevelCatalogName;
    }

    public String getUpCatalogType() {
        return upCatalogType;
    }

    public void setUpCatalogType(String upCatalogType) {
        this.upCatalogType = upCatalogType;
    }

    public String getUpConfigurationType() {
        return upConfigurationType;
    }

    public void setUpConfigurationType(String upConfigurationType) {
        this.upConfigurationType = upConfigurationType;
    }

    public String getUpSlaDuration() {
        return upSlaDuration;
    }

    public void setUpSlaDuration(String upSlaDuration) {
        this.upSlaDuration = upSlaDuration;
    }

    public String getUpParentCode() {
        return upParentCode;
    }

    public void setUpParentCode(String upParentCode) {
        this.upParentCode = upParentCode;
    }

    public String getUpLevel() {
        return upLevel;
    }

    public void setUpLevel(String upLevel) {
        this.upLevel = upLevel;
    }

    public long getExcelNum() {
        return excelNum;
    }

    public void setExcelNum(long excelNum) {
        this.excelNum = excelNum;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
