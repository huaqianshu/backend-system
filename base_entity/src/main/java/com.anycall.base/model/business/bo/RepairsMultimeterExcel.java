package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.vo.QuotationOrderProjectVo;

import java.util.Date;
import java.util.List;

/**
 * Created by Amy on 2017/4/27.
 */
public class RepairsMultimeterExcel extends WorkOrderBo {

    private static final long serialVersionUID = -5943151762642117537L;

    //品牌
    private String brandName;

    //服务单状态
    private String serviceOrderStatus;

    //区域名称
    private String regionName;

    //省
    private String stateName;

    //市
    private String cityName;

    //客服担当
    private String customerServiceName;   //暂时不知道取哪个，服务单的创建人？？

    //维修中心系统派案时间
    private Date distributeTime;

    //服务商实际接案时间
    private Date receiveTime;

    // 报价项名称
    private String quotItemName;

    //单位
    private String projectUnit;

    //物料销售价格(单价)
    private Double salePrice;

    //数量
    private Double number;

    //材料费(取物料明细里的总计)
    private Double itemCostTotal;

    //预报价费用
    private Double forecastPrice;

    //人数
    private Integer workerNum;

    //人工费
    private Double workerCost;

    //交通费
    private Double trafficCost;

    //住宿单价
    private Double stayUnitPrice;

    //住宿费
    private Double stayCost;

    //其他费用
    private Double otherCost;

    //合计费用
    private Double total;

    //报修属性
    private String urgencyTypeName;

    //是否在保
    private String isInServiceName;

    //报价项备注
    private String projectMemo;

    //结算费用
    private Double settlementPrice;

    private List<Double> artificialUnitPrice;//人工单价

    private List<Double> trafficUnitPrice;//交通费单价

    private List<QuotationOrderProjectVo> projectList;

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCustomerServiceName() {
        return customerServiceName;
    }

    public void setCustomerServiceName(String customerServiceName) {
        this.customerServiceName = customerServiceName;
    }

    public Date getDistributeTime() {
        return distributeTime;
    }

    public void setDistributeTime(Date distributeTime) {
        this.distributeTime = distributeTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getQuotItemName() {
        return quotItemName;
    }

    public void setQuotItemName(String quotItemName) {
        this.quotItemName = quotItemName;
    }

    public String getProjectUnit() {
        return projectUnit;
    }

    public void setProjectUnit(String projectUnit) {
        this.projectUnit = projectUnit;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getWorkerCost() {
        return workerCost;
    }

    public void setWorkerCost(Double workerCost) {
        this.workerCost = workerCost;
    }

    public Double getTrafficCost() {
        return trafficCost;
    }

    public void setTrafficCost(Double trafficCost) {
        this.trafficCost = trafficCost;
    }

    public Double getStayCost() {
        return stayCost;
    }

    public void setStayCost(Double stayCost) {
        this.stayCost = stayCost;
    }

    public Double getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(Double otherCost) {
        this.otherCost = otherCost;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getItemCostTotal() {
        return itemCostTotal;
    }

    public void setItemCostTotal(Double itemCostTotal) {
        this.itemCostTotal = itemCostTotal;
    }

    public Integer getWorkerNum() {
        return workerNum;
    }

    public void setWorkerNum(Integer workerNum) {
        this.workerNum = workerNum;
    }

    public String getUrgencyTypeName() {
        return urgencyTypeName;
    }

    public void setUrgencyTypeName(String urgencyTypeName) {
        this.urgencyTypeName = urgencyTypeName;
    }

    public String getIsInServiceName() {
        return isInServiceName;
    }

    public void setIsInServiceName(String isInServiceName) {
        this.isInServiceName = isInServiceName;
    }

    public String getProjectMemo() {
        return projectMemo;
    }

    public void setProjectMemo(String projectMemo) {
        this.projectMemo = projectMemo;
    }

    public List<QuotationOrderProjectVo> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<QuotationOrderProjectVo> projectList) {
        this.projectList = projectList;
    }

    public Double getStayUnitPrice() {
        return stayUnitPrice;
    }

    public void setStayUnitPrice(Double stayUnitPrice) {
        this.stayUnitPrice = stayUnitPrice;
    }

    public Double getForecastPrice() {
        return forecastPrice;
    }

    public void setForecastPrice(Double forecastPrice) {
        this.forecastPrice = forecastPrice;
    }

    public List<Double> getArtificialUnitPrice() {
        return artificialUnitPrice;
    }

    public void setArtificialUnitPrice(List<Double> artificialUnitPrice) {
        this.artificialUnitPrice = artificialUnitPrice;
    }

    public List<Double> getTrafficUnitPrice() {
        return trafficUnitPrice;
    }

    public void setTrafficUnitPrice(List<Double> trafficUnitPrice) {
        this.trafficUnitPrice = trafficUnitPrice;
    }

    public Double getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(Double settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    @Override
    public String getBrandName() {
        return brandName;
    }

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getServiceOrderStatus() {
        return serviceOrderStatus;
    }

    public void setServiceOrderStatus(String serviceOrderStatus) {
        this.serviceOrderStatus = serviceOrderStatus;
    }
}
