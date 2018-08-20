package com.anycall.base.model.account.bo;

import com.anycall.base.model.account.Member;

import java.util.List;
/**
 * Created by admin on 2016/8/3.
 */
public class MemberBo extends Member {

    private static final long serialVersionUID = -3782177554854192597L;

    private String orgName;

    private String reporterName;

    private String reporterMobile;
    //总组织名称
    private String parentOrgName;

    private String departmentName;

    private String authName;

    //工单派单查询工人时做标记，true则就是来自网格
    private Boolean workerInNetArea=false;
    //品牌名称
    private String brandName;
    //公司名称
    private String companyName;
    private String avatarImg;
    //门店电话
    private String shopPhoneNum;
    //门店地址
    private String shopAddress;
    //是否使用报价
    private Boolean useQuotationAudit;

    //总经验
    private Double totalScore;
    //总时间
    private Double totalMinutes;
    //时效
    private Double avgScore;
    //工单数量
    private Integer workOrderNum;
    //平均维修时长
    private Double avgMinutes;

    //经度
    private Double lon;

    //纬度
    private Double lat;

    //直线距离
    private Double km;

    private Integer workOrderNumToday;

    private List<String> roleAuthorities;

    private double synthesizeScore;

    private Integer todayUndoneWorkOrderCount;

    public double getSynthesizeScore() {
        return synthesizeScore;
    }

    public void setSynthesizeScore(double synthesizeScore) {
        this.synthesizeScore = synthesizeScore;
    }

    public Integer getTodayUndoneWorkOrderCount() {
        return todayUndoneWorkOrderCount;
    }

    public void setTodayUndoneWorkOrderCount(Integer todayUndoneWorkOrderCount) {
        this.todayUndoneWorkOrderCount = todayUndoneWorkOrderCount;
    }

    public Integer getWorkOrderNum() {
        return workOrderNum;
    }

    public void setWorkOrderNum(Integer workOrderNum) {
        this.workOrderNum = workOrderNum;
    }

    public Double getAvgMinutes() {
        return avgMinutes;
    }

    public void setAvgMinutes(Double avgMinutes) {
        this.avgMinutes = avgMinutes;
    }

    public Double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(Double totalScore) {
        this.totalScore = totalScore;
    }

    public Double getTotalMinutes() {
        return totalMinutes;
    }

    public void setTotalMinutes(Double totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public Double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(Double avgScore) {
        this.avgScore = avgScore;
    }

    public Boolean getUseQuotationAudit() {
        return useQuotationAudit;
    }

    public void setUseQuotationAudit(Boolean useQuotationAudit) {
        this.useQuotationAudit = useQuotationAudit;
    }

    public String getShopPhoneNum() {
        return shopPhoneNum;
    }

    public void setShopPhoneNum(String shopPhoneNum) {
        this.shopPhoneNum = shopPhoneNum;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Boolean getWorkerInNetArea() {
        return workerInNetArea;
    }

    public void setWorkerInNetArea(Boolean workerInNetArea) {
        this.workerInNetArea = workerInNetArea;
    }

    public String getAvatarImg() {
        return avatarImg;
    }

    public void setAvatarImg(String avatarImg) {
        this.avatarImg = avatarImg;
    }

    public String getParentOrgName() {
        return parentOrgName;
    }

    public void setParentOrgName(String parentOrgName) {
        this.parentOrgName = parentOrgName;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public List<String> getRoleAuthorities() {
        return roleAuthorities;
    }

    public void setRoleAuthorities(List<String> roleAuthorities) {
        this.roleAuthorities = roleAuthorities;
    }

    public Integer getWorkOrderNumToday() {
        return workOrderNumToday;
    }

    public void setWorkOrderNumToday(Integer workOrderNumToday) {
        this.workOrderNumToday = workOrderNumToday;
    }

    public String getReporterMobile() {
        return reporterMobile;
    }

    public void setReporterMobile(String reporterMobile) {
        this.reporterMobile = reporterMobile;
    }
}
