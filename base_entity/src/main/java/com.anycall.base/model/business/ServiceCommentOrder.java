package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.CommentOrderStatus;

import java.util.Date;

/**
 * Created by Amy on 2016/12/17.
 */
public class ServiceCommentOrder extends AbstractPersistable{

    //服务单ID
    private Long serviceOrderId;

    //服务单号
    private String serviceOrderNo;

    //品牌ID
    private Long companyBrandId;

    //门店ID
    private Long companyId;

    //门店编码
    private String shopCode;

    //服务商ID
    private Long supplierId;

    //评价单状态
    private CommentOrderStatus commentOrderStatus;

    //质量评分
    private Double qualityScore;

    //态度评分
    private Double attitudeScore;

    //时效评分
    private Double efficiencyScore;

    //综合评分
    private Double synthesizeScore;

    //评价描述
    private String commentDesc;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    public Long getServiceOrderId() {
        return serviceOrderId;
    }

    public void setServiceOrderId(Long serviceOrderId) {
        this.serviceOrderId = serviceOrderId;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public Long getCompanyBrandId() {
        return companyBrandId;
    }

    public void setCompanyBrandId(Long companyBrandId) {
        this.companyBrandId = companyBrandId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public CommentOrderStatus getCommentOrderStatus() {
        return commentOrderStatus;
    }

    public void setCommentOrderStatus(CommentOrderStatus commentOrderStatus) {
        this.commentOrderStatus = commentOrderStatus;
    }

    public Double getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Double qualityScore) {
        this.qualityScore = qualityScore;
    }

    public Double getAttitudeScore() {
        return attitudeScore;
    }

    public void setAttitudeScore(Double attitudeScore) {
        this.attitudeScore = attitudeScore;
    }

    public Double getEfficiencyScore() {
        return efficiencyScore;
    }

    public void setEfficiencyScore(Double efficiencyScore) {
        this.efficiencyScore = efficiencyScore;
    }

    public Double getSynthesizeScore() {
        return synthesizeScore;
    }

    public void setSynthesizeScore(Double synthesizeScore) {
        this.synthesizeScore = synthesizeScore;
    }

    public String getCommentDesc() {
        return commentDesc;
    }

    public void setCommentDesc(String commentDesc) {
        this.commentDesc = commentDesc;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
