package com.anycall.base.model.finance;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.ChargingType;

import java.util.Date;

public class CustomInvoiceTitle extends AbstractPersistable {

    private static final long serialVersionUID = -2323103667295173789L;

    private Long companyId;

    private String invoiceTitleName;

    private ChargingType type;

    private Double taxRate;

    private boolean deleted = false;

    private String creator;

    private Date createTime;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getInvoiceTitleName() {
        return invoiceTitleName;
    }

    public void setInvoiceTitleName(String invoiceTitleName) {
        this.invoiceTitleName = invoiceTitleName;
    }

    public ChargingType getType() {
        return type;
    }

    public void setType(ChargingType type) {
        this.type = type;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
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
}
