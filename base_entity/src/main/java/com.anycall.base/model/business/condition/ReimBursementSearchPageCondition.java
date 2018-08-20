package com.anycall.base.model.business.condition;

import com.anycall.base.model.business.ReimburseStatus;
import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;
/**
 * Created by hachi on 16/9/14.
 */
public class ReimBursementSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -5859241573838783604L;

    private List<Long> orgTreeIds;

    private Long reimbursementId;

    private Long staffId;

    private Long workOrderId;

    private Long serviceOrderId;

    private String status;

    private List<ReimburseStatus> statuses;

    private Boolean allin;

    private Boolean reimburseEnabled;

    //根据公司Id，报销单创建时间查找报销单
    private Long companyId;
    private Integer year;
    private Integer month;
    private String serCreateDate;
    private String endCreateDate;
    private String exportStartDate;
    private String exportEndDate;
    private String reimbursementNo;
    private String type;
    private Date reCreateTime;
    private Date reEndTime;
    private Date startReportTime;
    private Date endReportTime;
    private String shopAuths;

    //新增
    private String orderNo;

    private String payee;

    private Long dispatcherId;

    private Long paymentOrderId;

    private List<Long> notReimbursementId;

    private Boolean holding;
    private List<Long> industryIds;
    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Long getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Long serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ReimburseStatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<ReimburseStatus> statuses) {
        this.statuses = statuses;
    }

    public Boolean getAllin() {
        return allin;
    }

    public void setAllin(Boolean allin) {
        this.allin = allin;
    }

    public Boolean getReimburseEnabled() {
        return reimburseEnabled;
    }

    public void setReimburseEnabled(Boolean reimburseEnabled) {
        this.reimburseEnabled = reimburseEnabled;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public String getSerCreateDate() {
        return serCreateDate;
    }

    public void setSerCreateDate(String serCreateDate) {
        this.serCreateDate = serCreateDate;
    }

    public String getEndCreateDate() {
        return endCreateDate;
    }

    public void setEndCreateDate(String endCreateDate) {
        this.endCreateDate = endCreateDate;
    }

    public String getExportStartDate() {
        return exportStartDate;
    }

    public void setExportStartDate(String exportStartDate) {
        this.exportStartDate = exportStartDate;
    }

    public String getExportEndDate() {
        return exportEndDate;
    }

    public void setExportEndDate(String exportEndDate) {
        this.exportEndDate = exportEndDate;
    }

    public String getReimbursementNo() {
        return reimbursementNo;
    }

    public void setReimbursementNo(String reimbursementNo) {
        this.reimbursementNo = reimbursementNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getReCreateTime() {
        return reCreateTime;
    }

    public void setReCreateTime(Date reCreateTime) {
        this.reCreateTime = reCreateTime;
    }

    public Date getReEndTime() {
        return reEndTime;
    }

    public void setReEndTime(Date reEndTime) {
        this.reEndTime = reEndTime;
    }

    public Date getStartReportTime() {
        return startReportTime;
    }

    public void setStartReportTime(Date startReportTime) {
        this.startReportTime = startReportTime;
    }

    public Date getEndReportTime() {
        return endReportTime;
    }

    public void setEndReportTime(Date endReportTime) {
        this.endReportTime = endReportTime;
    }

    public String getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String shopAuths) {
        this.shopAuths = shopAuths;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public Long getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(Long reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public Long getPaymentOrderId() {
        return paymentOrderId;
    }

    public void setPaymentOrderId(Long paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
    }

    public List<Long> getNotReimbursementId() {
        return notReimbursementId;
    }

    public void setNotReimbursementId(List<Long> notReimbursementId) {
        this.notReimbursementId = notReimbursementId;
    }

    public Boolean getHolding() {
        return holding;
    }

    public void setHolding(Boolean holding) {
        this.holding = holding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ReimBursementSearchPageCondition that = (ReimBursementSearchPageCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
                Objects.equals(reimbursementId, that.reimbursementId) &&
                Objects.equals(staffId, that.staffId) &&
                Objects.equals(workOrderId, that.workOrderId) &&
                Objects.equals(serviceOrderId, that.serviceOrderId) &&
                Objects.equals(status, that.status) &&
                Objects.equals(statuses, that.statuses) &&
                Objects.equals(allin, that.allin) &&
                Objects.equals(reimburseEnabled, that.reimburseEnabled) &&
                Objects.equals(companyId, that.companyId) &&
                Objects.equals(year, that.year) &&
                Objects.equals(month, that.month) &&
                Objects.equals(serCreateDate, that.serCreateDate) &&
                Objects.equals(endCreateDate, that.endCreateDate) &&
                Objects.equals(exportStartDate, that.exportStartDate) &&
                Objects.equals(exportEndDate, that.exportEndDate) &&
                Objects.equals(reimbursementNo, that.reimbursementNo) &&
                Objects.equals(type, that.type) &&
                Objects.equals(reCreateTime, that.reCreateTime) &&
                Objects.equals(reEndTime, that.reEndTime) &&
                Objects.equals(startReportTime, that.startReportTime) &&
                Objects.equals(endReportTime, that.endReportTime) &&
                Objects.equals(shopAuths, that.shopAuths) &&
                Objects.equals(orderNo, that.orderNo) &&
                Objects.equals(payee, that.payee) &&
                Objects.equals(dispatcherId, that.dispatcherId) &&
                Objects.equals(paymentOrderId, that.paymentOrderId) &&
                Objects.equals(notReimbursementId, that.notReimbursementId) &&
                Objects.equals(holding, that.holding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orgTreeIds, reimbursementId, staffId, workOrderId, serviceOrderId, status, statuses, allin, reimburseEnabled, companyId, year, month, serCreateDate, endCreateDate, exportStartDate, exportEndDate, reimbursementNo, type, reCreateTime, reEndTime, startReportTime, endReportTime, shopAuths, orderNo, payee, dispatcherId, paymentOrderId, notReimbursementId, holding);
    }

    public List<Long> getIndustryIds() {
        return industryIds;
    }

    public void setIndustryIds(List<Long> industryIds) {
        this.industryIds = industryIds;
    }
}
