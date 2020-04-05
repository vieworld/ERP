package com.warehouse.pojo;

public class InvoiceType {
    private String invtId;

    private String invtName;

    private String username;

    public String getInvtId() {
        return invtId;
    }

    public void setInvtId(String invtId) {
        this.invtId = invtId == null ? null : invtId.trim();
    }

    public String getInvtName() {
        return invtName;
    }

    public void setInvtName(String invtName) {
        this.invtName = invtName == null ? null : invtName.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}