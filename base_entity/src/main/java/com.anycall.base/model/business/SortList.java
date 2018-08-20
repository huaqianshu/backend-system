package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by hachi on 16/7/25.
 */
public class SortList extends AbstractPersistable {
    private static final long serialVersionUID = 8183509088042001123L;
    //分拣单号
    private String sortNo;
    private  String repairCode;
    private  Long companyBrandId;
    private  String shopCode;
    private  String systemNumCode;
    private  RepairSource repairSource = RepairSource.OTHERSYSTEM;
    private  String faultDescription;
    private  SortListStatus status = SortListStatus.UNHANDLE;
    private Date reportTime;
    private Date createTime;
    private Date updateTime;
    private String updater;
    //拒接原因
    private String rejectReason;
    //报修人和电话
    private String reportMan;
    private String reportManTel;

    public String getSortNo() {
        return sortNo;
    }

    public void setSortNo(String sortNo) {
        this.sortNo = sortNo;
    }

    public String getRepairCode() {
        return repairCode;
    }

    public void setRepairCode(String repairCode) {
        this.repairCode = repairCode;
    }

    public Long getCompanyBrandId() {
        return companyBrandId;
    }

    public void setCompanyBrandId(Long companyBrandId) {
        this.companyBrandId = companyBrandId;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getSystemNumCode() {
        return systemNumCode;
    }

    public void setSystemNumCode(String systemNumCode) {
        this.systemNumCode = systemNumCode;
    }

    public RepairSource getRepairSource() {
        return repairSource;
    }

    public void setRepairSource(RepairSource repairSource) {
        this.repairSource = repairSource;
    }

    public String getFaultDescription() {
        return faultDescription;
    }

    public void setFaultDescription(String faultDescription) {
        this.faultDescription = faultDescription;
    }

    public SortListStatus getStatus() {
        return status;
    }

    public void setStatus(SortListStatus status) {
        this.status = status;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getReportMan() {
        return reportMan;
    }

    public void setReportMan(String reportMan) {
        this.reportMan = reportMan;
    }

    public String getReportManTel() {
        return reportManTel;
    }

    public void setReportManTel(String reportManTel) {
        this.reportManTel = reportManTel;
    }
}
