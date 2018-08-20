package com.anycall.base.model.business;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;
import java.util.List;

/**
 * Created by hachi on 16/11/4.
 */
public class ConsultList extends AbstractPersistable {

    private static final long serialVersionUID = 7671750517673637507L;
    private  String title;//标题
    private  String serviceOrderNo;//服务单号
    private  Long sponsorId;//咨询发起者
    private  String receiver;//咨询接收者
    private  ServiceOrderStatus serviceStatus;//服务状态
    private  String content;//咨询内容
    private ConsultStatus consultStatus = ConsultStatus.ACTIVE;//咨询状态
    private  Date consultTime;//咨询时间
    private  String updater;//操作人
    private List<String> consultImgs;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public Long getSponsorId() {
        return sponsorId;
    }

    public void setSponsorId(Long sponsorId) {
        this.sponsorId = sponsorId;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public ServiceOrderStatus getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(ServiceOrderStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getConsultTime() {
        return consultTime;
    }

    public void setConsultTime(Date consultTime) {
        this.consultTime = consultTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public ConsultStatus getConsultStatus() {
        return consultStatus;
    }

    public void setConsultStatus(ConsultStatus consultStatus) {
        this.consultStatus = consultStatus;
    }

    public List<String> getConsultImgs() {
        return consultImgs;
    }

    public void setConsultImgs(List<String> consultImgs) {
        this.consultImgs = consultImgs;
    }
}
