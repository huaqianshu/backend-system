package com.anycall.serviceorder.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.anycall.base.messager.ResultBean;
import com.anycall.base.messager.ResultUtils;
import com.anycall.base.model.User;
import com.anycall.base.model.account.Member;
import com.anycall.base.model.account.MemberType;
import com.anycall.base.model.business.ServiceOrder;
import com.anycall.base.model.business.condition.ServiceOrderSearchPageCondition;
import com.anycall.base.model.general.ServiceCatalogLevel;
import com.anycall.serviceorder.proxysservice.MemberService;
import com.anycall.serviceorder.proxysservice.OrganizationService;
import com.anycall.serviceorder.service.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/")
public class ServiceOrderController {
    @Autowired
    private ServiceOrderService serviceOrderService;
    @Autowired
    private MemberService memberService;
    @Autowired
    private OrganizationService organizationService;
    private SimpleDateFormat weekSdf = new SimpleDateFormat("yyyy/MM/dd");
    private SimpleDateFormat monthSdf = new SimpleDateFormat("yyyy/MM");
    @PostMapping("/serviceOrderCountBarChart")
    public ResultBean getServiceOrderCountBarChart(@RequestBody ServiceOrderSearchPageCondition condition) {
        JSONObject json = new JSONObject();json.put("DATE",new JSONObject());
        json.put("WEEK",new JSONObject());json.put("MONTH",new JSONObject());
        JSONObject eachJson = new JSONObject();
        eachJson.put("emergency",0);eachJson.put("notEmergency",0);
        Member member = memberService.getMemberById(condition.getMemberId());
        condition.setOrgTreeIds(organizationService.getMemberOrgTreeId(member.getOrgId()));
        if (MemberType.SUPPLIER.equals(member.getMemberType())) {
            List<Long> orgIds = organizationService.getMemberOrgTreeId(member.getId());
            condition.setOrgTreeIds(orgIds);
            if (member.getIsAdmin()) {
                condition.setShopAuths("");
            } else {
                condition.setShopAuths(member.getShopAuths());
            }
        }
        if (MemberType.CUSTOMER.equals(member.getMemberType())) {
            String[] deparmentCodes = member.getDepartmentCode().split(",");
            condition.setShopAuths(member.getShopAuths());
        }
        List<ServiceOrder> serviceOrders = serviceOrderService.searchCountBySlaLevel(condition);
        Calendar cal = Calendar.getInstance();
        if (condition.getStartTime() != null) {

            cal.setTime(condition.getStartTime());
        }
        for (ServiceOrder s : serviceOrders) {
            cal.setTime(s.getReportTime());
            json.getJSONObject("DATE").put(weekSdf.format(s.getReportTime()), eachJson.clone());
            json.getJSONObject("WEEK").put(getFirstAndLastOfWeek(cal), eachJson.clone());
            json.getJSONObject("MONTH").put(monthSdf.format(s.getReportTime()), eachJson.clone());
        }
        for (ServiceOrder s : serviceOrders) {
            cal.setTime(s.getReportTime());
            serviceOrderToJson(cal, cal.getTime(), json, s.getSlaLevel());
        }
        ResultBean resultBean = new ResultBean();
        resultBean.setStatus(ResultUtils.SUCCESS_RETURN);
        resultBean.setData(json);
        return resultBean;
    }

    private String getFirstAndLastOfWeek(Calendar cal) {
        int d = 0;
        if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
            d = -6;
        } else {
            d = 2 - cal.get(Calendar.DAY_OF_WEEK);
        }
        cal.add(Calendar.DAY_OF_WEEK, d);
        // 所在周开始日期
        Date data1 = cal.getTime();
        cal.add(Calendar.DAY_OF_WEEK, 6);
        // 所在周结束日期
        Date data2 = cal.getTime();
        return weekSdf.format(data1) + "-" + weekSdf.format(data2);
    }

    private void serviceOrderToJson(Calendar cal, Date date, JSONObject json, ServiceCatalogLevel slaLevel) {
        switch (slaLevel) {
            case P1:
            case P2:
                json.getJSONObject("DATE").getJSONObject(weekSdf.format(date)).put("emergency",
                        json.getJSONObject("DATE").getJSONObject(weekSdf.format(date)).getInteger("emergency") + 1);
                json.getJSONObject("WEEK").getJSONObject(getFirstAndLastOfWeek(cal)).put("emergency",
                        json.getJSONObject("WEEK").getJSONObject(getFirstAndLastOfWeek(cal)).getInteger("emergency") + 1);
                json.getJSONObject("MONTH").getJSONObject(monthSdf.format(date)).put("emergency",
                        json.getJSONObject("MONTH").getJSONObject(monthSdf.format(date)).getInteger("emergency") + 1);
                break;
            default:
                json.getJSONObject("DATE").getJSONObject(weekSdf.format(date)).put("notEmergency",
                        json.getJSONObject("DATE").getJSONObject(weekSdf.format(date)).getInteger("notEmergency") + 1);
                json.getJSONObject("WEEK").getJSONObject(getFirstAndLastOfWeek(cal)).put("notEmergency",
                        json.getJSONObject("WEEK").getJSONObject(getFirstAndLastOfWeek(cal)).getInteger("notEmergency") + 1);
                json.getJSONObject("MONTH").getJSONObject(monthSdf.format(date)).put("notEmergency",
                        json.getJSONObject("MONTH").getJSONObject(monthSdf.format(date)).getInteger("notEmergency") + 1);
                break;
        }
    }

    @GetMapping("/test")
    public String testConnect(@RequestParam String name){
        return "serviceorder"+name;
    }

    @PostMapping("/testUser")
    public ResultBean testConnect(@RequestBody ServiceOrderSearchPageCondition condition){
        ResultBean result = new ResultBean();
        result.setStatus(ResultUtils.SUCCESS_RETURN);
        result.setMessage("serviceorder"+ JSON.toJSON(condition));
        return result;
    }
}
