package com.anycall.base.model.finance;

import com.anycall.base.model.AbstractPersistable;
import com.anycall.base.model.account.ChargingType;

import java.util.Date;

/**
 * Created by fh on 2017/9/28.
 */
public class SettlementReceipt extends AbstractPersistable {

    private static final long serialVersionUID = -5472826011520239044L;

    //发票号码
    private String receiptNo;
    //结算单Id
    private Long settlementId;
    //服务商
    private Long orgId;
    //服务对象
    private Long companyId;
    //品牌
    private Long brandId;
    //状态
    private ReceiptStatus receiptStatus = ReceiptStatus.APPLYINVOICE;
    //待办
    private Boolean holding = false;
    //计费类型
    private ChargingType type;
    //结算明细行id
    private String settlementDetailLineIds;
    //门店/报价单(详情)
    private String shopsOrQuotationOrderIds;
    //月份1-12
    private String month;
    //税率
    private Double taxRate;
    //开票金额
    private Double receiptPrice;
    //金额totalPrice
    private Double noTaxPrice;
    //税额
    private Double taxPrice;
    //付款方名称
    private String paymentName;
    //发票抬头
    private String invoiceTitle;
    //开票内容
    private String receiptContent;
    //备注
    private String memo;
    //开票人
    private String drawer;
    //收款人
    private String payee;
    //更新人
    private String updater;
    //开票日期
    private Date receiptTime;
    //到账日期
    private Date receiptedTime;
    //创建日期
    private Date createTime;
    //更新日期
    private Date updateTime;
    //关联开票Id
    private Long relevanceReceiptId;
    //是否是冲正发票
    private Boolean reversalReceipt = false;
    //是否删除
    private boolean deleted = false;
    //纳税人名称
    private String taxInformationName;
    //纳税人识别号
    private String identifyNo;
    //纳税人地址
    private String address;
    //纳税人电话
    private String phoneNum;
    //纳税人开户行
    private String depositBank;
    //纳税人帐号
    private String bankAccount;

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public Long getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Long settlementId) {
        this.settlementId = settlementId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public ReceiptStatus getReceiptStatus() {
        return receiptStatus;
    }

    public void setReceiptStatus(ReceiptStatus receiptStatus) {
        this.receiptStatus = receiptStatus;
    }

    public Boolean getHolding() {
        return holding;
    }

    public void setHolding(Boolean holding) {
        this.holding = holding;
    }

    public ChargingType getType() {
        return type;
    }

    public void setType(ChargingType type) {
        this.type = type;
    }

    public String getSettlementDetailLineIds() {
        return settlementDetailLineIds;
    }

    public void setSettlementDetailLineIds(String settlementDetailLineIds) {
        this.settlementDetailLineIds = settlementDetailLineIds;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getReceiptPrice() {
        return receiptPrice;
    }

    public void setReceiptPrice(Double receiptPrice) {
        this.receiptPrice = receiptPrice;
    }

    public Double getNoTaxPrice() {
        return noTaxPrice;
    }

    public void setNoTaxPrice(Double noTaxPrice) {
        this.noTaxPrice = noTaxPrice;
    }

    public Double getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(Double taxPrice) {
        this.taxPrice = taxPrice;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getReceiptContent() {
        return receiptContent;
    }

    public void setReceiptContent(String receiptContent) {
        this.receiptContent = receiptContent;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getDrawer() {
        return drawer;
    }

    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    public Date getReceiptedTime() {
        return receiptedTime;
    }

    public void setReceiptedTime(Date receiptedTime) {
        this.receiptedTime = receiptedTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getRelevanceReceiptId() {
        return relevanceReceiptId;
    }

    public void setRelevanceReceiptId(Long relevanceReceiptId) {
        this.relevanceReceiptId = relevanceReceiptId;
    }

    public Boolean getReversalReceipt() {
        return reversalReceipt;
    }

    public void setReversalReceipt(Boolean reversalReceipt) {
        this.reversalReceipt = reversalReceipt;
    }

    public String getShopsOrQuotationOrderIds() {
        return shopsOrQuotationOrderIds;
    }

    public void setShopsOrQuotationOrderIds(String shopsOrQuotationOrderIds) {
        this.shopsOrQuotationOrderIds = shopsOrQuotationOrderIds;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
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
}
