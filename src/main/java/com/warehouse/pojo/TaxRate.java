package com.warehouse.pojo;

public class TaxRate {
    private String trId;

    private Integer trDiscount;

    private int trType;

    private String username;

    public String getTrId() {
        return trId;
    }

    public void setTrId(String trId) {
        this.trId = trId == null ? null : trId.trim();
    }

    public int getTrType() {
        return trType;
    }

    public void setTrType(int trType) {
        this.trType = trType;
    }

    public Integer getTrDiscount() {
        return trDiscount;
    }

    public void setTrDiscount(Integer trDiscount) {
        this.trDiscount = trDiscount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}