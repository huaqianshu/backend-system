package com.anycall.member.Service.impl;

import com.anycall.base.model.account.Member;
import com.anycall.member.Service.MemberService;
import com.anycall.member.mapper.member.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberMapper memberMapper;
    @Override
    public Member findById(Long id) {
        return memberMapper.findById(id);
    }

}
