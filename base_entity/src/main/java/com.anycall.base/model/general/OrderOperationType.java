package com.anycall.base.model.general;

/**
 * Created by Amy on 2016/12/30.
 */
public enum OrderOperationType {
    //服务商已接单//拒绝接单//预计维修时间//签到//报价//已完修
    CONFIRMED,REJECT, EXPECTEDSERVICETIME, SIGNED,QUOTATION,FINISHED,CANCELED,NONE
}
