package com.warehouse.pojo;

import java.util.Date;

public class SchedulInfo {
    private String sciId;

    private String sciProid;

    private String sciName;

    private String sciSpe;

    private String sciUnit;

    private String sciCategory;

    private String sciCode;

    private Integer sciNum;

    private String sciMaks;

    private Date schMakedate;

    private String username;

    private String schId;

    public String getSciId() {
        return sciId;
    }

    public void setSciId(String sciId) {
        this.sciId = sciId == null ? null : sciId.trim();
    }

    public String getSciProid() {
        return sciProid;
    }

    public void setSciProid(String sciProid) {
        this.sciProid = sciProid == null ? null : sciProid.trim();
    }

    public String getSciName() {
        return sciName;
    }

    public void setSciName(String sciName) {
        this.sciName = sciName == null ? null : sciName.trim();
    }

    public String getSciSpe() {
        return sciSpe;
    }

    public void setSciSpe(String sciSpe) {
        this.sciSpe = sciSpe == null ? null : sciSpe.trim();
    }

    public String getSciUnit() {
        return sciUnit;
    }

    public void setSciUnit(String sciUnit) {
        this.sciUnit = sciUnit == null ? null : sciUnit.trim();
    }

    public String getSciCategory() {
        return sciCategory;
    }

    public void setSciCategory(String sciCategory) {
        this.sciCategory = sciCategory == null ? null : sciCategory.trim();
    }

    public String getSciCode() {
        return sciCode;
    }

    public void setSciCode(String sciCode) {
        this.sciCode = sciCode == null ? null : sciCode.trim();
    }

    public Integer getSciNum() {
        return sciNum;
    }

    public void setSciNum(Integer sciNum) {
        this.sciNum = sciNum;
    }

    public String getSciMaks() {
        return sciMaks;
    }

    public void setSciMaks(String sciMaks) {
        this.sciMaks = sciMaks == null ? null : sciMaks.trim();
    }

    public Date getSchMakedate() {
        return schMakedate;
    }

    public void setSchMakedate(Date schMakedate) {
        this.schMakedate = schMakedate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSchId() {
        return schId;
    }

    public void setSchId(String schId) {
        this.schId = schId == null ? null : schId.trim();
    }
}