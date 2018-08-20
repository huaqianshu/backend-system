package com.anycall.base.model.business.bo;


/**
 * Created by Robin on 16/8/30.
 */
public class PlatformDashboardStatisticBo {

    private static final long serialVersionUID = 1796853221412232294L;
    private String region;//区域
    private Long districtId;
    private Long brandId;
    private Long stateId;
    private String regionPR;
    private String brandName;//品牌
    private String stateName;//省
    private String realName;//经理名字
    private int soAppealNum;//申诉单数
    private int soWaitReceivingNum;//待接单数
    private int soUndispatchNum;//未派工数
    private int soDispatchedNum;//已派工数
    private int soFinishedNum;//完成数
    private int soUnfinishedNum;//未完成数
    private int qoApprovedNum;//报价通过数
    private int qoPreparingNum;//报价制单数
    private int qoWaitApproveNum;//报价审批数
    private int qoApproveRejectedNum;//报价驳回数
    private int qoTotalNum;//报价总数
    private int qoDoWithoutApprovedNum;//先做后报数
    private int qoLowProfitRateNum;//毛利率不达标数
    private int soTotalNum;//总单数
    private String soFinishRate;//完成率
    private String qoApprovedRate;//报价通过率
    private int soQuotingNum;//报价中
    private int soUnderwayNum;//进行中
    private String withoutQuoFinishRate;//去报价完工率
    private int orgFinishiNum;//服务商完工单
    private Long dispatcherId;

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public String getRegionPR() {
        return regionPR;
    }

    public void setRegionPR(String regionPR) {
        this.regionPR = regionPR;
    }

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public int getSoQuotingNum() {
        return soQuotingNum;
    }

    public void setSoQuotingNum(int soQuotingNum) {
        this.soQuotingNum = soQuotingNum;
    }

    public int getSoUnderwayNum() {
        return soUnderwayNum;
    }

    public void setSoUnderwayNum(int soUnderwayNum) {
        this.soUnderwayNum = soUnderwayNum;
    }

    public String getWithoutQuoFinishRate() {
        return withoutQuoFinishRate;
    }

    public void setWithoutQuoFinishRate(String withoutQuoFinishRate) {
        this.withoutQuoFinishRate = withoutQuoFinishRate;
    }

    public int getOrgFinishiNum() {
        return orgFinishiNum;
    }

    public void setOrgFinishiNum(int orgFinishiNum) {
        this.orgFinishiNum = orgFinishiNum;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
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
