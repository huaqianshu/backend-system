package com.anycall.base.model.finance;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.ChargingType;

import java.util.Date;

public class CustomTaxInformation extends AbstractPersistable {

    private static final long serialVersionUID = -8998794919644076619L;

    private Long companyId;

    //名称（取结算付款方，可修改）
    private String taxInformationName;
    //纳税人识别号
    private String identifyNo;
    //地址
    private String address;
    //电话
    private String phoneNum;
    //开户行
    private String depositBank;
    //帐号
    private String bankAccount;

    private boolean deleted = false;

    private String creator;

    private Date createTime;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getTaxInformationName() {
        return taxInformationName;
    }

    public void setTaxInformationName(String taxInformationName) {
        this.taxInformationName = taxInformationName;
    }

    public String getIdentifyNo() {
        return identifyNo;
    }

    public void setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDepositBank() {
        return depositBank;
    }

    public void setDepositBank(String depositBank) {
        this.depositBank = depositBank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
