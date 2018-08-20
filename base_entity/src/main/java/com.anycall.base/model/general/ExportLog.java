package com.anycall.base.model.general;

import com.anycall.base.model.AbstractPersistable;

import java.util.Date;

/**
 * Created by Robin on 16/9/14.
 */
public class ExportLog extends AbstractPersistable {


    private Long row;
    private Long column;
    private String errorMessage;
    private String fieldName;

    public ExportLog(Long row, Long column, String errorMessage, String fieldName) {
        this.row = row;
        this.column = column;
        this.errorMessage = errorMessage;
        this.fieldName = fieldName;
    }


    public Long getRow() {
        return row;
    }

    public void setRow(Long row) {
        this.row = row;
    }

    public Long getColumn() {
        return column;
    }

    public void setColumn(Long column) {
        this.column = column;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
