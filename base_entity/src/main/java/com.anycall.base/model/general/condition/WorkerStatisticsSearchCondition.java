package com.anycall.base.model.general.condition;

import com.anycall.base.common.PageCondition;

import java.util.List;
import java.util.Objects;

/**
 * Created by Amy on 2016/12/19.
 */
public class WorkerStatisticsSearchCondition extends PageCondition{
    private static final long serialVersionUID = 5057450526983015237L;

    private Long supplierId;

    private String searchText;

    private List<Long> OrgTreeIds;

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public List<Long> getOrgTreeIds() {
        return OrgTreeIds;
    }

    public void setOrgTreeIds(List<Long> orgTreeIds) {
        OrgTreeIds = orgTreeIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WorkerStatisticsSearchCondition that = (WorkerStatisticsSearchCondition) o;
        return Objects.equals(supplierId, that.supplierId) &&
                Objects.equals(searchText, that.searchText) &&
                Objects.equals(OrgTreeIds, that.OrgTreeIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), supplierId, searchText, OrgTreeIds);
    }
}
