package com.anycall.dashboard.controller;

import com.alibaba.fastjson.JSON;
import com.anycall.base.messager.ResultBean;
import com.anycall.base.model.User;
import com.anycall.base.model.business.condition.ServiceOrderSearchPageCondition;
import com.anycall.dashboard.proxy.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dashboard")
public class ServiceOrderCountBarChartController {

    @Autowired
    ServiceOrderService serviceOrderService;
    @PostMapping("/serviceOrderCountBarChart")
    public ResultBean sentData(@RequestBody ServiceOrderSearchPageCondition condition) {
        System.out.println(JSON.toJSONString(condition));
        return serviceOrderService.getServiceOrderCountBarChart(condition);
    }

    @PostMapping("/testUser")
    public ResultBean testConnect(@RequestBody ServiceOrderSearchPageCondition condition){
//        ServiceOrderSearchPageCondition condition = new ServiceOrderSearchPageCondition();
//        condition.setMemberId(memberId);
//        user.setId(id);
//        user.setName(name);
        return serviceOrderService.testEntity(condition);
    }

    @GetMapping("/test")
    public String testConnect(String name){
        return serviceOrderService.testConnect(name);
    }
}
