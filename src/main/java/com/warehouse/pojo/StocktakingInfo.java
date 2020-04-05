package com.warehouse.pojo;

public class StocktakingInfo {
    private String stiId;

    private String stiProid;

    private String stiName;

    private String stiUnit;

    private String stiCategory;

    private String stiCode;

    private Integer stiNum;

    private Integer stiStocknum;

    private String stiResult;

    private Integer stoResultnum;

    private String stiRemaks;

    private String stoId;

    public String getStiId() {
        return stiId;
    }

    public void setStiId(String stiId) {
        this.stiId = stiId == null ? null : stiId.trim();
    }

    public String getStiProid() {
        return stiProid;
    }

    public void setStiProid(String stiProid) {
        this.stiProid = stiProid == null ? null : stiProid.trim();
    }

    public String getStiName() {
        return stiName;
    }

    public void setStiName(String stiName) {
        this.stiName = stiName == null ? null : stiName.trim();
    }

    public String getStiUnit() {
        return stiUnit;
    }

    public void setStiUnit(String stiUnit) {
        this.stiUnit = stiUnit == null ? null : stiUnit.trim();
    }

    public String getStiCategory() {
        return stiCategory;
    }

    public void setStiCategory(String stiCategory) {
        this.stiCategory = stiCategory == null ? null : stiCategory.trim();
    }

    public String getStiCode() {
        return stiCode;
    }

    public void setStiCode(String stiCode) {
        this.stiCode = stiCode == null ? null : stiCode.trim();
    }

    public Integer getStiNum() {
        return stiNum;
    }

    public void setStiNum(Integer stiNum) {
        this.stiNum = stiNum;
    }

    public Integer getStiStocknum() {
        return stiStocknum;
    }

    public void setStiStocknum(Integer stiStocknum) {
        this.stiStocknum = stiStocknum;
    }

    public String getStiResult() {
        return stiResult;
    }

    public void setStiResult(String stiResult) {
        this.stiResult = stiResult == null ? null : stiResult.trim();
    }

    public Integer getStoResultnum() {
        return stoResultnum;
    }

    public void setStoResultnum(Integer stoResultnum) {
        this.stoResultnum = stoResultnum;
    }

    public String getStiRemaks() {
        return stiRemaks;
    }

    public void setStiRemaks(String stiRemaks) {
        this.stiRemaks = stiRemaks == null ? null : stiRemaks.trim();
    }

    public String getStoId() {
        return stoId;
    }

    public void setStoId(String stoId) {
        this.stoId = stoId == null ? null : stoId.trim();
    }
}