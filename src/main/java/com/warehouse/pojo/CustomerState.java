package com.warehouse.pojo;

public class CustomerState {
    private String csId;

    private String csName;

    public String getCsId() {
        return csId;
    }

    public void setCsId(String csId) {
        this.csId = csId == null ? null : csId.trim();
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName == null ? null : csName.trim();
    }
}