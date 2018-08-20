package com.anycall.base.model.common.bo;

import java.io.Serializable;

/**
 * Created by harold on  16/12/16.
 * Copyright © 2014-2016 ants-city.com
 */
public class ScheduleField implements Serializable {

    private static final long serialVersionUID = 3780741771142871623L;

    // 以下为服务商的
    private Integer subordinateCount;//下属工人数
    private Integer netAreaCount;//管理网格数
    private Integer netAreaShopCount;//服务店铺数
    private Integer unDispatch;//未派工
    private Integer unSignInOnTime;//未按时签到
    private Integer unLeaveOnTime;//未按时离场
    private Long unCompleteServiceOrder;//未完成服务单
    private Integer unAppraise;//待评价
    private Long emergencyRepair;//急修
    private Long overdueUnComplete;//逾期未完成
    private Long reportPricing;//报价中
    private Long complain;//投诉
    private Long quoteReject;//报价驳回
    private Long signTimeout;//签到后超时

    private Integer waittingConsultationProcessed;//待处理咨询
    private Integer waittingReceivingOrder;//待接单数
    private Integer notAddShop;//无网格门店
    private Integer withoutDispatcherServiceOrder;//无项目经理单据
    private Integer consultationReply;//咨询回复

    private Integer waittingCreatedQuotationOrder;//待制单（报价单）
    private Integer waittingConfirm;//待审批
    private Integer waittingReconstruct;//待重拟
    private Integer waittingStayfirsrtrial;//待内审
    private Integer overTime;//超时未报
    private Integer firstPartyReply;//甲方回复

    private Integer waittingCreatedExpenseOrder;//待制单（报销单）
    private Integer waittingReapproved;//待复审
    private Integer reapproved;//待发放
    private Integer consultationProcessed;//咨询处理
    private Integer unapprovedExpense;//可审/未审报销单
    private Double countRemPrice;//总的报价金额
    private Long countRemCount;//总的报价金额
    // 以下为客户的

    // 以下为优衣库门店的
    private Integer weekRepairsCount;//本周新增保修数
    private Integer weekRepairsEndCount;//本周保修完成数

    //报价制单人
    private Integer waitQuoteCount;//待制报价数量
    private Integer innerRejectCount;//内审驳回数量
    private Long rejectedSettlementQuotationsCount;//被驳回结算报价数量
    //报价审核人
    private Integer waitInnerCount;//带内审数量
    private Long settlementQuotationsRejectCount;//结算报价驳回单数量
    private Integer rejectWaitDealCount;//驳回待处理数量
    private Long settlementQuotationsCount;//结算报价内审单
    //以下为平台客服的
    private Integer pUrgentOrdersCount;  //紧急维修单数
    private Integer pRejectOrdersCount;  //驳回单数
    private Integer pOverdueOrdersCount;  //逾期数
    private Integer pUnFinishedCount;  //未完成数
    private Integer pWaitreceivingCount; //未接单数
    private Integer pDraftOrderCount; //待处理服务单
    private Integer pSortListsCount; //未分拣单数
    private Integer pComplainOrdersCount; //投诉管理数

    public Long getSignTimeout() {
        return signTimeout;
    }

    public void setSignTimeout(Long signTimeout) {
        this.signTimeout = signTimeout;
    }

    public Long getOverdueUnComplete() {
        return overdueUnComplete;
    }

    public void setOverdueUnComplete(Long overdueUnComplete) {
        this.overdueUnComplete = overdueUnComplete;
    }

    public Long getCountRemCount() {
        return countRemCount;
    }

    public void setCountRemCount(Long countRemCount) {
        this.countRemCount = countRemCount;
    }

    public Double getCountRemPrice() {
        return countRemPrice;
    }

    public void setCountRemPrice(Double countRemPrice) {
        this.countRemPrice = countRemPrice;
    }

    public Long getRejectedSettlementQuotationsCount() {
        return rejectedSettlementQuotationsCount;
    }

    public void setRejectedSettlementQuotationsCount(Long rejectedSettlementQuotationsCount) {
        this.rejectedSettlementQuotationsCount = rejectedSettlementQuotationsCount;
    }

    public Long getSettlementQuotationsRejectCount() {
        return settlementQuotationsRejectCount;
    }

    public void setSettlementQuotationsRejectCount(Long settlementQuotationsRejectCount) {
        this.settlementQuotationsRejectCount = settlementQuotationsRejectCount;
    }

    public Long getSettlementQuotationsCount() {
        return settlementQuotationsCount;
    }

