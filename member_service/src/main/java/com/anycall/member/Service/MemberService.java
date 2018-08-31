package com.anycall.member.Service;

import com.anycall.base.model.account.Member;
import org.springframework.cache.annotation.Cacheable;

public interface MemberService {
    /**
     *
     * @param id
     * @return
     */

    Member findById(Long id);

}
