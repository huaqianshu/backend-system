//package com.anycall.base.model.business;
//
//import com.anycall.base.common.Page;
//import com.anycall.base.model.business.condition.QuotationOrderSearchPageCondition;
//import com.anycall.base.model.business.vo.QuotationOrderProjectVo;
//import com.anycall.base.service.business.QuotationOrderProjectService;
//import com.antscity.common.config.SpringContextHolder;
//
//import java.text.SimpleDateFormat;
//import java.util.List;
//
//public class QuotationOrderProjectReportScript {
//
//    public static QuotationOrderProjectVo[] findQuotationProjectById(Long id) {
//        QuotationOrderProjectService quotationOrderProjectService = SpringContextHolder.getBean(QuotationOrderProjectService.class);
//        List<QuotationOrderProjectVo> quotationOrderProjectList = quotationOrderProjectService.findByQuoId(id);
//        QuotationOrderProjectVo[] projectList = new QuotationOrderProjectVo[quotationOrderProjectList.size()];
//        if (quotationOrderProjectList.size() > 0) {
//            int i = 0;
//            for(QuotationOrderProjectVo project:quotationOrderProjectList){
//                projectList[i] = project;
//                i++;
//            }
//        } else {
//            projectList = findQuotationOrderDemoData();
//        }
//        return projectList;
//    }
//
//    private static QuotationOrderProjectVo[] findQuotationOrderDemoData() {
//        QuotationOrderProjectVo[] quotationOrderProjectVo = new QuotationOrderProjectVo[0];
//        return quotationOrderProjectVo;
//    }
//}
