package com.anycall.member.mapper.member;


import com.anycall.base.model.account.Member;
import com.anycall.base.model.account.condition.MemberSearchPageCondition;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@Mapper
@CacheConfig(cacheNames = "member")
public interface MemberMapper {
    @Cacheable(key ="#p0")
    Member findById(Long id);
    List<Member> findByName(String loginName);
    List<Long> findByOgrTreeIds(MemberSearchPageCondition condition);
}
