package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.vo.SortListVo;

import java.util.List;


public class SortListBo extends SortListVo {
    private static final long serialVersionUID = 8148280535350326908L;
    private String brandName;
    private String shopName;
    //用于门店分组
    private int sortListSize;
    private List<String> repairCodes;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getSortListSize() {
        return sortListSize;
    }

    public void setSortListSize(int sortListSize) {
        this.sortListSize = sortListSize;
    }

    public List<String> getRepairCodes() {
        return repairCodes;
    }

    public void setRepairCodes(List<String> repairCodes) {
        this.repairCodes = repairCodes;
    }
}
