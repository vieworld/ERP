package com.warehouse.pojo;

public class Category {
    private String caId;

    private String caName;

    private String caParent;

    private String username;

    public String getCaId() {
        return caId;
    }

    public void setCaId(String caId) {
        this.caId = caId == null ? null : caId.trim();
    }

    public String getCaName() {
        return caName;
    }

    public void setCaName(String caName) {
        this.caName = caName == null ? null : caName.trim();
    }

    public String getCaParent() {
        return caParent;
    }

    public void setCaParent(String caParent) {
        this.caParent = caParent == null ? null : caParent.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}