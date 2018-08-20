package com.anycall.base.model.common;

/**
 * Created by harold on  16/12/08.
 * Copyright © 2014-2016 ants-city.com
 */
public enum AttentionType {
    // 急修
    EMERGENCYREPAIR,
    // 待接服务单
    WATINGSERVICEORDER,
    // 预审报价
    PRETRIALQUOTATION,
    // 审批报价
    APPROVEQUOTATION,
    // 提交审批
    STAYRECHECKQUOTATION,
    // 咨询回复
    REPLYCONSULTATION,
    // 报销制单
    REIMBURSEMENTORDER,
    // 报价驳回
    QUOTEREJECT,
    //报价甲方驳回
    COUSTOMERQUOTEREJECT,
    // 报价中
    REPORTPRICING,
    // 投诉
    COMPLAIN,
    //工单接单
    WORKORDERCONFIRMED,
    //工单签到
    WORKORDERSIGNED,
    //工单完修
    WORKORDERFINISH,
    //工单签到后超时（未处理）
    WORKORDERSIGNEDOVERTIME,
    //结算单审批
    SETTLEMENTAPPROVE

}
