package com.anycall.serviceorder.proxysservice;

import com.anycall.serviceorder.proxysservice.impl.OrganizationServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(value = "MEMBERSERVICE",fallback = OrganizationServiceImpl.class)
public interface OrganizationService {
    @RequestMapping(value = "/get/memberOrgTreeId/{memberId}",method = RequestMethod.GET)
    List<Long> getMemberOrgTreeId(@RequestParam Long memberId);
}
