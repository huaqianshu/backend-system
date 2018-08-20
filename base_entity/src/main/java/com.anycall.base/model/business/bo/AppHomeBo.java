package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.CompanyBrand;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Auser on 2016/10/20.
 */
public class AppHomeBo implements Serializable {

    private static final long serialVersionUID = 5118578209700811480L;


    private int woAcceptableCount;
    private int woRepairableCount;
    private int otherTasksCount;
    private int arrivedShopCount;
    private WorkOrderBo repairableWorkOrder;
    private WorkOrderBo arrivedWorkOrder;
    private WorkOrderBo acceptableWorkOrder;

    public WorkOrderBo getAcceptableWorkOrder() {
        return acceptableWorkOrder;
    }

    public void setAcceptableWorkOrder(WorkOrderBo acceptableWorkOrder) {
        this.acceptableWorkOrder = acceptableWorkOrder;
    }

    public WorkOrderBo getArrivedWorkOrder() {
        return arrivedWorkOrder;
    }

    public void setArrivedWorkOrder(WorkOrderBo arrivedWorkOrder) {
        this.arrivedWorkOrder = arrivedWorkOrder;
    }

    public int getArrivedShopCount() {
        return arrivedShopCount;
    }

    public void setArrivedShopCount(int arrivedShopCount) {
        this.arrivedShopCount = arrivedShopCount;
    }

    private List<CompanyBrand> companyBrandList;

    public int getWoAcceptableCount() {
        return woAcceptableCount;
    }

    public void setWoAcceptableCount(int woAcceptableCount) {
        this.woAcceptableCount = woAcceptableCount;
    }

    public int getWoRepairableCount() {
        return woRepairableCount;
    }

    public void setWoRepairableCount(int woRepairableCount) {
        this.woRepairableCount = woRepairableCount;
    }

    public int getOtherTasksCount() {
        return otherTasksCount;
    }

    public void setOtherTasksCount(int otherTasksCount) {
        this.otherTasksCount = otherTasksCount;
    }

    public List<CompanyBrand> getCompanyBrandList() {
        return companyBrandList;
    }

    public void setCompanyBrandList(List<CompanyBrand> companyBrandList) {
        this.companyBrandList = companyBrandList;
    }

    public WorkOrderBo getRepairableWorkOrder() {
        return repairableWorkOrder;
    }

    public void setRepairableWorkOrder(WorkOrderBo repairableWorkOrder) {
        this.repairableWorkOrder = repairableWorkOrder;
    }
}
