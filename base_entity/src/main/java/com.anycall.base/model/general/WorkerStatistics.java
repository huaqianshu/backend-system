package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by Amy on 2016/12/17.
 */
public class WorkerStatistics extends AbstractPersistable{
    //工人ID
    private Long workerId;

    //服务商ID
    private Long supplierId;

    //员工等级
    private WorkerRank workerRank;

    //评分
    private Double commentScore;

    //完成服务单数
    private Integer serviceOrderNum;

    //完成工单数
    private Integer workOrderNum;

    //评价次数
    private Integer commentNum;

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public WorkerRank getWorkerRank() {
        return workerRank;
    }

    public void setWorkerRank(WorkerRank workerRank) {
        this.workerRank = workerRank;
    }

    public Double getCommentScore() {
        return commentScore;
    }

    public void setCommentScore(Double commentScore) {
        this.commentScore = commentScore;
    }

    public Integer getWorkOrderNum() {
        return workOrderNum;
    }

    public void setWorkOrderNum(Integer workOrderNum) {
        this.workOrderNum = workOrderNum;
    }

    public Integer getServiceOrderNum() {
        return serviceOrderNum;
    }

    public void setServiceOrderNum(Integer serviceOrderNum) {
        this.serviceOrderNum = serviceOrderNum;
    }
}
