package com.anycall.base.model.account.condition;

import com.anycall.base.model.account.MemberType;
import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Created by lujun on 16/6/20.
 * Copyright © 2014-2016 ants-city.com
 */
public class MemberSearchPageCondition extends QuickSearchOrgPageCondition{


    private static final long serialVersionUID = -7850823146044335686L;

    private List<Long> orgTreeIds;
    private String identifyType;
    private List<String> identifyTypes;
    private List<MemberType> memberTypes;
    private Boolean enabled;
    private Long currentId;
    private Boolean isSupplierOwner;
    private String mode;
    private String memberType;
    private Long memberId;
    private List<Long> memberIds;
    private String loginName;
    private String realName;
    private Long companyId;
    private Long queryOrgId;
    //如果为true，则是查询除了本级上级的member
    private Boolean excludeSubordinate=false;

    //如果为true，查询包含自己和所有的上级org的member
    private Boolean toFindSuperior=false;
    //如果为true，查询包含自己和所有的下级org的member
    private Boolean toFindSubordinate=false;

    private Long currentMemberId;
    //查找可以管理的工人，可以管理指，网格工人有，下级有
    private Boolean toFindWorker=false;

    private List<Long> inNetAreaWorkers;
    //用于咨询单排除项目经理的查询
    private Long dispatcherId;
    private String serviceOrderNo;

    //存在所指定的门店权限的member
    private String existDepartmentCode;

    //所在城市
    private Long cityId;
    private Long stateId;
    private String region;
    private String searchText;
    //工人掌握的技能
    private String catalogcode;

    private Double lon;

    private Double lat;

    private Boolean companyAuth;

    private String workerType;

    private Date day;

    public String getWorkerType() {
        return workerType;
    }

    public void setWorkerType(String workerType) {
        this.workerType = workerType;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public List<String> getIdentifyTypes() {
        return identifyTypes;
    }

    public void setIdentifyTypes(List<String> identifyTypes) {
        this.identifyTypes = identifyTypes;
    }

    public List<MemberType> getMemberTypes() {
        return memberTypes;
    }

    public void setMemberTypes(List<MemberType> memberTypes) {
        this.memberTypes = memberTypes;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getCurrentId() {
        return currentId;
    }

    public void setCurrentId(Long currentId) {
        this.currentId = currentId;
    }

    public Boolean getSupplierOwner() {
        return isSupplierOwner;
    }

    public void setSupplierOwner(Boolean supplierOwner) {
        isSupplierOwner = supplierOwner;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public List<Long> getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(List<Long> memberIds) {
        this.memberIds = memberIds;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getQueryOrgId() {
        return queryOrgId;
    }

    public void setQueryOrgId(Long queryOrgId) {
        this.queryOrgId = queryOrgId;
    }

    public Boolean getExcludeSubordinate() {
        return excludeSubordinate;
    }

    public void setExcludeSubordinate(Boolean excludeSubordinate) {
        this.excludeSubordinate = excludeSubordinate;
    }

    public Boolean getToFindSuperior() {
        return toFindSuperior;
    }

    public void setToFindSuperior(Boolean toFindSuperior) {
        this.toFindSuperior = toFindSuperior;
    }

    public Boolean getToFindSubordinate() {
        return toFindSubordinate;
    }

    public void setToFindSubordinate(Boolean toFindSubordinate) {
        this.toFindSubordinate = toFindSubordinate;
    }

    public Long getCurrentMemberId() {
        return currentMemberId;
    }

    public void setCurrentMemberId(Long currentMemberId) {
        this.currentMemberId = currentMemberId;
    }

    public Boolean getToFindWorker() {
        return toFindWorker;
    }

    public void setToFindWorker(Boolean toFindWorker) {
        this.toFindWorker = toFindWorker;
    }

    public List<Long> getInNetAreaWorkers() {
        return inNetAreaWorkers;
    }

    public void setInNetAreaWorkers(List<Long> inNetAreaWorkers) {
        this.inNetAreaWorkers = inNetAreaWorkers;
    }

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public String getExistDepartmentCode() {
        return existDepartmentCode;
    }

    public void setExistDepartmentCode(String existDepartmentCode) {
        this.existDepartmentCode = existDepartmentCode;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCatalogcode() {
        return catalogcode;
    }

    public void setCatalogcode(String catalogcode) {
        this.catalogcode = catalogcode;
    }

    public Boolean getCompanyAuth() {
        return companyAuth;
    }

    public void setCompanyAuth(Boolean companyAuth) {
        this.companyAuth = companyAuth;
    }

    @Override
    public String getSearchText() {
        return searchText;
    }

    @Override
    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MemberSearchPageCondition that = (MemberSearchPageCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(identifyType, that.identifyType) &&
                Objects.equals(identifyTypes, that.identifyTypes) &&
                Objects.equals(memberTypes, that.memberTypes) &&
                Objects.equals(enabled, that.enabled) &&
                Objects.equals(currentId, that.currentId) &&
                Objects.equals(isSupplierOwner, that.isSupplierOwner) &&
                Objects.equals(mode, that.mode) &&
                Objects.equals(memberType, that.memberType) &&
                Objects.equals(memberId, that.memberId) &&
                Objects.equals(memberIds, that.memberIds) &&
                Objects.equals(loginName, that.loginName) &&
                Objects.equals(realName, that.realName) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(queryOrgId, that.queryOrgId) &&
                Objects.equals(excludeSubordinate, that.excludeSubordinate) &&
                Objects.equals(toFindSuperior, that.toFindSuperior) &&
                Objects.equals(toFindSubordinate, that.toFindSubordinate) &&
                Objects.equals(currentMemberId, that.currentMemberId) &&
                Objects.equals(toFindWorker, that.toFindWorker) &&
                Objects.equals(inNetAreaWorkers, that.inNetAreaWorkers) &&
                Objects.equals(dispatcherId, that.dispatcherId) &&
                Objects.equals(serviceOrderNo, that.serviceOrderNo) &&
                Objects.equals(existDepartmentCode, that.existDepartmentCode) &&
                Objects.equals(cityId, that.cityId) &&
                Objects.equals(searchText, that.searchText) &&
                Objects.equals(catalogcode, that.catalogcode) &&
                Objects.equals(lon, that.lon) &&
                Objects.equals(lat, that.lat) &&
                Objects.equals(companyAuth, that.companyAuth) &&
                Objects.equals(workerType, that.workerType) &&
                Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), orgTreeIds, identifyType, identifyTypes, memberTypes, enabled, currentId, isSupplierOwner, mode, memberType, memberId, memberIds, loginName, realName, companyId, queryOrgId, excludeSubordinate, toFindSuperior, toFindSubordinate, currentMemberId, toFindWorker, inNetAreaWorkers, dispatcherId, serviceOrderNo, existDepartmentCode, cityId, searchText, catalogcode, lon, lat, companyAuth, workerType, day);
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
