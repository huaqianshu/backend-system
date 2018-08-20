package com.anycall.base.model.business.vo;


import com.anycall.base.model.business.PaymentOrder;
import com.anycall.base.model.business.bo.ReimbursementBo;


import java.util.Date;
import java.util.List;


public class PaymentOrderVo extends PaymentOrder {

    private List<ReimbursementBo> reimbursemenList;

    public List<ReimbursementBo> getReimbursemenList() {
        return reimbursemenList;
    }

    public void setReimbursemenList(List<ReimbursementBo> reimbursemenList) {
        this.reimbursemenList = reimbursemenList;
    }
}
