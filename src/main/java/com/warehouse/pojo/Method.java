package com.warehouse.pojo;

public class Method {
    private String metId;

    private String metMode;

    private String username;

    public String getMetId() {
        return metId;
    }

    public void setMetId(String metId) {
        this.metId = metId == null ? null : metId.trim();
    }

    public String getMetMode() {
        return metMode;
    }

    public void setMetMode(String metMode) {
        this.metMode = metMode == null ? null : metMode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}