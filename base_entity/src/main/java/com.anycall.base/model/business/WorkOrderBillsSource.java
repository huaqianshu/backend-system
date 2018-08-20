package com.anycall.base.model.business;

/**
 * 工单产生来源
 */
public enum WorkOrderBillsSource {
    SERVICEORDER,//服务单，创建服务单时创建的
    PARALLELORDER,//pc端点击新建平行单创建
    EXPIRED,//逾期，逾期产生的
    QUOTATIONAPPROVE,//报价审批，报价时产生的
    QUOTATIONPRETRIAL,//报价预审
    WORKORDERAPPLY//工单申请
}
