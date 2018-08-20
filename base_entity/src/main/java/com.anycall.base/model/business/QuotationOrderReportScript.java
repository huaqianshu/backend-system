//package com.anycall.base.model.business;
//
//import com.anycall.base.common.Page;
//import com.anycall.base.model.business.condition.QuotationOrderSearchPageCondition;
//import com.anycall.base.model.business.vo.QuotationOrderProjectVo;
//import com.anycall.base.model.business.vo.QuotationOrderVo;
//import com.anycall.base.service.business.QuotationOrderProjectService;
//import com.anycall.base.service.business.QuotationOrderService;
//import com.anycall.base.service.business.ServiceOrderService;
//import com.antscity.common.config.SpringContextHolder;
//import com.antscity.common.util.BeanUtil;
//
//import java.text.DecimalFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.List;
//
//public class QuotationOrderReportScript {
//
//
//
//    public static QuotationOrderVo[] findQuotationOrderById(Long id) {
//        QuotationOrderVo quotationOrderVo;
//        if (id > 0) {
//            QuotationOrderSearchPageCondition condition = new QuotationOrderSearchPageCondition();
//            QuotationOrderService quotationOrderService = SpringContextHolder.getBean(QuotationOrderService.class);
//            condition.setQuotationOrderId(id);
//            Page<QuotationOrderVo> quotationOrderVoPage = quotationOrderService.search(condition);
//            quotationOrderVo = quotationOrderVoPage.getResults().get(0);
//            SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            quotationOrderVo.setReportTime(time.format(quotationOrderVo.getServiceOrderCreateTime()));
//        } else {
//            quotationOrderVo = findQuotationOrderDemoData();
//        }
//        return new QuotationOrderVo[]{quotationOrderVo};
//    }
//
//    public static QuotationOrderVo[] findMergeQuotationOrderById(Long id) {
//        QuotationOrderVo quotationOrderVo = null;
//        if (id > 0) {
//            QuotationOrderSearchPageCondition condition = new QuotationOrderSearchPageCondition();
//            QuotationOrderService quotationOrderService = SpringContextHolder.getBean(QuotationOrderService.class);
//            ServiceOrderService serviceOrderService = SpringContextHolder.getBean(ServiceOrderService.class);
//            QuotationOrderProjectService quotationOrderProjectService = SpringContextHolder.getBean(QuotationOrderProjectService.class);
//            condition.setQuotationOrderId(id);
//            Page<QuotationOrderVo> quotationOrderVoPage = quotationOrderService.search(condition);
//            quotationOrderVo = quotationOrderVoPage.getResults().get(0);
//            if(quotationOrderVo!=null){
//                List<QuotationOrder> quotationOrderList = quotationOrderService.findByMergeQuotationOrderId(id);
//                List<QuotationOrderProjectVo> quotationOrderProjectVoList = new ArrayList<>();
//                quotationOrderList.stream().forEach(quotationOrder -> {
//                    ServiceOrder serviceOrder = serviceOrderService.findById(quotationOrder.getServiceOrderId());
//                    SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                    quotationOrderProjectService.findByQuotationId(quotationOrder.getId())
//                        .stream().forEach(quotationOrderProject -> {
//                        QuotationOrderProjectVo quotationOrderProjectVo = new QuotationOrderProjectVo();
//                        BeanUtil.copyProperties(quotationOrderProject, quotationOrderProjectVo);
//                        quotationOrderProjectVo.setQuotationOrderNo(quotationOrder.getQuotationOrderNo());
//                        quotationOrderProjectVo.setPrintReportTime(time.format(serviceOrder.getReportTime()));
//                        quotationOrderProjectVo.setReportMan(serviceOrder.getReportMan());
//                        quotationOrderProjectVo.setPrintDesc(serviceOrder.getDesc());
//                        quotationOrderProjectVo.setFaultPhenomenon(quotationOrder.getFaultPhenomenon());
//                        quotationOrderProjectVoList.add(quotationOrderProjectVo);
//                    });
//                });
//                quotationOrderVo.setQuoProject(quotationOrderProjectVoList);
//                quotationOrderVo.setPhoneNum(quotationOrderVo.getPhoneNum());
//                quotationOrderVo.setCapitalQuoteTotals(convert(quotationOrderVo.getQuoteTotals()));
//            }else{
//                quotationOrderVo = findQuotationOrderDemoData();
//            }
//        } else {
//            quotationOrderVo = findQuotationOrderDemoData();
//        }
//        return new QuotationOrderVo[]{quotationOrderVo};
//    }
//
//    private static QuotationOrderVo findQuotationOrderDemoData() {
//        QuotationOrderVo quotationOrder = new QuotationOrderVo();
//        return quotationOrder;
//    }
//
//    public static String ToChinese(int Number){
//        String ans="";
//        String source=String.valueOf(Number);
//        return ans;
//    }
//
//    public static String ToBig(int num){
//        String str[]={"壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
//        return str[num-1];
//    }
//
//    public static String convert(double x){
//        DecimalFormat format = new DecimalFormat("#.00");
//        String str = format.format(x);
//        System.out.println(str);
//        String s[]=str.split("\\.");
//        String temp="";
//        int ling=0;
//        int shu=0;
//        int pos=0;
//        for(int j=0;j<s[0].length();++j){
//            int num=s[0].charAt(j)-'0';
//            if(num==0){
//                ling++;
//                if(ling==s[0].length()){
//                    temp="零";
//                }
//                else if(s[0].length()-j-1==4){
//                    if(shu==1&&(s[0].length()-pos-1)>=5&&(s[0].length()-pos-1)<=7){
//                        temp+="萬";
//                    }
//                }
//                else if(s[0].length()-j-1==8){
//                    if(shu==1&&(s[0].length()-pos-1)>=9&&(s[0].length()-pos-1)<=11){
//                        temp+="亿";
//                    }
//                }
//            }
//            else{
//                shu++;
//                int flag=0;
//                if(shu==1){
//                    ling=0;
//                    pos=j;
//                }
//                if(shu==2){
//                    flag=1;
//                    if(ling>0){
//                        temp+="零";
//                    }
//                    shu=1;
//                    pos=j;
//                    ling=0;
//                }
//                if(s[0].length()-j-1==11){
//                    temp+=ToBig(num)+"仟";
//                }
//                else if(s[0].length()-j-1==10){
//                    temp+=ToBig(num)+"佰";
//                }
//                else if(s[0].length()-j-1==9){
//                    if(num==1&&flag!=1)
//                        temp+="拾";
//                    else
//                        temp+=ToBig(num)+"拾";
//                }
//                else if(s[0].length()-j-1==8){
//                    temp+=ToBig(num)+"亿";
//                }
//                else if(s[0].length()-j-1==7){
//                    temp+=ToBig(num)+"仟";
//                }
//                else if(s[0].length()-j-1==6){
//                    temp+=ToBig(num)+"佰";
//                }
//                else if(s[0].length()-j-1==5){
//                    if(num==1&&flag!=1)
//                        temp+="拾";
//                    else
//                        temp+=ToBig(num)+"拾";
//                }
//                else if(s[0].length()-j-1==4){
//                    temp+=ToBig(num)+"萬";
//                }
//                else if(s[0].length()-j-1==3){
//                    temp+=ToBig(num)+"仟";
//                }
//                else if(s[0].length()-j-1==2){
//                    temp+=ToBig(num)+"佰";
//                }
//                else if(s[0].length()-j-1==1){
//                    if(num==1&&flag!=1)
//                        temp+="拾";
//                    else
//                        temp+=ToBig(num)+"拾";
//                }
//                else{
//                    temp+=ToBig(num);
//                }
//            }
//        }
//        temp+="圆";
//        for(int j=0;j<s[1].length();++j){
//            int num=s[1].charAt(j)-'0';
//            if(j==0){
//                if(num!=0)
//                    temp+=ToBig(num)+"角";
//                else if(num==0&&1<s[1].length()&&s[1].charAt(1)!='0'){
//                    temp+="零";
//                }
//            }
//            else if(j==1){
//                if(num!=0)
//                    temp+=ToBig(num)+"分";
//            }
//        }
//        return temp;
//    }
//}
