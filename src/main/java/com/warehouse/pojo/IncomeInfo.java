package com.warehouse.pojo;

public class IncomeInfo {
    private String iniId;

    private String iniSaleid;

    private Float iniSumoney;

    private Float iniMoney;

    private String iniMaks;

    private String inId;

    private String expId;

    private String saiId;

    public String getIniId() {
        return iniId;
    }

    public void setIniId(String iniId) {
        this.iniId = iniId == null ? null : iniId.trim();
    }

    public String getIniSaleid() {
        return iniSaleid;
    }

    public void setIniSaleid(String iniSaleid) {
        this.iniSaleid = iniSaleid == null ? null : iniSaleid.trim();
    }

    public Float getIniSumoney() {
        return iniSumoney;
    }

    public void setIniSumoney(Float iniSumoney) {
        this.iniSumoney = iniSumoney;
    }

    public Float getIniMoney() {
        return iniMoney;
    }

    public void setIniMoney(Float iniMoney) {
        this.iniMoney = iniMoney;
    }

    public String getIniMaks() {
        return iniMaks;
    }

    public void setIniMaks(String iniMaks) {
        this.iniMaks = iniMaks == null ? null : iniMaks.trim();
    }

    public String getInId() {
        return inId;
    }

    public void setInId(String inId) {
        this.inId = inId == null ? null : inId.trim();
    }

    public String getExpId() {
        return expId;
    }

    public void setExpId(String expId) {
        this.expId = expId == null ? null : expId.trim();
    }

    public String getSaiId() {
        return saiId;
    }

    public void setSaiId(String saiId) {
        this.saiId = saiId == null ? null : saiId.trim();
    }
}