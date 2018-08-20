package com.anycall.dashboard.proxy;

import com.anycall.base.messager.ResultBean;
import com.anycall.base.model.User;
import com.anycall.base.model.business.condition.ServiceOrderSearchPageCondition;
//import com.anycall.dashboard.proxy.impl.ServiceOrderServiceImpl;
import com.anycall.dashboard.proxy.impl.ServiceOrderServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//,fallback=ServiceOrderServiceImpl.class
@FeignClient(value = "SERVICEORDER",fallback = ServiceOrderServiceImpl.class)
public interface ServiceOrderService {
    @RequestMapping(value = "/serviceOrderCountBarChart",method = RequestMethod.POST)
    ResultBean getServiceOrderCountBarChart(@RequestBody ServiceOrderSearchPageCondition condition);



    @RequestMapping(value = "testUser",method = RequestMethod.POST)
    ResultBean testEntity(@RequestBody ServiceOrderSearchPageCondition condition);

    @RequestMapping(value = "test",method = RequestMethod.GET)
    String testConnect(@RequestParam String name);
}
