package com.anycall.base.model.finance;

/**
 * Created by zheng on 2016/9/26.
 */
public enum SettlementQuotationStatus {
    //草稿/待内审/内审驳回/待审批/审批驳回/已审批/已结算/取消
    DRAFT, SUBMITTED, CHECKREJECTED, CHECKED, AUDITREJECTED, AUDITED, SETTLEMENT, CANCELED;
}
