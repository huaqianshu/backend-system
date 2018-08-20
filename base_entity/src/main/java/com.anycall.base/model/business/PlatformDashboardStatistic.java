package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

/**
 * Created by Robin on 16/8/30.
 */
public class PlatformDashboardStatistic extends AbstractPersistable {

    private static final long serialVersionUID = 1796853221412232294L;

    private Integer brandId;
    private Long stateId;
    private String brandName;
    private String stateName;
    private int soAppealNum;
    private int soWaitReceivingNum;
    private int soUndispatchNum;
    private int soDispatchedNum;
    private int soFinishedNum;
    private int soUnfinishedNum;
    private int qoApprovedNum;
    private int qoPreparingNum;
    private int qoWaitApproveNum;
    private int qoApproveRejectedNum;
    private int qoTotalNum;
    private int qoDoWithoutApprovedNum;
    private int qoLowProfitRateNum;
    private int soTotalNum;
    private String soFinishRate;
    private String qoApprovedRate;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public int getSoAppealNum() {
        return soAppealNum;
    }

    public void setSoAppealNum(int soAppealNum) {
        this.soAppealNum = soAppealNum;
    }

    public int getSoWaitReceivingNum() {
        return soWaitReceivingNum;
    }

    public void setSoWaitReceivingNum(int soWaitReceivingNum) {
        this.soWaitReceivingNum = soWaitReceivingNum;
    }

    public int getSoUndispatchNum() {
        return soUndispatchNum;
    }

    public void setSoUndispatchNum(int soUndispatchNum) {
        this.soUndispatchNum = soUndispatchNum;
    }

    public int getSoDispatchedNum() {
        return soDispatchedNum;
    }

    public void setSoDispatchedNum(int soDispatchedNum) {
        this.soDispatchedNum = soDispatchedNum;
    }

    public int getSoFinishedNum() {
        return soFinishedNum;
    }

    public void setSoFinishedNum(int soFinishedNum) {
        this.soFinishedNum = soFinishedNum;
    }

    public int getSoUnfinishedNum() {
        return soUnfinishedNum;
    }

    public void setSoUnfinishedNum(int soUnfinishedNum) {
        this.soUnfinishedNum = soUnfinishedNum;
    }

    public int getQoApprovedNum() {
        return qoApprovedNum;
    }

    public void setQoApprovedNum(int qoApprovedNum) {
        this.qoApprovedNum = qoApprovedNum;
    }

    public int getQoTotalNum() {
        return qoTotalNum;
    }

    public void setQoTotalNum(int qoTotalNum) {
        this.qoTotalNum = qoTotalNum;
    }

    public int getQoDoWithoutApprovedNum() {
        return qoDoWithoutApprovedNum;
    }

    public void setQoDoWithoutApprovedNum(int qoDoWithoutApprovedNum) {
        this.qoDoWithoutApprovedNum = qoDoWithoutApprovedNum;
    }

    public int getQoLowProfitRateNum() {
        return qoLowProfitRateNum;
    }

    public void setQoLowProfitRateNum(int qoLowProfitRateNum) {
        this.qoLowProfitRateNum = qoLowProfitRateNum;
    }

    public int getSoTotalNum() {
        return soTotalNum;
    }

    public void setSoTotalNum(int soTotalNum) {
        this.soTotalNum = soTotalNum;
    }

    public String getSoFinishRate() {
        return soFinishRate;
    }

    public void setSoFinishRate(String soFinishRate) {
        this.soFinishRate = soFinishRate;
    }

    public String getQoApprovedRate() {
        return qoApprovedRate;
    }

    public void setQoApprovedRate(String qoApprovedRate) {
        this.qoApprovedRate = qoApprovedRate;
    }

    public int getQoPreparingNum() {
        return qoPreparingNum;
    }

    public void setQoPreparingNum(int qoPreparingNum) {
        this.qoPreparingNum = qoPreparingNum;
    }

    public int getQoApproveRejectedNum() {
        return qoApproveRejectedNum;
    }

    public void setQoApproveRejectedNum(int qoApproveRejectedNum) {
        this.qoApproveRejectedNum = qoApproveRejectedNum;
    }

    public int getQoWaitApproveNum() {
        return qoWaitApproveNum;
    }

    public void setQoWaitApproveNum(int qoWaitApproveNum) {
        this.qoWaitApproveNum = qoWaitApproveNum;
    }
}