    public void setSettlementQuotationsCount(Long settlementQuotationsCount) {
        this.settlementQuotationsCount = settlementQuotationsCount;
    }

    public Integer getSubordinateCount() {
        return subordinateCount;
    }

    public void setSubordinateCount(Integer subordinateCount) {
        this.subordinateCount = subordinateCount;
    }

    public Integer getNetAreaCount() {
        return netAreaCount;
    }

    public void setNetAreaCount(Integer netAreaCount) {
        this.netAreaCount = netAreaCount;
    }

    public Integer getNetAreaShopCount() {
        return netAreaShopCount;
    }

    public void setNetAreaShopCount(Integer netAreaShopCount) {
        this.netAreaShopCount = netAreaShopCount;
    }

    public Integer getUnDispatch() {
        return unDispatch;
    }

    public void setUnDispatch(Integer unDispatch) {
        this.unDispatch = unDispatch;
    }

    public Integer getUnSignInOnTime() {
        return unSignInOnTime;
    }

    public void setUnSignInOnTime(Integer unSignInOnTime) {
        this.unSignInOnTime = unSignInOnTime;
    }

    public Integer getUnLeaveOnTime() {
        return unLeaveOnTime;
    }

    public void setUnLeaveOnTime(Integer unLeaveOnTime) {
        this.unLeaveOnTime = unLeaveOnTime;
    }

    public Integer getUnAppraise() {
        return unAppraise;
    }

    public void setUnAppraise(Integer unAppraise) {
        this.unAppraise = unAppraise;
    }

    public Integer getWaittingConsultationProcessed() {
        return waittingConsultationProcessed;
    }

    public void setWaittingConsultationProcessed(Integer waittingConsultationProcessed) {
        this.waittingConsultationProcessed = waittingConsultationProcessed;
    }

    public Integer getWaittingReceivingOrder() {
        return waittingReceivingOrder;
    }

    public void setWaittingReceivingOrder(Integer waittingReceivingOrder) {
        this.waittingReceivingOrder = waittingReceivingOrder;
    }

    public Integer getNotAddShop() {
        return notAddShop;
    }

    public void setNotAddShop(Integer notAddShop) {
        this.notAddShop = notAddShop;
    }

    public Integer getWithoutDispatcherServiceOrder() {
        return withoutDispatcherServiceOrder;
    }

    public void setWithoutDispatcherServiceOrder(Integer withoutDispatcherServiceOrder) {
        this.withoutDispatcherServiceOrder = withoutDispatcherServiceOrder;
    }

    public Integer getConsultationReply() {
        return consultationReply;
    }

    public void setConsultationReply(Integer consultationReply) {
        this.consultationReply = consultationReply;
    }

    public Integer getWaittingCreatedQuotationOrder() {
        return waittingCreatedQuotationOrder;
    }

    public void setWaittingCreatedQuotationOrder(Integer waittingCreatedQuotationOrder) {
        this.waittingCreatedQuotationOrder = waittingCreatedQuotationOrder;
    }

    public Integer getWaittingConfirm() {
        return waittingConfirm;
    }

    public void setWaittingConfirm(Integer waittingConfirm) {
        this.waittingConfirm = waittingConfirm;
    }

    public Integer getWaittingReconstruct() {
        return waittingReconstruct;
    }

    public void setWaittingReconstruct(Integer waittingReconstruct) {
        this.waittingReconstruct = waittingReconstruct;
    }

    public Integer getOverTime() {
        return overTime;
    }

    public void setOverTime(Integer overTime) {
        this.overTime = overTime;
    }

    public Integer getFirstPartyReply() {
        return firstPartyReply;
    }

    public void setFirstPartyReply(Integer firstPartyReply) {
        this.firstPartyReply = firstPartyReply;
    }

    public Integer getWaittingCreatedExpenseOrder() {
        return waittingCreatedExpenseOrder;
    }

    public void setWaittingCreatedExpenseOrder(Integer waittingCreatedExpenseOrder) {
        this.waittingCreatedExpenseOrder = waittingCreatedExpenseOrder;
    }

    public Integer getWaittingReapproved() {
        return waittingReapproved;
    }

    public void setWaittingReapproved(Integer waittingReapproved) {
        this.waittingReapproved = waittingReapproved;
    }

    public Integer getReapproved() {
        return reapproved;
    }

    public void setReapproved(Integer reapproved) {
        this.reapproved = reapproved;
    }

    public Integer getConsultationProcessed() {
        return consultationProcessed;
    }

    public void setConsultationProcessed(Integer consultationProcessed) {
        this.consultationProcessed = consultationProcessed;
    }

