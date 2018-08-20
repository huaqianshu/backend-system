package com.anycall.base.model.business.vo;

import com.anycall.base.model.business.Reimbursement;
import com.anycall.base.model.business.ReimbursementItem;
import com.anycall.base.model.business.ReimbursementLine;

import java.util.List;


public class SerchTreePayeeVo extends Reimbursement {

    private List<ReimbursementLine>reimbursementLines;

    private List<ReimbursementItem>reimbursementItems;

    private WorkOrderVo workOrder;


    public List<ReimbursementLine> getReimbursementLines() {
        return reimbursementLines;
    }

    public void setReimbursementLines(List<ReimbursementLine> reimbursementLines) {
        this.reimbursementLines = reimbursementLines;
    }

    public List<ReimbursementItem> getReimbursementItems() {
        return reimbursementItems;
    }

    public void setReimbursementItems(List<ReimbursementItem> reimbursementItems) {
        this.reimbursementItems = reimbursementItems;
    }


    public WorkOrderVo getWorkOrder() {
        return workOrder;
    }

    public void setWorkOrder(WorkOrderVo workOrder) {
        this.workOrder = workOrder;
    }
}
