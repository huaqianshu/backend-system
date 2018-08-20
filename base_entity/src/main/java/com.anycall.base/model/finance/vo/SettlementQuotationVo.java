package com.anycall.base.model.finance.vo;

import com.anycall.base.model.finance.SettlementQuotation;

import java.util.List;

/**
 * Created by zheng on 2016/9/26.
 */
public class SettlementQuotationVo extends SettlementQuotation {
    private static final long serialVersionUID = 4380383291895184379L;
    private List<SettlementQuotationLineVo> lines;
    private List<String> affixImgs;
    private String affix;
    private String orgName;
    private String companyName;
    private String brandName;
    private String approverName;

    public List<SettlementQuotationLineVo> getLines() {
        return lines;
    }

    public void setLines(List<SettlementQuotationLineVo> lines) {
        this.lines = lines;
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

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getApproverName() {
        return approverName;
    }

    public void setApproverName(String approverName) {
        this.approverName = approverName;
    }
}
