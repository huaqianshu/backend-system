package com.anycall.base.model.business.vo;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.business.AllInQuotationOrder;
import com.anycall.base.model.business.bo.QuotationOrderBo;

import java.util.Date;
import java.util.List;


public class AllInQuotationOrderVo extends AllInQuotationOrder {

    //单号
    private String alwaysQuotationOrderNo;

    //品牌
    private Long companyBrandId;

    //门店
    private String shopCode;

    //总报价
    private Double alwaysquoteTotals;

    //总成本
    private Double alwayscostTotals;

    //总毛利率
    private Double alwaysgrossProfitRate;

    //最后更新时间
    private Date updateTime;

    private List<QuotationOrderVo> quoList;

    public List<QuotationOrderVo> getQuoList() {
        return quoList;
    }

    public void setQuoList(List<QuotationOrderVo> quoList) {
        this.quoList = quoList;
    }
}
