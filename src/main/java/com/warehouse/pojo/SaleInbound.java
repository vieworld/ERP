package com.warehouse.pojo;

public class SaleInbound {
    private String saiId;

    private String saiCsuid;

    private String saiContacts;

    private String saiPhone;

    private String inbId;

    public String getInbId() {
        return inbId;
    }

    public void setInbId(String inbId) {
        this.inbId = inbId;
    }

    public String getSaiId() {
        return saiId;
    }

    public void setSaiId(String saiId) {
        this.saiId = saiId == null ? null : saiId.trim();
    }

    public String getSaiCsuid() {
        return saiCsuid;
    }

    public void setSaiCsuid(String saiCsuid) {
        this.saiCsuid = saiCsuid == null ? null : saiCsuid.trim();
    }

    public String getSaiContacts() {
        return saiContacts;
    }

    public void setSaiContacts(String saiContacts) {
        this.saiContacts = saiContacts == null ? null : saiContacts.trim();
    }

    public String getSaiPhone() {
        return saiPhone;
    }

    public void setSaiPhone(String saiPhone) {
        this.saiPhone = saiPhone == null ? null : saiPhone.trim();
    }
}