    public Integer getUnapprovedExpense() {
        return unapprovedExpense;
    }

    public void setUnapprovedExpense(Integer unapprovedExpense) {
        this.unapprovedExpense = unapprovedExpense;
    }

    public Integer getWeekRepairsCount() {
        return weekRepairsCount;
    }

    public void setWeekRepairsCount(Integer weekRepairsCount) {
        this.weekRepairsCount = weekRepairsCount;
    }

    public Integer getWeekRepairsEndCount() {
        return weekRepairsEndCount;
    }

    public void setWeekRepairsEndCount(Integer weekRepairsEndCount) {
        this.weekRepairsEndCount = weekRepairsEndCount;
    }

    public Integer getWaitQuoteCount() {
        return waitQuoteCount;
    }

    public void setWaitQuoteCount(Integer waitQuoteCount) {
        this.waitQuoteCount = waitQuoteCount;
    }

    public Integer getInnerRejectCount() {
        return innerRejectCount;
    }

    public void setInnerRejectCount(Integer innerRejectCount) {
        this.innerRejectCount = innerRejectCount;
    }

    public Integer getWaitInnerCount() {
        return waitInnerCount;
    }

    public void setWaitInnerCount(Integer waitInnerCount) {
        this.waitInnerCount = waitInnerCount;
    }

    public Integer getRejectWaitDealCount() {
        return rejectWaitDealCount;
    }

    public void setRejectWaitDealCount(Integer rejectWaitDealCount) {
        this.rejectWaitDealCount = rejectWaitDealCount;
    }

    public Integer getpUrgentOrdersCount() {
        return pUrgentOrdersCount;
    }

    public void setpUrgentOrdersCount(Integer pUrgentOrdersCount) {
        this.pUrgentOrdersCount = pUrgentOrdersCount;
    }

    public Integer getpRejectOrdersCount() {
        return pRejectOrdersCount;
    }

    public void setpRejectOrdersCount(Integer pRejectOrdersCount) {
        this.pRejectOrdersCount = pRejectOrdersCount;
    }

    public Integer getpOverdueOrdersCount() {
        return pOverdueOrdersCount;
    }

    public void setpOverdueOrdersCount(Integer pOverdueOrdersCount) {
        this.pOverdueOrdersCount = pOverdueOrdersCount;
    }

    public Integer getpUnFinishedCount() {
        return pUnFinishedCount;
    }

    public void setpUnFinishedCount(Integer pUnFinishedCount) {
        this.pUnFinishedCount = pUnFinishedCount;
    }

    public Integer getpWaitreceivingCount() {
        return pWaitreceivingCount;
    }

    public void setpWaitreceivingCount(Integer pWaitreceivingCount) {
        this.pWaitreceivingCount = pWaitreceivingCount;
    }

    public Integer getpDraftOrderCount() {
        return pDraftOrderCount;
    }

    public void setpDraftOrderCount(Integer pDraftOrderCount) {
        this.pDraftOrderCount = pDraftOrderCount;
    }

    public Integer getpSortListsCount() {
        return pSortListsCount;
    }

    public void setpSortListsCount(Integer pSortListsCount) {
        this.pSortListsCount = pSortListsCount;
    }

    public Integer getpComplainOrdersCount() {
        return pComplainOrdersCount;
    }

    public void setpComplainOrdersCount(Integer pComplainOrdersCount) {
        this.pComplainOrdersCount = pComplainOrdersCount;
    }

    public Long getEmergencyRepair() {
        return emergencyRepair;
    }

    public void setEmergencyRepair(Long emergencyRepair) {
        this.emergencyRepair = emergencyRepair;
    }

    public Long getReportPricing() {
        return reportPricing;
    }

    public void setReportPricing(Long reportPricing) {
        this.reportPricing = reportPricing;
    }

    public Long getComplain() {
        return complain;
    }

    public void setComplain(Long complain) {
        this.complain = complain;
    }

    public Long getQuoteReject() {
        return quoteReject;
    }

    public void setQuoteReject(Long quoteReject) {
        this.quoteReject = quoteReject;
    }

    public Long getUnCompleteServiceOrder() {
        return unCompleteServiceOrder;
    }

    public void setUnCompleteServiceOrder(Long unCompleteServiceOrder) {
        this.unCompleteServiceOrder = unCompleteServiceOrder;
    }

    public Integer getWaittingStayfirsrtrial() {
        return waittingStayfirsrtrial;
    }

    public void setWaittingStayfirsrtrial(Integer waittingStayfirsrtrial) {
        this.waittingStayfirsrtrial = waittingStayfirsrtrial;
    }
}
