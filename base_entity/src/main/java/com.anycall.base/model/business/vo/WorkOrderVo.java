package com.anycall.base.model.business.vo;

import com.anycall.base.model.business.WorkOrder;
import com.anycall.base.model.common.FileResource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Robin on 16/8/30.
 */
public class WorkOrderVo extends WorkOrder {

    private static final long serialVersionUID = -5570143255661988449L;

    private List<String> selfieImgs = new ArrayList<>();
    private List<String> repairBeforeImgs = new ArrayList<>();
    private List<String> itemImgs = new ArrayList<>();
    private List<String> repairAfterImgs = new ArrayList<>();
    private List<String> billsImgs = new ArrayList<>();
    private List<String> serviceOrderImgs = new ArrayList<>();
    private String voice;
    private List<String> serviceOrderVoices;
    private List<String> workOrderFiles;
    private List<String> reportImgs = new ArrayList<>();

    public List<String> getReportImgs() {
        return reportImgs;
    }

    public void setReportImgs(List<String> reportImgs) {
        this.reportImgs = reportImgs;
    }

    public List<String> getWorkOrderFiles() {
        return workOrderFiles;
    }

    public void setWorkOrderFiles(List<String> workOrderFiles) {
        this.workOrderFiles = workOrderFiles;
    }

    public List<String> getSelfieImgs() {
        return selfieImgs;
    }

    public void setSelfieImgs(List<String> selfieImgs) {
        this.selfieImgs = selfieImgs;
    }

    public List<String> getRepairBeforeImgs() {
        return repairBeforeImgs;
    }

    public void setRepairBeforeImgs(List<String> repairBeforeImgs) {
        this.repairBeforeImgs = repairBeforeImgs;
    }

    public List<String> getItemImgs() {
        return itemImgs;
    }

    public void setItemImgs(List<String> itemImgs) {
        this.itemImgs = itemImgs;
    }

    public List<String> getRepairAfterImgs() {
        return repairAfterImgs;
    }

    public void setRepairAfterImgs(List<String> repairAfterImgs) {
        this.repairAfterImgs = repairAfterImgs;
    }

    public List<String> getBillsImgs() {
        return billsImgs;
    }

    public void setBillsImgs(List<String> billsImgs) {
        this.billsImgs = billsImgs;
    }

    public List<String> getServiceOrderImgs() {
        return serviceOrderImgs;
    }

    public void setServiceOrderImgs(List<String> serviceOrderImgs) {
        this.serviceOrderImgs = serviceOrderImgs;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public List<String> getServiceOrderVoices() {
        return serviceOrderVoices;
    }

    public void setServiceOrderVoices(List<String> serviceOrderVoices) {
        this.serviceOrderVoices = serviceOrderVoices;
    }
}
