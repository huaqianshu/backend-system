package com.anycall.base.model.business.vo;

import com.anycall.base.model.business.ExportOrgQuotation;
import com.anycall.base.model.business.QuotationOrder;
import com.anycall.base.model.business.QuotationOrderItem;
import com.anycall.base.model.business.UrgencyType;
import com.anycall.base.model.general.Region;

import java.util.Date;
import java.util.List;


public class QuotationOrderVo extends QuotationOrder {

    private static final long serialVersionUID = 2985899970983462000L;
    private String serviceOrderNo;

    private String workOrderNo;

    private String relatedWorkOrderNo;

    //故障现象编码
    private String catalogLevelFourCode;

    //维修方案
    private String catalogLevelFiveName;

    //审批金额
    private Double totalApprovals;

    private String brandNameLine;

    private String shopName;

    private Region region;

    private String cityName;

    //调度人
    private String dispatcherName;

    //制单人
    private String producerName;

    //报价工人(选择本服务商下的所有工人)
    private String workerName;

    //工人电话
    private String workerMobileNo;

    //内审人
    private String firsrtrialer;

    //审批人
    private String rechecker;

    //类目名称
    private String catName;

    private String companyName;

    //品牌名称
    private String brandName;

    private Date serviceOrderCreateTime;

    //打印用
    private String reportTime;

    private String printDesc;

    private String capitalQuoteTotals;

    private String phoneNum;

    private String supplierName;

    private Long contractId;

    private Long count;

    private String reportMan;

    private String reportManTel;

    private String address;

    //是否在保
    private Boolean isInService;

    //报修数量
    private Integer reportQuantity;

    private UrgencyType urgencyType;

    //验证项目价格/审批
    private Boolean projectPriceVerify;

    private List<QuotationOrderProjectVo> quoProject;
    private List<QuotationOrderItem> quoAllItems;
    //报价图片
    private List<String> quotationOrderImgs;

    //服务商审批图片
    private List<String> quotationRecheckImgs;

    private List<String> repairBeforeImgs;

    private List<String> serviceOrderImgs;

    private List<ExportOrgQuotation> exportOrgQuotations;

    private String mergeNo;

    public List<QuotationOrderItem> getQuoAllItems() {
        return quoAllItems;
    }

    public void setQuoAllItems(List<QuotationOrderItem> quoAllItems) {
        this.quoAllItems = quoAllItems;
    }

    public UrgencyType getUrgencyType() {
        return urgencyType;
    }

    public void setUrgencyType(UrgencyType urgencyType) {
        this.urgencyType = urgencyType;
    }

    public Date getServiceOrderCreateTime() {
        return serviceOrderCreateTime;
    }

    public void setServiceOrderCreateTime(Date serviceOrderCreateTime) {
        this.serviceOrderCreateTime = serviceOrderCreateTime;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public String getBrandNameLine() {
        return brandNameLine;
    }

    public void setBrandNameLine(String brandNameLine) {
        this.brandNameLine = brandNameLine;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getDispatcherName() {
        return dispatcherName;
    }

    public void setDispatcherName(String dispatcherName) {
        this.dispatcherName = dispatcherName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerMobileNo() {
        return workerMobileNo;
    }

    public void setWorkerMobileNo(String workerMobileNo) {
        this.workerMobileNo = workerMobileNo;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(Long contractId) {
        this.contractId = contractId;
    }

    public List<QuotationOrderProjectVo> getQuoProject() {
        return quoProject;
    }

    public void setQuoProject(List<QuotationOrderProjectVo> quoProject) {
        this.quoProject = quoProject;
    }

    public List<String> getQuotationOrderImgs() {
        return quotationOrderImgs;
    }

    public void setQuotationOrderImgs(List<String> quotationOrderImgs) {
        this.quotationOrderImgs = quotationOrderImgs;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getTotalApprovals() {
        return totalApprovals;
    }

    public void setTotalApprovals(Double totalApprovals) {
        this.totalApprovals = totalApprovals;
    }

    public List<String> getQuotationRecheckImgs() {
        return quotationRecheckImgs;
    }

    public void setQuotationRecheckImgs(List<String> quotationRecheckImgs) {
        this.quotationRecheckImgs = quotationRecheckImgs;
    }

    public List<String> getServiceOrderImgs() {
        return serviceOrderImgs;
    }

    public void setServiceOrderImgs(List<String> serviceOrderImgs) {
        this.serviceOrderImgs = serviceOrderImgs;
    }

    public List<String> getRepairBeforeImgs() {
        return repairBeforeImgs;
    }

    public void setRepairBeforeImgs(List<String> repairBeforeImgs) {
        this.repairBeforeImgs = repairBeforeImgs;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getFirsrtrialer() {
        return firsrtrialer;
    }

    public void setFirsrtrialer(String firsrtrialer) {
        this.firsrtrialer = firsrtrialer;
    }

    public String getRechecker() {
        return rechecker;
    }

    public void setRechecker(String rechecker) {
        this.rechecker = rechecker;
    }

    public String getReportMan() {
        return reportMan;
    }

    public void setReportMan(String reportMan) {
        this.reportMan = reportMan;
    }

    public String getReportManTel() {
        return reportManTel;
    }

    public void setReportManTel(String reportManTel) {
        this.reportManTel = reportManTel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public String getRelatedWorkOrderNo() {
        return relatedWorkOrderNo;
    }

    public void setRelatedWorkOrderNo(String relatedWorkOrderNo) {
        this.relatedWorkOrderNo = relatedWorkOrderNo;
    }

    public Boolean getIsInService() {
        return isInService;
    }

    public void setIsInService(Boolean isInService) {
        this.isInService = isInService;
    }

    public Integer getReportQuantity() {
        return reportQuantity;
    }

    public void setReportQuantity(Integer reportQuantity) {
        this.reportQuantity = reportQuantity;
    }

    public String getCatalogLevelFiveName() {
        return catalogLevelFiveName;
    }

    public void setCatalogLevelFiveName(String catalogLevelFiveName) {
        this.catalogLevelFiveName = catalogLevelFiveName;
    }

    public String getCatalogLevelFourCode() {
        return catalogLevelFourCode;
    }

    public void setCatalogLevelFourCode(String catalogLevelFourCode) {
        this.catalogLevelFourCode = catalogLevelFourCode;
    }

    public List<ExportOrgQuotation> getExportOrgQuotations() {
        return exportOrgQuotations;
    }

    public void setExportOrgQuotations(List<ExportOrgQuotation> exportOrgQuotations) {
        this.exportOrgQuotations = exportOrgQuotations;
    }

    public Boolean getProjectPriceVerify() {
        return projectPriceVerify;
    }

    public void setProjectPriceVerify(Boolean projectPriceVerify) {
        this.projectPriceVerify = projectPriceVerify;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPrintDesc() {
        return printDesc;
    }

    public void setPrintDesc(String printDesc) {
        this.printDesc = printDesc;
    }

    public String getMergeNo() {
        return mergeNo;
    }

    public void setMergeNo(String mergeNo) {
        this.mergeNo = mergeNo;
    }

    public String getCapitalQuoteTotals() {
        return capitalQuoteTotals;
    }

    public void setCapitalQuoteTotals(String capitalQuoteTotals) {
        this.capitalQuoteTotals = capitalQuoteTotals;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
