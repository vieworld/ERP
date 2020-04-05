package com.warehouse.pojo;

import java.util.Date;

public class Outbound {
    private String outId;

    private Integer outType;

    private Date outDate;

    private String outWare;

    private String outCode;

    private String outExpress;

    private String outIdentifer;

    private String outProject;

    private String outHandle;

    private String outMaks;

    private Date outMakedate;

    private String outModifier;

    private Date outModiferdate;

    private String username;

    private String soutId;

    private String oiId;

    private String puiId;

    private String prId;

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId == null ? null : outId.trim();
    }

    public Integer getOutType() {
        return outType;
    }

    public void setOutType(Integer outType) {
        this.outType = outType;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getOutWare() {
        return outWare;
    }

    public void setOutWare(String outWare) {
        this.outWare = outWare == null ? null : outWare.trim();
    }

    public String getOutCode() {
        return outCode;
    }

    public void setOutCode(String outCode) {
        this.outCode = outCode == null ? null : outCode.trim();
    }

    public String getOutExpress() {
        return outExpress;
    }

    public void setOutExpress(String outExpress) {
        this.outExpress = outExpress == null ? null : outExpress.trim();
    }

    public String getOutIdentifer() {
        return outIdentifer;
    }

    public void setOutIdentifer(String outIdentifer) {
        this.outIdentifer = outIdentifer == null ? null : outIdentifer.trim();
    }

    public String getOutProject() {
        return outProject;
    }

    public void setOutProject(String outProject) {
        this.outProject = outProject == null ? null : outProject.trim();
    }

    public String getOutHandle() {
        return outHandle;
    }

    public void setOutHandle(String outHandle) {
        this.outHandle = outHandle == null ? null : outHandle.trim();
    }

    public String getOutMaks() {
        return outMaks;
    }

    public void setOutMaks(String outMaks) {
        this.outMaks = outMaks == null ? null : outMaks.trim();
    }

    public Date getOutMakedate() {
        return outMakedate;
    }

    public void setOutMakedate(Date outMakedate) {
        this.outMakedate = outMakedate;
    }

    public String getOutModifier() {
        return outModifier;
    }

    public void setOutModifier(String outModifier) {
        this.outModifier = outModifier == null ? null : outModifier.trim();
    }

    public Date getOutModiferdate() {
        return outModiferdate;
    }

    public void setOutModiferdate(Date outModiferdate) {
        this.outModiferdate = outModiferdate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSoutId() {
        return soutId;
    }

    public void setSoutId(String soutId) {
        this.soutId = soutId == null ? null : soutId.trim();
    }

    public String getOiId() {
        return oiId;
    }

    public void setOiId(String oiId) {
        this.oiId = oiId == null ? null : oiId.trim();
    }

    public String getPuiId() {
        return puiId;
    }

    public void setPuiId(String puiId) {
        this.puiId = puiId == null ? null : puiId.trim();
    }

    public String getPrId() {
        return prId;
    }

    public void setPrId(String prId) {
        this.prId = prId == null ? null : prId.trim();
    }
}