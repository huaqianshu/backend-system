package com.anycall.base.model.general.condition;

import com.anycall.base.model.common.condition.QuickSearchPageCondition;

/**
 * Created by yubotao on 16/9/22.
 */
public class BizLogSearchCondition extends QuickSearchPageCondition {


    private  String modelType;

    private String modelId;

    private Long modelIdL;

    public Long getModelIdL() {
        return modelIdL;
    }

    public void setModelIdL(Long modelIdL) {
        this.modelIdL = modelIdL;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        BizLogSearchCondition that = (BizLogSearchCondition) o;

        if (modelType != null ? !modelType.equals(that.modelType) : that.modelType != null) return false;
        return modelId != null ? modelId.equals(that.modelId) : that.modelId == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (modelType != null ? modelType.hashCode() : 0);
        result = 31 * result + (modelId != null ? modelId.hashCode() : 0);
        return result;
    }
}
