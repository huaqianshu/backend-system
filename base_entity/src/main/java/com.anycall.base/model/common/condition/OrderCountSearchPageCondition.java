package com.anycall.base.model.common.condition;

import java.util.List;
import java.util.Objects;

public class OrderCountSearchPageCondition extends QuickSearchOrgPageCondition {

    private static final long serialVersionUID = -4883740655569202046L;

    private String identifyType;

    private String orderType;
    private List<Long> orgTreeIds;
    private String shopAuths;
    private String orderCount;
    private String orderStatus;

    private String completedType;
    private String userMemberType;
    private Long dispatcherId;

    public Long getDispatcherId() {
        return dispatcherId;
    }

    public void setDispatcherId(Long dispatcherId) {
        this.dispatcherId = dispatcherId;
    }

    public String getUserMemberType() {
        return userMemberType;
    }

    public void setUserMemberType(String userMemberType) {
        this.userMemberType = userMemberType;
    }

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public String getShopAuths() {
        return shopAuths;
    }

    public void setShopAuths(String shopAuths) {
        this.shopAuths = shopAuths;
    }

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(String orderCount) {
        this.orderCount = orderCount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCompletedType() {
        return completedType;
    }

    public void setCompletedType(String completedType) {
        this.completedType = completedType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderCountSearchPageCondition that = (OrderCountSearchPageCondition) o;
        return Objects.equals(identifyType, that.identifyType)
                && Objects.equals(orderType, that.orderType)
                && Objects.equals(orderCount, that.orderCount)
                && Objects.equals(orderStatus, that.orderStatus)
                && Objects.equals(completedType, that.completedType)
                && Objects.equals(orgTreeIds, that.orgTreeIds)
                && Objects.equals(shopAuths, that.shopAuths)
                && Objects.equals(userMemberType, that.userMemberType)
                && Objects.equals(dispatcherId, that.dispatcherId)
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dispatcherId,userMemberType,shopAuths,orgTreeIds,identifyType, orderType, orderCount, orderStatus, completedType);
    }
}
