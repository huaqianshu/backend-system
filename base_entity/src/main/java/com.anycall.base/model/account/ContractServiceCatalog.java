package com.anycall.base.model.account;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.business.ServiceOrderType;
import com.anycall.base.model.general.ServiceCatalogLevel;

import java.util.Date;

/**
 * Created by Auser on 2016/8/16.
 */
public class ContractServiceCatalog extends AbstractPersistable {
    private static final long serialVersionUID = -4151704348457435579L;
    private Long contractId;
    private Long serviceCatalogId;
    private ContractServiceCatalogType contractServiceCatalogType;
    private String catalogName;
    private String catalogCode;
    private ServiceCatalogLevel slaLevel = ServiceCatalogLevel.P1;
    private Double slaDuration;
    //配置类型
    private ServiceOrderType configurationType;
    //维修方案
    private String catalogLevelFiveName;
    //维修方案编码
    private String catalogLevelFiveCode;

    public String getCatalogLevelFiveName() {
        return catalogLevelFiveName;
    }

    public void setCatalogLevelFiveName(String catalogLevelFiveName) {
        this.catalogLevelFiveName = catalogLevelFiveName;
    }

    public String getCatalogLevelFiveCode() {
        return catalogLevelFiveCode;
    }

    public void setCatalogLevelFiveCode(String catalogLevelFiveCode) {
        this.catalogLevelFiveCode = catalogLevelFiveCode;
    }

    public ServiceOrderType getConfigurationType() {
        return configurationType;
    }

    public void setConfigurationType(ServiceOrderType configurationType) {
        this.configurationType = configurationType;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public Long getServiceCatalogId() {
        return serviceCatalogId;
    }

    public void setServiceCatalogId(Long serviceCatalogId) {
        this.serviceCatalogId = serviceCatalogId;
    }

    public ContractServiceCatalogType getContractServiceCatalogType() {
        return contractServiceCatalogType;
    }

    public void setContractServiceCatalogType(ContractServiceCatalogType contractServiceCatalogType) {
        this.contractServiceCatalogType = contractServiceCatalogType;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode;
    }

    public ServiceCatalogLevel getSlaLevel() {
        return slaLevel;
    }

    public void setSlaLevel(ServiceCatalogLevel slaLevel) {
        this.slaLevel = slaLevel;
    }

    public Double getSlaDuration() {
        return slaDuration;
    }

    public void setSlaDuration(Double slaDuration) {
        this.slaDuration = slaDuration;
    }
}
