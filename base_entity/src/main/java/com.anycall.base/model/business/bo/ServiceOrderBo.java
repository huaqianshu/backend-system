package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.QuotationStatus;
import com.anycall.base.model.business.ServiceOrder;
import com.anycall.base.model.business.WorkOrderStatus;
import com.anycall.base.model.business.vo.QuotationOrderVo;
import com.anycall.base.model.common.ServiceOrderLine;

import java.util.List;

/**
 * Created by Robin on 16/8/30.
 */
public class ServiceOrderBo extends ServiceOrder {

    private static final long serialVersionUID = -5140270140280029137L;

    private String netAreaName;

    private String dispatcherName;

    private String supplierName;

    private String brandName;

    private String companyName;

    private String shopName;

    private String shopNum;

    private String contractName;

    private String contractCode;

    private String region;

    private String stateName;

    private String cityName;

    private String districtName;

    private String address;

    private String phoneNum;
    private String realName;
    private String catalogShortName;

    private String createImg;
    private String selfieImg;
    private String repairBeforeImg;
    private String itemImg;
    private String repairAfterImg;
    private String billsImg;

    /**
     * 已过时
     */
    private Boolean appealAble=false;

    //报修上传的照片
    private List<String> serviceOrderImg;

    private List<WorkOrderBo> workOrderList;

    private List<QuotationOrderVo> quotationOrderList;
    private List<ConsultBo> consultBoList;
    private List<ServiceOrderLine> serviceOrderLines;

    //工单上工人Id，暂定为最后一个工单，即工人在派工时更新这个字段
    private Long workOrderStaffId;
    private String workOrderStaffName;
    private String quotationOrderNo;
    private QuotationStatus quotationOrderStatus;
    private String workOrderNo;
    private WorkOrderStatus workOrderStatus;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopNum() {
        return shopNum;
    }

    public void setShopNum(String shopNum) {
        this.shopNum = shopNum;
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

    public String getDispatcherName() {
        return dispatcherName;
    }

    public void setDispatcherName(String dispatcherName) {
        this.dispatcherName = dispatcherName;
    }

    public String getNetAreaName() {
        return netAreaName;
    }

    public void setNetAreaName(String netAreaName) {
        this.netAreaName = netAreaName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
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

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCatalogShortName() {
        return catalogShortName;
    }

    public void setCatalogShortName(String catalogShortName) {
        this.catalogShortName = catalogShortName;
    }

    public String getSelfieImg() {
        return selfieImg;
    }

    public void setSelfieImg(String selfieImg) {
        this.selfieImg = selfieImg;
    }

    public String getRepairBeforeImg() {
        return repairBeforeImg;
    }

    public void setRepairBeforeImg(String repairBeforeImg) {
        this.repairBeforeImg = repairBeforeImg;
    }

    public String getItemImg() {
        return itemImg;
    }

    public void setItemImg(String itemImg) {
        this.itemImg = itemImg;
    }

    public String getRepairAfterImg() {
        return repairAfterImg;
    }

    public void setRepairAfterImg(String repairAfterImg) {
        this.repairAfterImg = repairAfterImg;
    }

    public String getBillsImg() {
        return billsImg;
    }

    public void setBillsImg(String billsImg) {
        this.billsImg = billsImg;
    }

    @Deprecated
    public Boolean getAppealAble() {
        return appealAble;
    }

    @Deprecated
    public void setAppealAble(Boolean appealAble) {
        this.appealAble = appealAble;
    }

    public List<WorkOrderBo> getWorkOrderList() {
        return workOrderList;
    }

    public void setWorkOrderList(List<WorkOrderBo> workOrderList) {
        this.workOrderList = workOrderList;
    }

    public String getCreateImg() {
        return createImg;
    }

    public void setCreateImg(String createImg) {
        this.createImg = createImg;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<String> getServiceOrderImg() {
        return serviceOrderImg;
    }

    public void setServiceOrderImg(List<String> serviceOrderImg) {
        this.serviceOrderImg = serviceOrderImg;
    }

    public List<QuotationOrderVo> getQuotationOrderList() {
        return quotationOrderList;
    }

    public void setQuotationOrderList(List<QuotationOrderVo> quotationOrderList) {
        this.quotationOrderList = quotationOrderList;
    }

    public List<ServiceOrderLine> getServiceOrderLines() {
        return serviceOrderLines;
    }

    public void setServiceOrderLines(List<ServiceOrderLine> serviceOrderLines) {
        this.serviceOrderLines = serviceOrderLines;
    }

    public Long getWorkOrderStaffId() {
        return workOrderStaffId;
    }

    public void setWorkOrderStaffId(Long workOrderStaffId) {
        this.workOrderStaffId = workOrderStaffId;
    }

    public String getWorkOrderStaffName() {
        return workOrderStaffName;
    }

    public void setWorkOrderStaffName(String workOrderStaffName) {
        this.workOrderStaffName = workOrderStaffName;
    }

    public String getQuotationOrderNo() {
        return quotationOrderNo;
    }

    public void setQuotationOrderNo(String quotationOrderNo) {
        this.quotationOrderNo = quotationOrderNo;
    }

    public QuotationStatus getQuotationOrderStatus() {
        return quotationOrderStatus;
    }

    public void setQuotationOrderStatus(QuotationStatus quotationOrderStatus) {
        this.quotationOrderStatus = quotationOrderStatus;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public WorkOrderStatus getWorkOrderStatus() {
        return workOrderStatus;
    }

    public void setWorkOrderStatus(WorkOrderStatus workOrderStatus) {
        this.workOrderStatus = workOrderStatus;
    }

    public List<ConsultBo> getConsultBoList() {
        return consultBoList;
    }

    public void setConsultBoList(List<ConsultBo> consultBoList) {
        this.consultBoList = consultBoList;
    }
}
