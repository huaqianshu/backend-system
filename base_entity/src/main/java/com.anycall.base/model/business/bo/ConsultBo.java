package com.anycall.base.model.business.bo;

import com.anycall.base.model.account.Member;
import com.anycall.base.model.business.ConsultReply;

import java.util.List;

/**
 * Created by Amy on 2016/12/6.
 */
public class ConsultBo extends ConsultListBo {

     //如果是回复人查询，是否已经回复这个咨询
    private Boolean isReply;

    private List<ConsultReplyBo> consultReplys;

    public List<ConsultReplyBo> getConsultReplys() {
        return consultReplys;
    }

    public void setConsultReplys(List<ConsultReplyBo> consultReplys) {
        this.consultReplys = consultReplys;
    }

    public Boolean getIsReply() {
        return isReply;
    }

    public void setIsReply(Boolean isReply) {
        this.isReply = isReply;
    }
}
