//package com.anycall.base.model.business;
//
//import com.anycall.base.common.Page;
//import com.anycall.base.model.business.bo.WorkOrderBo;
//import com.anycall.base.model.business.condition.WorkOrderSearchPageCondition;
//import com.anycall.base.service.business.WorkOrderService;
//import com.antscity.common.config.SpringContextHolder;
//
//import java.sql.Date;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.List;
//
//public class  WorkOrderReportScript {
//
//    public static WorkOrderBo[] findWorkOrderById(List<Long> ids){
//        WorkOrderBo[] workOrderBoList = new WorkOrderBo[ids.size()];
//        int i = 0;
//        if (ids.size() > 0) {
//            for(Long id:ids){
//                WorkOrderBo workOrderBo;
//                WorkOrderSearchPageCondition condition = new WorkOrderSearchPageCondition();
//                WorkOrderService workOrderService = SpringContextHolder.getBean(WorkOrderService.class);
//                condition.setWorkOrderId(id);
//                Page<WorkOrderBo> workOrderBoPage = workOrderService.search(condition);
//                workOrderBo = workOrderBoPage.getResults().get(0);
//                workOrderBo.setPrintDesc(workOrderBo.getDesc());
//                workOrderBo.setFailure(workOrderBo.getBigCatalogName()+">"+workOrderBo.getChildCatalogName()+">"+workOrderBo.getBrandArea()+">"+workOrderBo.getFailure());
//                if(workOrderBo.getEstimatedStartTime()!=null){
//                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                    String dateNowStr = sdf.format(workOrderBo.getEstimatedStartTime());
//                    workOrderBo.setPrintEstimatedStartTime(dateNowStr);
//                }
//                if(workOrderBo.getCreateTime()!=null){
//                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                    String dateNowStr = sdf.format(workOrderBo.getReportTime());
//                    workOrderBo.setPrintCreateTime(dateNowStr);
//                }
//                workOrderBoList[i] = workOrderBo;
//                i++;
//            }
//        } else {
//            workOrderBoList = findWorkOrderDemoData();
//        }
//        return workOrderBoList;
//    }
//
//    public static WorkOrderBo[] findOneWorkOrderById(List<Long> ids){
//        WorkOrderBo[] workOrderBoList = new WorkOrderBo[1];
//        int i = 0;
//        if (ids.size() > 0) {
//                WorkOrderBo workOrderBo;
//                WorkOrderSearchPageCondition condition = new WorkOrderSearchPageCondition();
//                WorkOrderService workOrderService = SpringContextHolder.getBean(WorkOrderService.class);
//                condition.setWorkOrderId(ids.get(0).longValue());
//                Page<WorkOrderBo> workOrderBoPage = workOrderService.search(condition);
//                workOrderBo = workOrderBoPage.getResults().get(0);
//                workOrderBo.setPrintDesc(workOrderBo.getDesc());
//                workOrderBo.setFailure(workOrderBo.getBigCatalogName()+">"+workOrderBo.getChildCatalogName()+">"+workOrderBo.getBrandArea()+">"+workOrderBo.getFailure());
//                if(workOrderBo.getEstimatedStartTime()!=null){
//                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                    String dateNowStr = sdf.format(workOrderBo.getEstimatedStartTime());
//                    workOrderBo.setPrintEstimatedStartTime(dateNowStr);
//                }
//                if(workOrderBo.getCreateTime()!=null){
//                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                    String dateNowStr = sdf.format(workOrderBo.getReportTime());
//                    workOrderBo.setPrintCreateTime(dateNowStr);
//                }
//                workOrderBoList[0] = workOrderBo;
//        } else {
//            workOrderBoList = findWorkOrderDemoData();
//        }
//        return workOrderBoList;
//    }
//
//    public static WorkOrderBo[] findWorkOrderProjectById(List<Long> ids){
//        WorkOrderBo[] workOrderBoList = new WorkOrderBo[ids.size()];
//        int i = 0;
//        if (ids.size() > 0) {
//            for(Long id:ids){
//                WorkOrderBo workOrderBo;
//                WorkOrderSearchPageCondition condition = new WorkOrderSearchPageCondition();
//                WorkOrderService workOrderService = SpringContextHolder.getBean(WorkOrderService.class);
//                condition.setWorkOrderId(id);
//                Page<WorkOrderBo> workOrderBoPage = workOrderService.search(condition);
//                workOrderBo = workOrderBoPage.getResults().get(0);
//                workOrderBo.setPrintDesc(workOrderBo.getDesc());
//                workOrderBo.setFailure(workOrderBo.getBigCatalogName()+">"+workOrderBo.getChildCatalogName()+">"+workOrderBo.getBrandArea()+">"+workOrderBo.getFailure());
//                if(workOrderBo.getEstimatedStartTime()!=null){
//                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//                    String dateNowStr = sdf.format(workOrderBo.getEstimatedStartTime());
//                    workOrderBo.setPrintEstimatedStartTime(dateNowStr);
//                }
//                if(workOrderBo.getCreateTime()!=null){
//                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                    String dateNowStr = sdf.format(workOrderBo.getReportTime());
//                    workOrderBo.setPrintCreateTime(dateNowStr);
//                }
//                workOrderBoList[i] = workOrderBo;
//                i++;
//            }
//        } else {
//            workOrderBoList = findWorkOrderDemoData();
//        }
//        return workOrderBoList;
//    }
//
//    private static WorkOrderBo[] findWorkOrderDemoData() {
//        WorkOrderBo[] workOrderBo = new WorkOrderBo[0];
//        return workOrderBo;
//    }
//}
