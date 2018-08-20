package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.ChargingType;
import com.anycall.base.model.account.ContractServiceCatalogType;
import com.anycall.base.model.business.ServiceOrderType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

/**
 * Created by .
 */
public class ServiceCatalogTemplateLine extends AbstractPersistable {

    //目录模板Id
    private Long catalogTemplateId;

    //类目Id
    private Long catalogId;

    //类目编码
    private String catalogCode;

    //第一级目录名称
    private String bigCatalogName;

    //第二级目录名称
    private String childCatalogName;

    //第三级目录名称
    private String brandArea;

    //第四级目录名称
    private String failure;

    //第五级目录名称
    private String catalogLevelFiveName;

    //第五级目录编码
    private String catalogLevelFiveCode;

    //层级1,2,3,4,5,6
    private ServiceCatalogLevel slaLevel = ServiceCatalogLevel.P1;

    //SLA服务时长
    private Double slaDuration;
    //配置类型
    private ServiceOrderType configurationType;

    //服务类型
    private ContractServiceCatalogType contractServiceCatalogType = ContractServiceCatalogType.DAILY;


    public ServiceOrderType getConfigurationType() {
        return configurationType;
    }

    public void setConfigurationType(ServiceOrderType configurationType) {
        this.configurationType = configurationType;
    }

    public Long getCatalogTemplateId() {
        return catalogTemplateId;
    }

    public void setCatalogTemplateId(Long catalogTemplateId) {
        this.catalogTemplateId = catalogTemplateId;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
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

    public ContractServiceCatalogType getContractServiceCatalogType() {
        return contractServiceCatalogType;
    }

    public void setContractServiceCatalogType(ContractServiceCatalogType contractServiceCatalogType) {
        this.contractServiceCatalogType = contractServiceCatalogType;
    }
}
