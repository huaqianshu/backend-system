package com.anycall.base.model.business.bo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.business.QuotationOrder;
import com.anycall.base.model.business.vo.ComplainVo;
import com.anycall.base.model.business.vo.MissionVo;
import com.anycall.base.model.common.Mission;
import com.anycall.base.model.finance.vo.SettlementVo;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Robin on 16/8/30.
 */
public class OrderRelationshipBo extends AbstractPersistable {

    private static final long serialVersionUID = -5140270143380011117L;

    ServiceOrderBo serviceOrderBo;

    QuotationOrder quotationOrder;

    SettlementVo settlementOrder;

    List<ComplainVo> complainOrders;

    List<HashMap<String,Object>> subRelatedOrders;

    List<MissionVo> missions;

    public List<MissionVo> getMissions() {
        return missions;
    }

    public void setMissions(List<MissionVo> missions) {
        this.missions = missions;
    }

    public ServiceOrderBo getServiceOrderBo() {
        return serviceOrderBo;
    }

    public void setServiceOrderBo(ServiceOrderBo serviceOrderBo) {
        this.serviceOrderBo = serviceOrderBo;
    }

    public QuotationOrder getQuotationOrder() {
        return quotationOrder;
    }

    public void setQuotationOrder(QuotationOrder quotationOrder) {
        this.quotationOrder = quotationOrder;
    }

    public SettlementVo getSettlementOrder() {
        return settlementOrder;
    }

    public void setSettlementOrder(SettlementVo settlementOrder) {
        this.settlementOrder = settlementOrder;
    }

    public List<ComplainVo> getComplainOrders() {
        return complainOrders;
    }

    public void setComplainOrders(List<ComplainVo> complainOrders) {
        this.complainOrders = complainOrders;
    }

    public List<HashMap<String, Object>> getSubRelatedOrders() {
        return subRelatedOrders;
    }

    public void setSubRelatedOrders(List<HashMap<String, Object>> subRelatedOrders) {
        this.subRelatedOrders = subRelatedOrders;
    }
}
