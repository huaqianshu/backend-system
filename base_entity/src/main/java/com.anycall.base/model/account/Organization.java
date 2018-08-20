package com.anycall.base.model.account;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.general.Region;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

public class Organization extends AbstractPersistable {

    private static final long serialVersionUID = 5878535062998761421L;

    //组织名称
    private String orgName;

    private String orgCode;
    //组织类型
    private OrgType orgType = OrgType.SUPPLIER;

    private Long parentId = 0L;

    //描述
    private String memo;

    //等级
    private Integer level;

    private Boolean leaf = false;

    private Region region;

    private String state;

    private String city;

    private String district;

    private String street;

    private Long stateId;

    private Long cityId;

    private Long districtId;

    private Long streetId;

    private String address;

    private Boolean enabled = false;

    //是否已删除
    @JsonIgnore
    private boolean deleted = false;

    //创建时间
    private Date createTime;

    //最后修改人
    private String updater;

    //修改时间
    private Date updateTime;
    //是否虚拟服务商
    private Boolean isVirtual = false;

    private String secretKey;

    private Boolean isUsingApp = false;
    //是否自动接单
    private Boolean isAutoReceiveOrder = false;
    //自动审批工单
    private Boolean autoApprovalWorkOrder = false;
    //自动分配项目经理
    private Boolean autoDistributionDispatcher = false;
    //服务类型
    private ServiceType serviceType;

    private Boolean companyAuth;

    public Boolean getCompanyAuth() {
        return companyAuth;
    }

    public void setCompanyAuth(Boolean companyAuth) {
        this.companyAuth = companyAuth;
    }

    public Boolean getVirtual() {
        return isVirtual;
    }

    public void setVirtual(Boolean virtual) {
        isVirtual = virtual;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public OrgType getOrgType() {
        return orgType;
    }

    public void setOrgType(OrgType orgType) {
        this.orgType = orgType;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getStreetId() {
        return streetId;
    }

    public void setStreetId(Long streetId) {
        this.streetId = streetId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Boolean getIsUsingApp() {
        return isUsingApp;
    }

    public void setIsUsingApp(Boolean isUsingApp) {
        this.isUsingApp = isUsingApp;
    }

    public Boolean getIsAutoReceiveOrder() {
        return isAutoReceiveOrder;
    }

    public void setIsAutoReceiveOrder(Boolean isAutoReceiveOrder) {
        this.isAutoReceiveOrder = isAutoReceiveOrder;
    }

    public Boolean getAutoApprovalWorkOrder() {
        return autoApprovalWorkOrder;
    }

    public void setAutoApprovalWorkOrder(Boolean autoApprovalWorkOrder) {
        this.autoApprovalWorkOrder = autoApprovalWorkOrder;
    }

    public Boolean getAutoDistributionDispatcher() {
        return autoDistributionDispatcher;
    }

    public void setAutoDistributionDispatcher(Boolean autoDistributionDispatcher) {
        this.autoDistributionDispatcher = autoDistributionDispatcher;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
