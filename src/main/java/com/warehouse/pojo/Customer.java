package com.warehouse.pojo;

public class Customer {
    private String cId;

    private String cName;

    private String cPhone;

    private String cMail;

    private String cUsername;

    private String cLefalperson;

    private String cAddress;

    private String cCode;

    private String cRemaks;

    private Integer cState;

    private String cCstate;

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone == null ? null : cPhone.trim();
    }

    public String getcMail() {
        return cMail;
    }

    public void setcMail(String cMail) {
        this.cMail = cMail == null ? null : cMail.trim();
    }

    public String getcUsername() {
        return cUsername;
    }

    public void setcUsername(String cUsername) {
        this.cUsername = cUsername == null ? null : cUsername.trim();
    }

    public String getcLefalperson() {
        return cLefalperson;
    }

    public void setcLefalperson(String cLefalperson) {
        this.cLefalperson = cLefalperson == null ? null : cLefalperson.trim();
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress == null ? null : cAddress.trim();
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode == null ? null : cCode.trim();
    }

    public String getcRemaks() {
        return cRemaks;
    }

    public void setcRemaks(String cRemaks) {
        this.cRemaks = cRemaks == null ? null : cRemaks.trim();
    }

    public Integer getcState() {
        return cState;
    }

    public void setcState(Integer cState) {
        this.cState = cState;
    }

    public String getcCstate() {
        return cCstate;
    }

    public void setcCstate(String cCstate) {
        this.cCstate = cCstate == null ? null : cCstate.trim();
    }
}