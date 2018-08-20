package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.vo.ConsultListVo;

/**
 * Created by hachi on 16/11/4.
 */
public class ConsultListBo extends ConsultListVo {
    private String  sponsor;
    private String mobileNo;

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }
}
