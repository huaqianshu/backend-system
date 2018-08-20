package com.anycall.base.model.finance.bo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.finance.vo.SettlementQuotationLineItemVo;

import java.util.List;

/**
 * Created by Amy on 2017/3/1.
 */
public class ExcelExportBo extends AbstractPersistable {

    private static final long serialVersionUID = -5802085992988749202L;

    private SettlementQuotationExcelBo settlementQuotation;

    private List<SettlementQuotationLineItemVo> items;

    private SettlementQuotCatalogueBo catalogueBo;

    private Integer index;

    private Integer count;

    public SettlementQuotationExcelBo getSettlementQuotation() {
        return settlementQuotation;
    }

    public void setSettlementQuotation(SettlementQuotationExcelBo settlementQuotation) {
        this.settlementQuotation = settlementQuotation;
    }

    public List<SettlementQuotationLineItemVo> getItems() {
        return items;
    }

    public void setItems(List<SettlementQuotationLineItemVo> items) {
        this.items = items;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public SettlementQuotCatalogueBo getCatalogueBo() {
        return catalogueBo;
    }

    public void setCatalogueBo(SettlementQuotCatalogueBo catalogueBo) {
        this.catalogueBo = catalogueBo;
    }
}
