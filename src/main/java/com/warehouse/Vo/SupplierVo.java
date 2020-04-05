package com.warehouse.Vo;

import java.io.Serializable;

public class SupplierVo implements Serializable {
    private String spId;

    private String sContacts;

    private String sPhone;

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public String getsContacts() {
        return sContacts;
    }

    public void setsContacts(String sContacts) {
        this.sContacts = sContacts;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }
}
