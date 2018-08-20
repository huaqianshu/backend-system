package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Robin on 16/12/27.
 */
public class Setting extends AbstractPersistable {

    private static final long serialVersionUID = -4653210555831740594L;

    //是否自动预审
    private Boolean isAutoPreviewForQuotation=false;

    //全连路展示类型
    private ServiceOverallDisplayType serviceOverallDisplayType= ServiceOverallDisplayType.ANYCALL;

    //是否启用逾期服务
    private Boolean useExpiredService=false;

    //是否启用报价审核
    private Boolean useQuotationAudit=false;

    //工人Android APP版本号
    private Integer wVersionCode;

    //工人Android APP版本名称
    private String wVersionName;
    //ANY-SHOP安卓APP版本号
    private Integer sVersionCode;

    //ANY-SHOP安卓APP版本名称
    private String sVersionName;
    //更新人
    private String updater;

    //更新时间
    private Date updateTime;

    //是否启用dashboard自动刷新
    private Boolean useReloadDashboard=false;

    public Boolean getUseReloadDashboard() {
        return useReloadDashboard;
    }

    public void setUseReloadDashboard(Boolean useReloadDashboard) {
        this.useReloadDashboard = useReloadDashboard;
    }

    public Boolean getIsAutoPreviewForQuotation() {
        return isAutoPreviewForQuotation;
    }

    public void setIsAutoPreviewForQuotation(Boolean autoPreviewForQuotation) {
        isAutoPreviewForQuotation = autoPreviewForQuotation;
    }

    public ServiceOverallDisplayType getServiceOverallDisplayType() {
        return serviceOverallDisplayType;
    }

    public void setServiceOverallDisplayType(ServiceOverallDisplayType serviceOverallDisplayType) {
        this.serviceOverallDisplayType = serviceOverallDisplayType;
    }

    public Boolean getUseExpiredService() {
        return useExpiredService;
    }

    public void setUseExpiredService(Boolean useExpiredService) {
        this.useExpiredService = useExpiredService;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getwVersionCode() {
        return wVersionCode;
    }

    public void setwVersionCode(Integer wVersionCode) {
        this.wVersionCode = wVersionCode;
    }

    public String getwVersionName() {
        return wVersionName;
    }

    public void setwVersionName(String wVersionName) {
        this.wVersionName = wVersionName;
    }

    public Boolean getUseQuotationAudit() {
        return useQuotationAudit;
    }

    public void setUseQuotationAudit(Boolean useQuotationAudit) {
        this.useQuotationAudit = useQuotationAudit;
    }

    public Integer getsVersionCode() {
        return sVersionCode;
    }

    public void setsVersionCode(Integer sVersionCode) {
        this.sVersionCode = sVersionCode;
    }

    public String getsVersionName() {
        return sVersionName;
    }

    public void setsVersionName(String sVersionName) {
        this.sVersionName = sVersionName;
    }
}
