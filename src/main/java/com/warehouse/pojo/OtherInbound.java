package com.warehouse.pojo;

public class OtherInbound {
    private String oiId;

    private String oiName;

    private String oiContacts;

    private String inbId;

    public String getInbId() {
        return inbId;
    }

    public void setInbId(String inbId) {
        this.inbId = inbId;
    }

    public String getOiId() {
        return oiId;
    }

    public void setOiId(String oiId) {
        this.oiId = oiId == null ? null : oiId.trim();
    }

    public String getOiName() {
        return oiName;
    }

    public void setOiName(String oiName) {
        this.oiName = oiName == null ? null : oiName.trim();
    }

    public String getOiContacts() {
        return oiContacts;
    }

    public void setOiContacts(String oiContacts) {
        this.oiContacts = oiContacts == null ? null : oiContacts.trim();
    }
}