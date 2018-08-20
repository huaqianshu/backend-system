package com.anycall.serviceorder.proxysservice;

import com.anycall.base.model.account.Member;
import com.anycall.serviceorder.proxysservice.impl.MemberServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "MEMBERSERVICE",fallback =MemberServiceImpl.class)
public interface MemberService {
    @RequestMapping(value = "/get/member/{id}",method = RequestMethod.GET)
    Member getMemberById(@RequestParam Long id);
}
