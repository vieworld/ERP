package com.warehouse.pojo;

public class SaleOutbound {
    private String soutId;

    private String soutCustomerid;

    private String soutContacts;

    private String soutPhone;

    private String soutAdress;

    public String getSoutId() {
        return soutId;
    }

    public void setSoutId(String soutId) {
        this.soutId = soutId == null ? null : soutId.trim();
    }

    public String getSoutCustomerid() {
        return soutCustomerid;
    }

    public void setSoutCustomerid(String soutCustomerid) {
        this.soutCustomerid = soutCustomerid == null ? null : soutCustomerid.trim();
    }

    public String getSoutContacts() {
        return soutContacts;
    }

    public void setSoutContacts(String soutContacts) {
        this.soutContacts = soutContacts == null ? null : soutContacts.trim();
    }

    public String getSoutPhone() {
        return soutPhone;
    }

    public void setSoutPhone(String soutPhone) {
        this.soutPhone = soutPhone == null ? null : soutPhone.trim();
    }

    public String getSoutAdress() {
        return soutAdress;
    }

    public void setSoutAdress(String soutAdress) {
        this.soutAdress = soutAdress == null ? null : soutAdress.trim();
    }
}