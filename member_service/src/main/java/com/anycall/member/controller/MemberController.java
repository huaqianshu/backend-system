package com.anycall.member.controller;

import com.anycall.base.model.account.Member;
import com.anycall.member.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;
    @Value("${testvalue}")
    private String testValue;
    @GetMapping("/get/member/{id}")
    public Member getMemberById(@PathVariable("id") Long id){
        return memberService.findById(id);
    }
    @GetMapping("/test/redis")
    public void stringTest(){
        ValueOperations<String,Object> valueOperations = redisTemplate.opsForValue();
        valueOperations.set("hello", "redis");
        System.out.println("useRedisDao = " + valueOperations.get("hello"));
    }
    @GetMapping
    private String testBus(){
        return testValue;
    }
}
