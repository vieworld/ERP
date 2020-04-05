package com.warehouse.pojo;

public class PurInbound {
    private String puiId;

    private String puiSupid;

    private String puiContacts;

    private String puiPhone;

    private String inbId;

    private String purId;

    public String getInbId() {
        return inbId;
    }

    public void setInbId(String inbId) {
        this.inbId = inbId;
    }

    public String getPuiId() {
        return puiId;
    }

    public void setPuiId(String puiId) {
        this.puiId = puiId == null ? null : puiId.trim();
    }

    public String getPuiSupid() {
        return puiSupid;
    }

    public void setPuiSupid(String puiSupid) {
        this.puiSupid = puiSupid == null ? null : puiSupid.trim();
    }

    public String getPuiContacts() {
        return puiContacts;
    }

    public void setPuiContacts(String puiContacts) {
        this.puiContacts = puiContacts == null ? null : puiContacts.trim();
    }

    public String getPuiPhone() {
        return puiPhone;
    }

    public void setPuiPhone(String puiPhone) {
        this.puiPhone = puiPhone == null ? null : puiPhone.trim();
    }

    public String getPurId() {
        return purId;
    }

    public void setPurId(String purId) {
        this.purId = purId;
    }


}