package com.anycall.base.model.finance;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.MemberType;
import com.anycall.base.model.finance.vo.SettlementQuotationLineItemVo;
import com.anycall.base.model.finance.vo.SettlementQuotationLineVo;
import com.google.gson.Gson;


public class SettlementQuotationLastData extends AbstractPersistable {

    private static final long serialVersionUID = 4714711226082082698L;

    private static Gson gson = new Gson();


    private Long relatedId;

    //order、item、line
    private String dataType;

    //审批单价
    private Double unitPrice;

    //审批数量
    private Double number;

    //审批总计
    private Double totalPrice;

    public Long getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(Long relatedId) {
        this.relatedId = relatedId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public static SettlementQuotationLastData createItem(SettlementQuotationLineItemVo lastItem, SettlementQuotationLineItemVo newItem, MemberType memberType, boolean isSelfCopy) {
        SettlementQuotationLastData data = new SettlementQuotationLastData();
        data.setDataType("Item");
        data.setRelatedId(lastItem.getId());
        if (isSettlementMode(memberType, isSelfCopy)) {
            data.setUnitPrice(lastItem.getSettlementUnitPrice());
            data.setNumber(lastItem.getSettlementNumber());
            data.setTotalPrice(lastItem.getSettlementTotal());
            newItem.setLastSettlementData(gson.toJson(data));
        } else {
            data.setUnitPrice(lastItem.getApprovalUnitPrice());
            data.setNumber(lastItem.getApprovalNumber());
            data.setTotalPrice(lastItem.getTotalApproval());
            newItem.setLastApprovalData(gson.toJson(data));
        }
        return data;
    }


    public static SettlementQuotationLastData createLine(SettlementQuotationLine listLine, SettlementQuotationLineVo newLine, MemberType memberType, boolean isSelfCopy) {
        SettlementQuotationLastData data = new SettlementQuotationLastData();
        data.setDataType("Line");
        data.setRelatedId(listLine.getId());
        if (isSettlementMode(memberType, isSelfCopy)) {
            data.setTotalPrice(listLine.getSettlementPrice());
            newLine.setLastSettlementData(gson.toJson(data));
        } else {
            data.setTotalPrice(listLine.getApprovedPrice());
            newLine.setLastApprovalData(gson.toJson(data));
        }
        return data;
    }

    public static SettlementQuotationLastData createOrder(SettlementQuotation lastOrder, SettlementQuotation newOrder, MemberType memberType, boolean isSelfCopy) {
        SettlementQuotationLastData data = new SettlementQuotationLastData();
        data.setDataType("Order");
        data.setRelatedId(lastOrder.getId());
        if (isSettlementMode(memberType, isSelfCopy)) {
            data.setTotalPrice(lastOrder.getSettlementPrice());
            newOrder.setLastSettlementData(gson.toJson(data));
        } else {
            data.setTotalPrice(lastOrder.getApprovedPrice());
            newOrder.setLastApprovalData(gson.toJson(data));
        }
        return data;
    }

    private static boolean isSettlementMode(MemberType memberType, boolean isSelfCopy) {
        boolean isSettlementMode = false;
        if ((memberType == MemberType.SUPPLIER || memberType == MemberType.PLATFORM) && isSelfCopy) {
            isSettlementMode = true;
        } else if ((memberType == MemberType.SUPPLIER || memberType == MemberType.PLATFORM) && !isSelfCopy) {
            isSettlementMode = false;
        } else if (memberType == MemberType.CUSTOMER && isSelfCopy) {
            isSettlementMode = false;
        } else if (memberType == MemberType.CUSTOMER && !isSelfCopy) {
            isSettlementMode = true;
        }
        return isSettlementMode;
    }
}
