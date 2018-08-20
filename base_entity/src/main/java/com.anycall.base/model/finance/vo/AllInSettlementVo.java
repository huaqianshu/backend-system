package com.anycall.base.model.finance.vo;

import com.anycall.base.model.finance.AllInSettlement;
import com.anycall.base.model.finance.AllInSettlementLine;
import com.anycall.base.model.finance.bo.AllInSettlementLineBo;

import java.util.List;

/**
 * Created by Auser on 2016/9/26.
 */
public class AllInSettlementVo extends AllInSettlement {

    private static final long serialVersionUID = 5282319828470803658L;

    private List<AllInSettlementLineBo> settlementLines;

    public List<AllInSettlementLineBo> getSettlementLines() {
        return settlementLines;
    }

    public void setSettlementLines(List<AllInSettlementLineBo> settlementLines) {
        this.settlementLines = settlementLines;
    }
}
