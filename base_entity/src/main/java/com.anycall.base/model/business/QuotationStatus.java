package com.anycall.base.model.business;

/**
 * Created by Robin on 16/8/30.stay
 */
public enum QuotationStatus {
        //乙方取消（管理）、甲方取消（处理）--待复审、复审驳回、甲方取消(客户取消、专员取消)
        STAYPRETRIAL,//待预审
        PRETRIALREJECT,//预审驳回
        DRAFT,//创建
        STAYFIRSRTRIAL,//待内审
        FIRSRTRIALREJECT,//内审驳回
        STAYRECHECK,//待审批
        RECHECKREJECT,//审批驳回
        RECHECKED,//已审批
        BYREJECT,//被驳回
        DENIALOFSERVICE,//拒绝维修
        CANCEL,//取消,用户查询取消的报价单操作。
        PARTYCANCEL,//乙方取消（待预审、待内审、先做报价待审批、所有驳回状态的报价单）
        OWNERCANCEL,//甲方取消(不用)
        RECHECKCANCEL,//审批取消，（只在先报后做、审批状态时取消。该关联工单不可再创建报价）
        STOP,//终止（任何情况下可以终止，包括甲方审批通过后）
        CLOSE,//合并单后，里面报价单状态
        MERGE,//合并
        MERGEREJECT//合并驳回
}
