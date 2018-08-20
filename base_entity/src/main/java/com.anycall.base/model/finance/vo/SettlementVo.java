package com.anycall.base.model.finance.vo;

import com.anycall.base.model.finance.Settlement;
import com.anycall.base.model.finance.SettlementDetailLine;
import com.anycall.base.model.finance.SettlementMonthLine;
import com.anycall.base.model.finance.bo.SettlementDetailLineBo;
import com.anycall.base.model.finance.bo.SettlementMonthLineBo;

import java.util.List;

/**
 * Created by zheng on 2016/9/26.
 */
public class SettlementVo extends Settlement {
    private static final long serialVersionUID = 4380383294895184379L;
    private List<SettlementDetailLineBo> detailLines;
    private List<SettlementMonthLineBo> monthLines;
    private List<String> affixImgs;
    private String affix;

    public List<SettlementDetailLineBo> getDetailLines() {
        return detailLines;
    }

    public void setDetailLines(List<SettlementDetailLineBo> detailLines) {
        this.detailLines = detailLines;
    }

    public List<SettlementMonthLineBo> getMonthLines() {
        return monthLines;
    }

    public void setMonthLines(List<SettlementMonthLineBo> monthLines) {
        this.monthLines = monthLines;
    }

    public List<String> getAffixImgs() {
        return affixImgs;
    }

    public void setAffixImgs(List<String> affixImgs) {
        this.affixImgs = affixImgs;
    }

    public String getAffix() {
        return affix;
    }

    public void setAffix(String affix) {
        this.affix = affix;
    }
}
