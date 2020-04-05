package com.warehouse.pojo;

import java.util.Date;

public class Invoice {
    private String invoId;

    private Date invoTime;

    private String invoDrawerparty;

    private String invoInvoicename;

    private Integer invoType;

    private Float invoSumoney;

    private String invoMaks;

    private String username;

    public String getInvoId() {
        return invoId;
    }

    public void setInvoId(String invoId) {
        this.invoId = invoId == null ? null : invoId.trim();
    }

    public Date getInvoTime() {
        return invoTime;
    }

    public void setInvoTime(Date invoTime) {
        this.invoTime = invoTime;
    }

    public String getInvoDrawerparty() {
        return invoDrawerparty;
    }

    public void setInvoDrawerparty(String invoDrawerparty) {
        this.invoDrawerparty = invoDrawerparty == null ? null : invoDrawerparty.trim();
    }

    public String getInvoInvoicename() {
        return invoInvoicename;
    }

    public void setInvoInvoicename(String invoInvoicename) {
        this.invoInvoicename = invoInvoicename == null ? null : invoInvoicename.trim();
    }

    public Integer getInvoType() {
        return invoType;
    }

    public void setInvoType(Integer invoType) {
        this.invoType = invoType;
    }

    public Float getInvoSumoney() {
        return invoSumoney;
    }

    public void setInvoSumoney(Float invoSumoney) {
        this.invoSumoney = invoSumoney;
    }

    public String getInvoMaks() {
        return invoMaks;
    }

    public void setInvoMaks(String invoMaks) {
        this.invoMaks = invoMaks == null ? null : invoMaks.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}