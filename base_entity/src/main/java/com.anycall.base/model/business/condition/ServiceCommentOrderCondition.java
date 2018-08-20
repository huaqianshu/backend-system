package com.anycall.base.model.business.condition;

import com.anycall.base.common.PageCondition;

import java.util.List;
import java.util.Objects;

/**
 * Created by Amy on 2016/12/19.
 */
public class ServiceCommentOrderCondition extends PageCondition {

    private static final long serialVersionUID = -2296562051319086345L;

    private List<Long> orgTreeIds;

    private String searchText;

    private String commentOrderStatus;

    public List<Long> getOrgTreeIds() {
        return orgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        this.orgTreeIds = orgTreeIds;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getCommentOrderStatus() {
        return commentOrderStatus;
    }

    public void setCommentOrderStatus(String commentOrderStatus) {
        this.commentOrderStatus = commentOrderStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ServiceCommentOrderCondition that = (ServiceCommentOrderCondition) o;
        return Objects.equals(orgTreeIds, that.orgTreeIds) &&
               Objects.equals(searchText, that.searchText) &&
               Objects.equals(commentOrderStatus, that.commentOrderStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), orgTreeIds, searchText, commentOrderStatus);
    }
}
