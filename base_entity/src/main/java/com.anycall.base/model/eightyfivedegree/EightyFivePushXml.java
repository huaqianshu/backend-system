package com.anycall.base.model.eightyfivedegree;

import com.anycall.base.model.business.ServiceOrder;
import com.anycall.base.model.business.WorkOrder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Robin on 2017/1/7.
 */
@XStreamAlias("File")
public class EightyFivePushXml {

    private static String objectToXml(EightyFivePushXml eightyFivePushXml){
        XStream xStream = new XStream();
        xStream.autodetectAnnotations(true);
        return  xStream.toXML(eightyFivePushXml);
    }
    private static  final  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd", Locale.CHINA);
    private static  final  SimpleDateFormat timeFormat = new SimpleDateFormat("HHmmss", Locale.CHINA);


    //服务商接单
    public static String generateReceiveConfirmMessage(ServiceOrder serviceOrder){
        EightyFivePushXml pushXml=new EightyFivePushXml();

        PushXmlTitle xmlTitle=new PushXmlTitle();
        xmlTitle.setType(138);
        xmlTitle.setCode(62);
        xmlTitle.setSer(serviceOrder.getThirdPartyServiceOrderNo());
        Date now=new Date();
        xmlTitle.setTransactionDate(dateFormat.format(now));
        xmlTitle.setTransactionTime(timeFormat.format(now));

        PushXmlContext xmlContext=new PushXmlContext();
        xmlContext.setStatus("ACK");
        xmlContext.setDesc(serviceOrder.getServiceOrderNo());

        pushXml.setTitle(xmlTitle);
        pushXml.setContext(xmlContext);

        return objectToXml(pushXml);
    }

    //服务商拒绝接单
    public static String generateReceiveRejectMessage(ServiceOrder serviceOrder){
        EightyFivePushXml pushXml=new EightyFivePushXml();

        PushXmlTitle xmlTitle=new PushXmlTitle();
        xmlTitle.setType(138);
        xmlTitle.setCode(44);
        xmlTitle.setSer(serviceOrder.getThirdPartyServiceOrderNo());
        Date now=new Date();
        xmlTitle.setTransactionDate(dateFormat.format(now));
        xmlTitle.setTransactionTime(timeFormat.format(now));

        PushXmlContext xmlContext=new PushXmlContext();
        xmlContext.setStatus("REJ");
        xmlContext.setDesc(serviceOrder.getRejectReason());

        pushXml.setTitle(xmlTitle);
        pushXml.setContext(xmlContext);

        return objectToXml(pushXml);
    }

    //服务单取消
    public static String generateCanceltMessage(ServiceOrder serviceOrder){
        EightyFivePushXml pushXml=new EightyFivePushXml();

        PushXmlTitle xmlTitle=new PushXmlTitle();
        xmlTitle.setType(138);
        xmlTitle.setCode(64);
        xmlTitle.setSer(serviceOrder.getThirdPartyServiceOrderNo());
        Date now=new Date();
        xmlTitle.setTransactionDate(dateFormat.format(now));
        xmlTitle.setTransactionTime(timeFormat.format(now));

        PushXmlContext xmlContext=new PushXmlContext();
        xmlContext.setStatus("ACK");
        xmlContext.setDesc(serviceOrder.getServiceOrderNo());

        pushXml.setTitle(xmlTitle);
        pushXml.setContext(xmlContext);

        return objectToXml(pushXml);
    }

    //预计到场
    public static String generateDispatchConfirmMessage(WorkOrder workOrder,ServiceOrder serviceOrder){
        EightyFivePushXml pushXml=new EightyFivePushXml();

        PushXmlTitle xmlTitle=new PushXmlTitle();
        xmlTitle.setType(139);
        xmlTitle.setCode(16);
        xmlTitle.setSer(serviceOrder.getThirdPartyServiceOrderNo());
        Date now=new Date();
        xmlTitle.setTransactionDate(dateFormat.format(now));
        xmlTitle.setTransactionTime(timeFormat.format(now));

        PushXmlContext xmlContext=new PushXmlContext();
        xmlContext.setStatus("DSP");
        xmlContext.setDesc(serviceOrder.getServiceOrderNo());
        xmlContext.setEtaDate(dateFormat.format(workOrder.getEstimatedStartTime()));
        xmlContext.setEtaTime(timeFormat.format(workOrder.getEstimatedStartTime()));

        pushXml.setTitle(xmlTitle);
        pushXml.setContext(xmlContext);

        return objectToXml(pushXml);
    }

