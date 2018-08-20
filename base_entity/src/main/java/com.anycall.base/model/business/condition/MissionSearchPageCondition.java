package com.anycall.base.model.business.condition;


import com.anycall.base.common.PageCondition;

import java.util.Date;
import java.util.List;

public class MissionSearchPageCondition extends PageCondition {


    private static final long serialVersionUID = 3174788679270172600L;

    List<Long> orglizId;
    String status;

    private String missionSource;
    private Long memberId;
    private String workOrderNo;
    private boolean enable;
    private String [] shopAuths;
    private String assessment;
    //下一单id；
    private String nextworkorderno;
    //最后一次开机时间
    private Date lastupdatetime;

    private Long orgId;

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String[] getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String[] shopAuths) {
        this.shopAuths = shopAuths;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public List<Long> getOrglizId() {
        return orglizId;
    }

    public void setOrglizId(List<Long> orglizId) {
        this.orglizId = orglizId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMissionSource() {
        return missionSource;
    }

    public void setMissionSource(String missionSource) {
        this.missionSource = missionSource;
    }

    public String getWorkOrderNo() {
        return workOrderNo;
    }

    public void setWorkOrderNo(String workOrderNo) {
        this.workOrderNo = workOrderNo;
    }

    public String getNextworkorderno() {
        return nextworkorderno;
    }

    public void setNextworkorderno(String nextworkorderno) {
        this.nextworkorderno = nextworkorderno;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}
