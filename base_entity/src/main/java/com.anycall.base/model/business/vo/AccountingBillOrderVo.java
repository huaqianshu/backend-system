package com.anycall.base.model.business.vo;

import com.anycall.base.model.business.AccountingBillOrder;
import com.anycall.base.model.business.AccountingBillOrderLine;

import java.util.List;

/**
 * Created by Auser on 2016/9/28.
 */
public class AccountingBillOrderVo extends AccountingBillOrder {

    private List<AccountingBillOrderLine> busList;

    private String companyName;

    private String orgName;

    public List<AccountingBillOrderLine> getBusList() {
        return busList;
    }

    public void setBusList(List<AccountingBillOrderLine> busList) {
        this.busList = busList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }
}
