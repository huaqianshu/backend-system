package com.anycall.base.model.business.vo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.ContractServiceCatalogType;
import com.anycall.base.model.business.ServiceOrderType;
import com.anycall.base.model.business.UrgencyType;
import com.anycall.base.model.general.ServiceCatalogLevel;

import java.util.Date;
import java.util.List;

/**
 * Created by Robin on 16/8/30.
 */
public class ServiceOrderLineVo extends AbstractPersistable {

    private static final long serialVersionUID = 5778710126007420166L;

    private ServiceOrderType serviceOrderType=ServiceOrderType.REPAIR;

    private String thirdLevelCatalogCode;

    private String catalogCode;

    private String desc;

    private String bigCatalogName;

    private String childCatalogName;

    private String brandArea;

    private String failure;

    private Double slaDuration;

    private ServiceCatalogLevel slaLevel=ServiceCatalogLevel.P6;

    private ContractServiceCatalogType contractServiceCatalogType=ContractServiceCatalogType.DAILY;

    private Date arriveTime;

    private String catalogMemo;
    //以下五个字段用于平台开单
    private  Long supplierId;
    private  Long contractId;
    private String supplierName;
    private  String contractName;
    //紧急类型，//预算报价/即刻报修/正常
    private UrgencyType urgencyType;
    private String contractCode;
    private boolean allin;
    private Date requireFinishTime;
    //用于优衣库
    private Integer count;
    private String unit;
    private List<String> selfieImgs;
    private String qualityEndTime;
    private Boolean doWithoutApply;

    //维修方案编码
    private String catalogLevelFiveCode;
    //维修方案
    private String catalogLevelFiveName;
    //报修时间
    private Date reportTime;

    public UrgencyType getUrgencyType() {
        return urgencyType;
    }

    public void setUrgencyType(UrgencyType urgencyType) {
        this.urgencyType = urgencyType;
    }

    public String getQualityEndTime() {
        return qualityEndTime;
    }

    public void setQualityEndTime(String qualityEndTime) {
        this.qualityEndTime = qualityEndTime;
    }

    public Boolean getDoWithoutApply() {
        return doWithoutApply;
    }

    public void setDoWithoutApply(Boolean doWithoutApply) {
        this.doWithoutApply = doWithoutApply;
    }

    public List<String> getSelfieImgs() {
        return selfieImgs;
    }

    public void setSelfieImgs(List<String> selfieImgs) {
        this.selfieImgs = selfieImgs;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public boolean isAllin() {
        return allin;
    }

    public void setAllin(boolean allin) {
        this.allin = allin;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ServiceOrderType getServiceOrderType() {
        return serviceOrderType;
    }

    public void setServiceOrderType(ServiceOrderType serviceOrderType) {
        this.serviceOrderType = serviceOrderType;
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

    public Double getSlaDuration() {
        return slaDuration;
    }

    public void setSlaDuration(Double slaDuration) {
        this.slaDuration = slaDuration;
    }

    public ServiceCatalogLevel getSlaLevel() {
        return slaLevel;
    }

    public void setSlaLevel(ServiceCatalogLevel slaLevel) {
        this.slaLevel = slaLevel;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getCatalogMemo() {
        return catalogMemo;
    }

    public void setCatalogMemo(String catalogMemo) {
        this.catalogMemo = catalogMemo;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public ContractServiceCatalogType getContractServiceCatalogType() {
        return contractServiceCatalogType;
    }

    public void setContractServiceCatalogType(ContractServiceCatalogType contractServiceCatalogType) {
        this.contractServiceCatalogType = contractServiceCatalogType;
    }

    public Date getRequireFinishTime() {
        return requireFinishTime;
    }

    public void setRequireFinishTime(Date requireFinishTime) {
        this.requireFinishTime = requireFinishTime;
    }

    public String getThirdLevelCatalogCode() {
        return thirdLevelCatalogCode;
    }

    public void setThirdLevelCatalogCode(String thirdLevelCatalogCode) {
        this.thirdLevelCatalogCode = thirdLevelCatalogCode;
    }

    public String getCatalogLevelFiveCode() {
        return catalogLevelFiveCode;
    }

    public void setCatalogLevelFiveCode(String catalogLevelFiveCode) {
        this.catalogLevelFiveCode = catalogLevelFiveCode;
    }

    public String getCatalogLevelFiveName() {
        return catalogLevelFiveName;
    }

    public void setCatalogLevelFiveName(String catalogLevelFiveName) {
        this.catalogLevelFiveName = catalogLevelFiveName;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }
}
