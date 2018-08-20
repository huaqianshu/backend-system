package com.anycall.base.model.business.bo;

import java.io.Serializable;

/**
 * Created by Auser on 2016/10/20.
 */
public class AppEngHomeBo implements Serializable {

    private static final long serialVersionUID = 5118578209700811480L;

    private int soTotalCount;

    //服务单时按时完成
    private int soFinishOntimeCount;
    private String soFinishOntimeRate = "0";

    //服务单未按时完成
    private int soFinishDelayCount;
    private String soFinishDelayRate = "0";

    //服务单未完成
    private int soUnfinishCount;
    private String soUnfinishRate = "0";

    //服务单按时到达
    private int soArriveOntimeCount;
    private String soArriveOntimeRate = "0";

    //服务单未按时到达
    private int soArriveDelayCount;
    private String soArriveDelayRate = "0";

    //服务单未达到
    private int soUnarriveCount;
    private String soUnarriveRate = "0";


    //服务单逾期
    private int soExpiredCount;
    //报价待审核
    private int qoWaitingAuditCount;
    private int qoMineCount;

    //结算待审核
    private int settlementWaitingAuditCount;
    private int settlementMineCount;

    public int getSoTotalCount() {
        return soTotalCount;
    }

    public void setSoTotalCount(int soTotalCount) {
        this.soTotalCount = soTotalCount;
    }

    public int getSoFinishOntimeCount() {
        return soFinishOntimeCount;
    }

    public void setSoFinishOntimeCount(int soFinishOntimeCount) {
        this.soFinishOntimeCount = soFinishOntimeCount;
    }

    public String getSoFinishOntimeRate() {
        return soFinishOntimeRate;
    }

    public void setSoFinishOntimeRate(String soFinishOntimeRate) {
        this.soFinishOntimeRate = soFinishOntimeRate;
    }

    public int getSoFinishDelayCount() {
        return soFinishDelayCount;
    }

    public void setSoFinishDelayCount(int soFinishDelayCount) {
        this.soFinishDelayCount = soFinishDelayCount;
    }

    public String getSoFinishDelayRate() {
        return soFinishDelayRate;
    }

    public void setSoFinishDelayRate(String soFinishDelayRate) {
        this.soFinishDelayRate = soFinishDelayRate;
    }

    public int getSoUnfinishCount() {
        return soUnfinishCount;
    }

    public void setSoUnfinishCount(int soUnfinishCount) {
        this.soUnfinishCount = soUnfinishCount;
    }

    public String getSoUnfinishRate() {
        return soUnfinishRate;
    }

    public void setSoUnfinishRate(String soUnfinishRate) {
        this.soUnfinishRate = soUnfinishRate;
    }

    public int getSoArriveOntimeCount() {
        return soArriveOntimeCount;
    }

    public void setSoArriveOntimeCount(int soArriveOntimeCount) {
        this.soArriveOntimeCount = soArriveOntimeCount;
    }

    public String getSoArriveOntimeRate() {
        return soArriveOntimeRate;
    }

    public void setSoArriveOntimeRate(String soArriveOntimeRate) {
        this.soArriveOntimeRate = soArriveOntimeRate;
    }

    public int getSoArriveDelayCount() {
        return soArriveDelayCount;
    }

    public void setSoArriveDelayCount(int soArriveDelayCount) {
        this.soArriveDelayCount = soArriveDelayCount;
    }

    public String getSoArriveDelayRate() {
        return soArriveDelayRate;
    }

    public void setSoArriveDelayRate(String soArriveDelayRate) {
        this.soArriveDelayRate = soArriveDelayRate;
    }

    public int getSoUnarriveCount() {
        return soUnarriveCount;
    }

    public void setSoUnarriveCount(int soUnarriveCount) {
        this.soUnarriveCount = soUnarriveCount;
    }

    public String getSoUnarriveRate() {
        return soUnarriveRate;
    }

    public void setSoUnarriveRate(String soUnarriveRate) {
        this.soUnarriveRate = soUnarriveRate;
    }

    public int getSoExpiredCount() {
        return soExpiredCount;
    }

    public void setSoExpiredCount(int soExpiredCount) {
        this.soExpiredCount = soExpiredCount;
    }

    public int getQoWaitingAuditCount() {
        return qoWaitingAuditCount;
    }

    public void setQoWaitingAuditCount(int qoWaitingAuditCount) {
        this.qoWaitingAuditCount = qoWaitingAuditCount;
    }

    public int getQoMineCount() {
        return qoMineCount;
    }

    public void setQoMineCount(int qoMineCount) {
        this.qoMineCount = qoMineCount;
    }

    public int getSettlementWaitingAuditCount() {
        return settlementWaitingAuditCount;
    }

    public void setSettlementWaitingAuditCount(int settlementWaitingAuditCount) {
        this.settlementWaitingAuditCount = settlementWaitingAuditCount;
    }

    public int getSettlementMineCount() {
        return settlementMineCount;
    }

    public void setSettlementMineCount(int settlementMineCount) {
        this.settlementMineCount = settlementMineCount;
    }
}
