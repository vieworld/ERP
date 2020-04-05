package com.warehouse.pojo;

public class IncomeType {
    private String intId;

    private String intType;

    private String username;

    public String getIntId() {
        return intId;
    }

    public void setIntId(String intId) {
        this.intId = intId == null ? null : intId.trim();
    }

    public String getIntType() {
        return intType;
    }

    public void setIntType(String intType) {
        this.intType = intType == null ? null : intType.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}