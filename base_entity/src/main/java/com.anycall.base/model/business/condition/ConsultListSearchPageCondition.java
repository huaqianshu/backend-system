package com.anycall.base.model.business.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Objects;

/**
 * Created by hachi on 2016/11/4.
 */
public class ConsultListSearchPageCondition extends QuickSearchOrgPageCondition {
    private static final long serialVersionUID = -8039599285327355573L;
    private String serviceOrderNo;
    private String consultStatus;

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public String getConsultStatus() {
        return consultStatus;
    }

    public void setConsultStatus(String consultStatus) {
        this.consultStatus = consultStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConsultListSearchPageCondition that = (ConsultListSearchPageCondition) o;
        return Objects.equals(serviceOrderNo, that.serviceOrderNo)
                && Objects.equals(consultStatus, that.consultStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), serviceOrderNo, consultStatus);
    }
}
