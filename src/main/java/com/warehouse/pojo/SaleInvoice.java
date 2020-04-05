package com.warehouse.pojo;

import java.util.Date;

public class SaleInvoice {
    private String saiId;

    private Date saiTime;

    private String saiReceivingparty;

    private String saiInvoicecode;

    private String saiInvoicename;

    private Integer saiType;

    private Float saiSumoney;

    private String saiMaks;

    public String getSaiId() {
        return saiId;
    }

    public void setSaiId(String saiId) {
        this.saiId = saiId == null ? null : saiId.trim();
    }

    public Date getSaiTime() {
        return saiTime;
    }

    public void setSaiTime(Date saiTime) {
        this.saiTime = saiTime;
    }

    public String getSaiReceivingparty() {
        return saiReceivingparty;
    }

    public void setSaiReceivingparty(String saiReceivingparty) {
        this.saiReceivingparty = saiReceivingparty == null ? null : saiReceivingparty.trim();
    }

    public String getSaiInvoicecode() {
        return saiInvoicecode;
    }

    public void setSaiInvoicecode(String saiInvoicecode) {
        this.saiInvoicecode = saiInvoicecode == null ? null : saiInvoicecode.trim();
    }

    public String getSaiInvoicename() {
        return saiInvoicename;
    }

    public void setSaiInvoicename(String saiInvoicename) {
        this.saiInvoicename = saiInvoicename == null ? null : saiInvoicename.trim();
    }

    public Integer getSaiType() {
        return saiType;
    }

    public void setSaiType(Integer saiType) {
        this.saiType = saiType;
    }

    public Float getSaiSumoney() {
        return saiSumoney;
    }

    public void setSaiSumoney(Float saiSumoney) {
        this.saiSumoney = saiSumoney;
    }

    public String getSaiMaks() {
        return saiMaks;
    }

    public void setSaiMaks(String saiMaks) {
        this.saiMaks = saiMaks == null ? null : saiMaks.trim();
    }
}