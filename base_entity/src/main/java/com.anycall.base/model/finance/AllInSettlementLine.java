package com.anycall.base.model.finance;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Auser on 2016/9/26.
 */
public class AllInSettlementLine extends AbstractPersistable {

    private static final long serialVersionUID = -9149134236602078436L;

    private Long allInSettlementId;

    private Long serviceOrderId;

    private String serviceOrderNo;

    private String reportMan;

    private String reportManTel;

    private String catalogCode;

    private String desc;

    private String bigCatalogName;

    private String childCatalogName;

    private String brandArea;

    private String failure;

    //第一次到场(签到)时间
    private Date firstStartTime;

    //服务单完成时间
    private Date finishTime;

    private SettlementWay settlementWay;

    public Long getAllInSettlementId() {
        return allInSettlementId;
    }

    public void setAllInSettlementId(Long allInSettlementId) {
        this.allInSettlementId = allInSettlementId;
    }

    public Long getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Long serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
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

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public String getBrandArea() {
        return brandArea;
    }

    public void setBrandArea(String brandArea) {
        this.brandArea = brandArea;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

    public Date getFirstStartTime() {
        return firstStartTime;
    }

    public void setFirstStartTime(Date firstStartTime) {
        this.firstStartTime = firstStartTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public SettlementWay getSettlementWay() {
        return settlementWay;
    }

    public void setSettlementWay(SettlementWay settlementWay) {
        this.settlementWay = settlementWay;
    }
}
