package com.warehouse.pojo;

public class ExpendType {
    private String exptId;

    private String exptName;

    private String username;

    public String getExptId() {
        return exptId;
    }

    public void setExptId(String exptId) {
        this.exptId = exptId == null ? null : exptId.trim();
    }

    public String getExptName() {
        return exptName;
    }

    public void setExptName(String exptName) {
        this.exptName = exptName == null ? null : exptName.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}