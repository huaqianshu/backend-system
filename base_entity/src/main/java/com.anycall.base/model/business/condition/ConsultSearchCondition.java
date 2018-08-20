package com.anycall.base.model.business.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Objects;

/**
 * Created by Amy on 2016/12/6.
 */
public class ConsultSearchCondition extends QuickSearchOrgPageCondition {


    private static final long serialVersionUID = -8028520008489587004L;
    private Long memberId;

    private String consultStatus;
    private Long id;
    private String serviceOrderNo;
    private Long expectMemberId;//查询排除

    public Long getExpectMemberId() {
        return expectMemberId;
    }

    public void setExpectMemberId(Long expectMemberId) {
        this.expectMemberId = expectMemberId;
    }


    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getConsultStatus() {
        return consultStatus;
    }

    public void setConsultStatus(String consultStatus) {
        this.consultStatus = consultStatus;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConsultSearchCondition that = (ConsultSearchCondition) o;
        return Objects.equals(memberId, that.memberId) &&
                Objects.equals(consultStatus, that.consultStatus)&&
                Objects.equals(serviceOrderNo, that.serviceOrderNo)&&
                Objects.equals(expectMemberId, that.expectMemberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memberId, consultStatus,serviceOrderNo,expectMemberId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
