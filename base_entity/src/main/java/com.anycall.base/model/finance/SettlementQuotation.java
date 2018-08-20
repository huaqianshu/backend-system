package com.anycall.base.model.finance;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by zheng on 2016/9/26.
 */
public class SettlementQuotation extends AbstractPersistable {
    private static final long serialVersionUID = -925427522463323059L;
    //    编号
    private String settlementNo;
    private String title;
    private Long orgId;
    private Long companyId;
    private Long brandId;
    private Long approver;
    //    类型
    private SettlementQuotationType type;
    //    状态（草稿->已初审->已复审->已结算） 创建为草稿，审核过后为已初审，审核发给客户为已复审，客户给钱为已结算，未给钱驳回返回到草稿
    private SettlementQuotationStatus status;
    //    结算完成时间
    private Date settlementTime;
    //    报价金额
    private Double quotationPrice;
    //    审批金额
    private Double approvedPrice;
    //    结算金额
    private Double settlementPrice;
    private String updater;
    private Date updateTime;
    private String creator;
    private Date createTime;
    //退回原因
    private String rejectReason;

    //前一次结算数据
    private String lastSettlementData;

    //前一次审批数据
    private String lastApprovalData;

    public String getSettlementNo() {
        return settlementNo;
    }

    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getApprover() {
        return approver;
    }

    public void setApprover(Long approver) {
        this.approver = approver;
    }

    public SettlementQuotationType getType() {
        return type;
    }

    public void setType(SettlementQuotationType type) {
        this.type = type;
    }

    public SettlementQuotationStatus getStatus() {
        return status;
    }

    public void setStatus(SettlementQuotationStatus status) {
        this.status = status;
    }

    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
    }

    public Double getQuotationPrice() {
        return quotationPrice;
    }

    public void setQuotationPrice(Double quotationPrice) {
        this.quotationPrice = quotationPrice;
    }

    public Double getApprovedPrice() {
        return approvedPrice;
    }

    public void setApprovedPrice(Double approvedPrice) {
        this.approvedPrice = approvedPrice;
    }

    public Double getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(Double settlementPrice) {
        this.settlementPrice = settlementPrice;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getLastSettlementData() {
        return lastSettlementData;
    }

    public void setLastSettlementData(String lastSettlementData) {
        this.lastSettlementData = lastSettlementData;
    }

    public String getLastApprovalData() {
        return lastApprovalData;
    }

    public void setLastApprovalData(String lastApprovalData) {
        this.lastApprovalData = lastApprovalData;
    }
}
