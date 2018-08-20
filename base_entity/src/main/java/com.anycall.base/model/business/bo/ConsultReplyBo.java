package com.anycall.base.model.business.bo;

import com.anycall.base.model.business.ConsultReply;

/**
 * Created by Amy on 2016/12/7.
 */
public class ConsultReplyBo extends ConsultReply {
    //回复人名称
    private String replyMemberName;

    public String getReplyMemberName() {
        return replyMemberName;
    }

    public void setReplyMemberName(String replyMemberName) {
        this.replyMemberName = replyMemberName;
    }
}
