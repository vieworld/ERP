package com.warehouse.pojo;

public class Express {
    private String expId;

    private String expName;

    private String username;

    public String getExpId() {
        return expId;
    }

    public void setExpId(String expId) {
        this.expId = expId == null ? null : expId.trim();
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName == null ? null : expName.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}