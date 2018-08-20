package com.anycall.member.Service;

import com.anycall.base.model.account.Member;

public interface MemberService {
    /**
     *
     * @param id
     * @return
     */
    Member findById(Long id);

}
