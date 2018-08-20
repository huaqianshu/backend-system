package com.anycall.member.mapper.member;


import com.anycall.base.model.account.Member;
import com.anycall.base.model.account.condition.MemberSearchPageCondition;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    Member findById(Long id);
    List<Member> findByName(String loginName);
    List<Long> findByOgrTreeIds(MemberSearchPageCondition condition);
}
