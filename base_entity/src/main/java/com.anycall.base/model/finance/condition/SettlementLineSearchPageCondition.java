package com.anycall.base.model.finance.condition;

import com.anycall.base.model.common.condition.QuickSearchOrgPageCondition;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SettlementLineSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -518937801756002402L;

    private Long foreignKey;

    private Long stateId;

    private Long cityId;

    private Long districtId;

    private String type;

    private String receiptStatus;

    private List<Long> settlementDetailLineIds;

    public Long getForeignKey() {
        return foreignKey;
    }

    public void setForeignKey(Long foreignKey) {
        this.foreignKey = foreignKey;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Long districtId) {
        this.districtId = districtId;
    }

    public String getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(String receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    public List<Long> getSettlementDetailLineIds() {
        return settlementDetailLineIds;
    }

    public void setSettlementDetailLineIds(List<Long> settlementDetailLineIds) {
        this.settlementDetailLineIds = settlementDetailLineIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SettlementLineSearchPageCondition that = (SettlementLineSearchPageCondition) o;
        return Objects.equals(foreignKey, that.foreignKey) &&
                Objects.equals(stateId, that.stateId) &&
                Objects.equals(cityId, that.cityId) &&
                Objects.equals(districtId, that.districtId) &&
                Objects.equals(type, that.type) &&
                Objects.equals(receiptStatus, that.receiptStatus) &&
                Objects.equals(settlementDetailLineIds, that.settlementDetailLineIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foreignKey, stateId, cityId, districtId, type, receiptStatus, settlementDetailLineIds);
    }
}
