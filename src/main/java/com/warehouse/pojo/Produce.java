package com.warehouse.pojo;

public class Produce {
    private String prId;

    private String prDepart;

    private String prEmployee;

    private String inbId;

    public String getInbId() {
        return inbId;
    }

    public void setInbId(String inbId) {
        this.inbId = inbId;
    }

    public String getPrId() {
        return prId;
    }

    public void setPrId(String prId) {
        this.prId = prId == null ? null : prId.trim();
    }

    public String getPrDepart() {
        return prDepart;
    }

    public void setPrDepart(String prDepart) {
        this.prDepart = prDepart == null ? null : prDepart.trim();
    }

    public String getPrEmployee() {
        return prEmployee;
    }

    public void setPrEmployee(String prEmployee) {
        this.prEmployee = prEmployee == null ? null : prEmployee.trim();
    }
}