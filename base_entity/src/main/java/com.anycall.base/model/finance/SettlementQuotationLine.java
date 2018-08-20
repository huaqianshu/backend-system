package com.anycall.base.model.finance;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.business.UrgencyType;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;


/**
 * Created by zheng on 2016/9/26.
 */
public class SettlementQuotationLine extends AbstractPersistable {
    private static final long serialVersionUID = 4714789536089082698L;

    private static DecimalFormat decimalFormat = new DecimalFormat("######0.00");
    private Long settlementQuotationId;
    //      报价单Id
    private Long quotationOrderId;
    private Long serviceOrderId;
    private Long companyId;
    private Long brandId;
    private Long orgId;
    //    类型
    private UrgencyType type;
    //    所属年份
    private Integer year;
    //    所属月份1-12
    private Integer month;
    //    所属门店
    private String shopCode;
    //    报价金额
    private Double quotationPrice;
    //    审批金额
    private Double approvedPrice;
    //    结算金额
    private Double settlementPrice;
    //    减免原因
    private String memo;

    private String updater;
    private Date updateTime;

    //前一次结算数据
    private String lastSettlementData;

    //前一次审批数据
    private String lastApprovalData;

    public Long getSettlementQuotationId() {
        return settlementQuotationId;
    }

    public void setSettlementQuotationId(Long settlementQuotationId) {
        this.settlementQuotationId = settlementQuotationId;
    }

    public Long getQuotationOrderId() {
        return quotationOrderId;
    }

    public void setQuotationOrderId(Long quotationOrderId) {
        this.quotationOrderId = quotationOrderId;
    }

    public Long getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Long serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
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

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public UrgencyType getType() {
        return type;
    }

    public void setType(UrgencyType type) {
        this.type = type;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Double getQuotationPrice() {
        return quotationPrice==null?0d:quotationPrice;
    }

    public void setQuotationPrice(Double quotationPrice) {
        if (quotationPrice == null) {
            this.quotationPrice = 0d;
        } else {
            this.quotationPrice = new BigDecimal(quotationPrice).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
    }

    public Double getApprovedPrice() {
        return approvedPrice;
    }

    public void setApprovedPrice(Double approvedPrice) {
        if (approvedPrice == null) {
            this.approvedPrice = 0d;
        } else {
            this.approvedPrice = new BigDecimal(approvedPrice).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
    }

    public Double getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(Double settlementPrice) {
        if (settlementPrice == null) {
            this.settlementPrice = 0d;
        } else {
            this.settlementPrice = new BigDecimal(settlementPrice).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        }
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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