    //工人签到
    public static String generateWorkSignMessage(ServiceOrder serviceOrder){
        EightyFivePushXml pushXml=new EightyFivePushXml();

        PushXmlTitle xmlTitle=new PushXmlTitle();
        xmlTitle.setType(139);
        xmlTitle.setCode(16);
        xmlTitle.setSer(serviceOrder.getThirdPartyServiceOrderNo());
        Date now=new Date();
        xmlTitle.setTransactionDate(dateFormat.format(now));
        xmlTitle.setTransactionTime(timeFormat.format(now));

        PushXmlContext xmlContext=new PushXmlContext();
        xmlContext.setStatus("AOS");
        xmlContext.setDesc(serviceOrder.getServiceOrderNo());

        pushXml.setTitle(xmlTitle);
        pushXml.setContext(xmlContext);

        return objectToXml(pushXml);
    }

    //报价
    public static String generateQuotationMessage(ServiceOrder serviceOrder){
        EightyFivePushXml pushXml=new EightyFivePushXml();

        PushXmlTitle xmlTitle=new PushXmlTitle();
        xmlTitle.setType(139);
        xmlTitle.setCode(16);
        xmlTitle.setSer(serviceOrder.getThirdPartyServiceOrderNo());
        Date now=new Date();
        xmlTitle.setTransactionDate(dateFormat.format(now));
        xmlTitle.setTransactionTime(timeFormat.format(now));

        PushXmlContext xmlContext=new PushXmlContext();
        xmlContext.setStatus("BPC");
        xmlContext.setDesc(serviceOrder.getServiceOrderNo());

        pushXml.setTitle(xmlTitle);
        pushXml.setContext(xmlContext);

        return objectToXml(pushXml);
    }

    //完修验收
    public static String generateFinishMessage(ServiceOrder serviceOrder){
        EightyFivePushXml pushXml=new EightyFivePushXml();

        PushXmlTitle xmlTitle=new PushXmlTitle();
        xmlTitle.setType(139);
        xmlTitle.setCode(28);
        xmlTitle.setSer(serviceOrder.getThirdPartyServiceOrderNo());
        Date now=new Date();
        xmlTitle.setTransactionDate(dateFormat.format(now));
        xmlTitle.setTransactionTime(timeFormat.format(now));

        PushXmlContext xmlContext=new PushXmlContext();
        xmlContext.setStatus("ACP");
        xmlContext.setDesc(serviceOrder.getServiceOrderNo());

        pushXml.setTitle(xmlTitle);
        pushXml.setContext(xmlContext);

        return objectToXml(pushXml);
    }

    @XStreamAlias("Title")
    private PushXmlTitle title;

    @XStreamAlias("Context")
    private PushXmlContext context;

    @XStreamAlias("Title")
    private static class PushXmlTitle {
        @XStreamAlias("Type")
        private Integer type;

        @XStreamAlias("Code")
        private Integer code;

        @XStreamAlias("CBSS")
        private String cbss="NEWTP";

        @XStreamAlias("SER")
        private  String ser;

        @XStreamAlias("TimeZone")
        private  String timeZone="CN";

        @XStreamAlias("TransactionDate")
        private  String transactionDate;

        @XStreamAlias("TransactionTime")
        private  String transactionTime;

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getCbss() {
            return cbss;
        }

        public void setCbss(String cbss) {
            this.cbss = cbss;
        }

        public String getSer() {
            return ser;
        }

        public void setSer(String ser) {
            this.ser = ser;
        }

        public String getTimeZone() {
            return timeZone;
        }

        public void setTimeZone(String timeZone) {
            this.timeZone = timeZone;
        }

        public String getTransactionDate() {
            return transactionDate;
        }

        public void setTransactionDate(String transactionDate) {
            this.transactionDate = transactionDate;
        }

        public String getTransactionTime() {
            return transactionTime;
        }

        public void setTransactionTime(String transactionTime) {
            this.transactionTime = transactionTime;
        }
    }

    @XStreamAlias("Context")
    private static class PushXmlContext {
        @XStreamAlias("FileID")
        private String fileID="";

        @XStreamAlias("Status")
        private String status;

        @XStreamAlias("ETADate")
        private String etaDate="";

        @XStreamAlias("ETATime")
        private  String etaTime="";

        @XStreamAlias("Desc")
        private  String desc="";

        @XStreamAlias("ClosedNo")
        private  String closedNo="";

        public String getFileID() {
            return fileID;
        }

        public void setFileID(String fileID) {
            this.fileID = fileID;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getEtaDate() {
            return etaDate;
        }

        public void setEtaDate(String etaDate) {
            this.etaDate = etaDate;
        }

        public String getEtaTime() {
            return etaTime;
        }

        public void setEtaTime(String etaTime) {
            this.etaTime = etaTime;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getClosedNo() {
            return closedNo;
        }

        public void setClosedNo(String closedNo) {
            this.closedNo = closedNo;
        }
    }

    public PushXmlContext getContext() {
        return context;
    }

    public void setContext(PushXmlContext context) {
        this.context = context;
    }

    public PushXmlTitle getTitle() {
        return title;
    }

    public void setTitle(PushXmlTitle title) {
        this.title = title;
    }
}
