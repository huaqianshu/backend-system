package com.anycall.base.model.business.vo;

import com.anycall.base.model.business.ServiceOrder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robin on 16/8/30.
 */
public class ServiceOrderVo extends ServiceOrder {

    private static final long serialVersionUID = 8854438355175104075L;

    private Long sortId;

    private List<String> selfieImgs;
    private List<String> soundImgs;

    List<ServiceOrderLineVo> lines=new ArrayList<>();
    //优衣库质保截止日期
    private String qualityEndTime;

    private Long followQuotationOrderId;
    private String followQuotationOrderNo;

    public String getQualityEndTime() {
        return qualityEndTime;
    }

    public void setQualityEndTime(String qualityEndTime) {
        this.qualityEndTime = qualityEndTime;
    }
    public List<ServiceOrderLineVo> getLines() {
        return lines;
    }

    public void setLines(List<ServiceOrderLineVo> lines) {
        this.lines = lines;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public List<String> getSelfieImgs() {
        return selfieImgs;
    }

    public void setSelfieImgs(List<String> selfieImgs) {
        this.selfieImgs = selfieImgs;
    }

    public List<String> getSoundImgs() {
        return soundImgs;
    }

    public void setSoundImgs(List<String> soundImgs) {
        this.soundImgs = soundImgs;
    }

    public Long getFollowQuotationOrderId() {
        return followQuotationOrderId;
    }

    public void setFollowQuotationOrderId(Long followQuotationOrderId) {
        this.followQuotationOrderId = followQuotationOrderId;
    }

    public String getFollowQuotationOrderNo() {
        return followQuotationOrderNo;
    }

    public void setFollowQuotationOrderNo(String followQuotationOrderNo) {
        this.followQuotationOrderNo = followQuotationOrderNo;
    }
}
