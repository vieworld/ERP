package com.warehouse.pojo;

public class Supplier {
    private String spId;

    private String sContacts;

    private String sPhone;

    private String sMail;

    private String sUsername;

    private String sLegalperson;

    private String sAddress;

    private String sCode;

    private String sMaks;

    private Integer sState;

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId == null ? null : spId.trim();
    }

    public String getsContacts() {
        return sContacts;
    }

    public void setsContacts(String sContacts) {
        this.sContacts = sContacts == null ? null : sContacts.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public String getsMail() {
        return sMail;
    }

    public void setsMail(String sMail) {
        this.sMail = sMail == null ? null : sMail.trim();
    }

    public String getsUsername() {
        return sUsername;
    }

    public void setsUsername(String sUsername) {
        this.sUsername = sUsername == null ? null : sUsername.trim();
    }

    public String getsLegalperson() {
        return sLegalperson;
    }

    public void setsLegalperson(String sLegalperson) {
        this.sLegalperson = sLegalperson == null ? null : sLegalperson.trim();
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode == null ? null : sCode.trim();
    }

    public String getsMaks() {
        return sMaks;
    }

    public void setsMaks(String sMaks) {
        this.sMaks = sMaks == null ? null : sMaks.trim();
    }

    public Integer getsState() {
        return sState;
    }

    public void setsState(Integer sState) {
        this.sState = sState;
    }
}