package com.warehouse.pojo;

import java.util.Date;

public class Stocktaking {
    private String stoId;

    private Date stoDate;

    private String stoWare;

    private String stoCode;

    private String stoContacts;

    private String stoMaks;

    private Date stoMakedate;

    private String username;

    public String getStoId() {
        return stoId;
    }

    public void setStoId(String stoId) {
        this.stoId = stoId == null ? null : stoId.trim();
    }

    public Date getStoDate() {
        return stoDate;
    }

    public void setStoDate(Date stoDate) {
        this.stoDate = stoDate;
    }

    public String getStoWare() {
        return stoWare;
    }

    public void setStoWare(String stoWare) {
        this.stoWare = stoWare == null ? null : stoWare.trim();
    }

    public String getStoCode() {
        return stoCode;
    }

    public void setStoCode(String stoCode) {
        this.stoCode = stoCode == null ? null : stoCode.trim();
    }

    public String getStoContacts() {
        return stoContacts;
    }

    public void setStoContacts(String stoContacts) {
        this.stoContacts = stoContacts == null ? null : stoContacts.trim();
    }

    public String getStoMaks() {
        return stoMaks;
    }

    public void setStoMaks(String stoMaks) {
        this.stoMaks = stoMaks == null ? null : stoMaks.trim();
    }

    public Date getStoMakedate() {
        return stoMakedate;
    }

    public void setStoMakedate(Date stoMakedate) {
        this.stoMakedate = stoMakedate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}