package com.anycall.base.model.common;

import java.io.Serializable;
import java.util.Date;

public class Mission  implements Serializable {
    private static final long serialVersionUID = 7389999130946333802L;
    private Long id;

    private String missionsource;

    private String workorderno;

    private String failure;

    private String shopcode;

    private Date createtime;

    private String slalevel;

    private Date estimatedstarttime;

    private Date estimatedendtime;

    private Date updatetime;

    private String updater;

    private Date realstarttime;

    private Date realendtime;

    private String assessment;

    private Long supplierid;

    private String status;

    private Integer enable;

    private String shopaddress;

    private String remarkreason;

    private String applytype;

    private Long memberid;

    private Date lastupdatetime;

    private String nextworkorderno;

    private Long reporterid;

    private Double distance;

    private Double lon;

    private Double lat;

    private String todoType;

    public String getTodoType() {
        return todoType;
    }

    public void setTodoType(String todoType) {
        this.todoType = todoType;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMissionsource() {
        return missionsource;
    }

    public void setMissionsource(String missionsource) {
        this.missionsource = missionsource == null ? null : missionsource.trim();
    }

    public String getWorkorderno() {
        return workorderno;
    }

    public void setWorkorderno(String workorderno) {
        this.workorderno = workorderno == null ? null : workorderno.trim();
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure == null ? null : failure.trim();
    }

    public String getShopcode() {
        return shopcode;
    }

    public void setShopcode(String shopcode) {
        this.shopcode = shopcode == null ? null : shopcode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getSlalevel() {
        return slalevel;
    }

    public void setSlalevel(String slalevel) {
        this.slalevel = slalevel == null ? null : slalevel.trim();
    }

    public Date getEstimatedstarttime() {
        return estimatedstarttime;
    }

    public void setEstimatedstarttime(Date estimatedstarttime) {
        this.estimatedstarttime = estimatedstarttime;
    }

    public Date getEstimatedendtime() {
        return estimatedendtime;
    }

    public void setEstimatedendtime(Date estimatedendtime) {
        this.estimatedendtime = estimatedendtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }

    public Date getRealstarttime() {
        return realstarttime;
    }

    public void setRealstarttime(Date realstarttime) {
        this.realstarttime = realstarttime;
    }

    public Date getRealendtime() {
        return realendtime;
    }

    public void setRealendtime(Date realendtime) {
        this.realendtime = realendtime;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment == null ? null : assessment.trim();
    }

    public Long getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Long supplierid) {
        this.supplierid = supplierid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress == null ? null : shopaddress.trim();
    }

    public String getRemarkreason() {
        return remarkreason;
    }

    public void setRemarkreason(String remarkreason) {
        this.remarkreason = remarkreason == null ? null : remarkreason.trim();
    }

    public String getApplytype() {
        return applytype;
    }

    public void setApplytype(String applytype) {
        this.applytype = applytype == null ? null : applytype.trim();
    }

    public Long getMemberid() {
        return memberid;
    }

    public void setMemberid(Long memberid) {
        this.memberid = memberid;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getNextworkorderno() {
        return nextworkorderno;
    }

    public void setNextworkorderno(String nextworkorderno) {
        this.nextworkorderno = nextworkorderno == null ? null : nextworkorderno.trim();
    }

    public Long getReporterid() {
        return reporterid;
    }

    public void setReporterid(Long reporterid) {
        this.reporterid = reporterid;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "id=" + id +
                ", missionsource='" + missionsource + '\'' +
                ", workorderno='" + workorderno + '\'' +
                ", failure='" + failure + '\'' +
                ", shopcode='" + shopcode + '\'' +
                ", createtime=" + createtime +
                ", slalevel='" + slalevel + '\'' +
                ", estimatedstarttime=" + estimatedstarttime +
                ", estimatedendtime=" + estimatedendtime +
                ", updatetime=" + updatetime +
                ", updater='" + updater + '\'' +
                ", realstarttime=" + realstarttime +
                ", realendtime=" + realendtime +
                ", assessment='" + assessment + '\'' +
                ", supplierid=" + supplierid +
                ", status='" + status + '\'' +
                ", enable=" + enable +
                ", shopaddress='" + shopaddress + '\'' +
                ", remarkreason='" + remarkreason + '\'' +
                ", applytype='" + applytype + '\'' +
                ", memberid=" + memberid +
                ", lastupdatetime=" + lastupdatetime +
                ", nextworkorderno='" + nextworkorderno + '\'' +
                ", reporterid=" + reporterid +
                ", distance=" + distance +
                '}';
    }
}