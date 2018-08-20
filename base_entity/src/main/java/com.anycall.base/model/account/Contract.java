package com.anycall.base.model.account;

import com.anycall.base.model.AbstractPersistable;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * Created by Auser on 2016/8/16.
 */
public class Contract extends AbstractPersistable {

    private static final long serialVersionUID = -1616087159328158545L;

    private String contractCode;

    private String contractName;

    private Date startTime;

    private Date endTime;

    private ContractStatus contractState = ContractStatus.UNAPPROVED;

    private Long companyId;

    private Long supplierOrgId;

    private ServiceType serviceType;

    /**
     * 计费方式：根据合约下的门店中服务类型
     */
    private ChargingType chargingType;

    private Integer shopsCount;

    @JsonIgnore
    private boolean deleted = false;

    private String memo;

    private String updater;

    private Date updateTime;

    private String creator;

    private Date createTime;

    private String approver;

    private Date approveTime;

    //统包结算日期
    private Integer allInSettlementDay;

    //是否虚拟服务商
    private Boolean isVirtual = false;
    //是否使用合并报价
    private Boolean useMergerQuote = false;

    public Boolean getVirtual() {
        return isVirtual;
    }

    public void setVirtual(Boolean virtual) {
        isVirtual = virtual;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }


    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public ContractStatus getContractState() {
        return contractState;
    }

    public void setContractState(ContractStatus contractState) {
        this.contractState = contractState;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getSupplierOrgId() {
        return supplierOrgId;
    }

    public void setSupplierOrgId(Long supplierOrgId) {
        this.supplierOrgId = supplierOrgId;
    }

    public ChargingType getChargingType() {
        return chargingType;
    }

    public void setChargingType(ChargingType chargingType) {
        this.chargingType = chargingType;
    }

    public Integer getShopsCount() {
        return shopsCount;
    }

    public void setShopsCount(Integer shopsCount) {
        this.shopsCount = shopsCount;
    }

    public boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
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

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public Integer getAllInSettlementDay() {
        return allInSettlementDay;
    }

    public void setAllInSettlementDay(Integer allInSettlementDay) {
        this.allInSettlementDay = allInSettlementDay;
    }

    public Boolean getUseMergerQuote() {
        return useMergerQuote;
    }

    public void setUseMergerQuote(Boolean useMergerQuote) {
        this.useMergerQuote = useMergerQuote;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
