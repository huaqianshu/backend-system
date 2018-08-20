package com.anycall.base.model.finance;

/**
 * Created by fh on 2017/9/28.
 */
public enum ReceiptStatus {
    //开票(申请开票/内审通过/已开票/已收款/作废/已退票)
    //结算单行明细开票状态（未开票、开票中、已开票）
    NOTINVOICED,//未开票
    BILLING,//开票中
    APPLYINVOICE,//申请开票
    RECHECK,//内审通过
    INVOICE,//已开票
    RECEIPT,//已收款
    CANCELED,//取消(作废)
    REFUND,//已退票
}
