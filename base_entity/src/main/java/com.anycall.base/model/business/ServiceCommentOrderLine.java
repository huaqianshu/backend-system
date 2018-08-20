package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by Amy on 2016/12/17.
 */
public class ServiceCommentOrderLine extends AbstractPersistable {

    //服务评价单ID
    private Long commentOrderId;

    //工单ID
    private Long workOrderId;

    //工单号
    private String workOrderNo;

    //得分
    private Double score;

    //员工编号
    private Long staffId;

    public Long getCommentOrderId() {
        return commentOrderId;
    }

    public void setCommentOrderId(Long commentOrderId) {
        this.commentOrderId = commentOrderId;
    }

    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }
}
