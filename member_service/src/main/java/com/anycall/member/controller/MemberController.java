package com.anycall.member.controller;

import com.anycall.base.model.account.Member;
import com.anycall.member.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    private MemberService memberService;
    @GetMapping("/get/member/{id}")
    public Member getMemberById(@PathVariable("id") Long id){
        return memberService.findById(id);
    }
}
