package com.anycall.base.model.business.bo;


import java.io.Serializable;

/**
 * Created by admin on 2016/7/29.
 */
public class SelectRepairBo implements Serializable {

    private static final long serialVersionUID = 13595820667131723L;

    private String bigCatalogName;
    private String childCatalogName;
    private Integer repairNum;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getBigCatalogName() {
        return bigCatalogName;
    }

    public void setBigCatalogName(String bigCatalogName) {
        this.bigCatalogName = bigCatalogName;
    }

    public String getChildCatalogName() {
        return childCatalogName;
    }

    public void setChildCatalogName(String childCatalogName) {
        this.childCatalogName = childCatalogName;
    }

    public Integer getRepairNum() {
        return repairNum;
    }

    public void setRepairNum(Integer repairNum) {
        this.repairNum = repairNum;
    }
}
