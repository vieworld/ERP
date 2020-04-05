package com.warehouse.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Purchase {
    private String purId;

    //    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date purTime;

    private String purCode;

    private String purPurchase;

    private String purPhone;

    private String purContacts;

    private String purMaks;

    private String purAddress;

    private String purMethod;

    private String purMode;

    private Integer purState;

    private Date purMakeDate;

    private String purModifier;

    private Date purModifierDate;

    private Float purPaidPrice;

    private Float purUnpaidPrice;

    private Float purArrivalAccount;

    private Float purUnarrivalAccount;

    private Integer putNum;

    private Float purSum;

    private String spId;

    private String username;

    private String purSpName;

    private String purSPhone;

    private int pudTaxRate;

    private Purdetails purdetails;

    private int state;

    private List<Purdetails> purdetailsList = new ArrayList<>();//物品信息详情

    private List<Enclosure> enclosureList = new ArrayList<>();//附件信息

    private List<Custom> customList = new ArrayList<>();//自定义信息

    public String getPurId() {
        return purId;
    }

    public void setPurId(String purId) {
        this.purId = purId == null ? null : purId.trim();
    }

    //    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getPurTime() {
        return purTime;
    }

    public void setPurTime(Date purTime) {
        this.purTime = purTime;
    }

    public String getPurCode() {
        return purCode;
    }

    public void setPurCode(String purCode) {
        this.purCode = purCode == null ? null : purCode.trim();
    }

    public String getPurPurchase() {
        return purPurchase;
    }

    public void setPurPurchase(String purPurchase) {
        this.purPurchase = purPurchase == null ? null : purPurchase.trim();
    }

    public String getPurPhone() {
        return purPhone;
    }

    public void setPurPhone(String purPhone) {
        this.purPhone = purPhone == null ? null : purPhone.trim();
    }

    public String getPurContacts() {
        return purContacts;
    }

    public void setPurContacts(String purContacts) {
        this.purContacts = purContacts == null ? null : purContacts.trim();
    }

    public String getPurMaks() {
        return purMaks;
    }

    public void setPurMaks(String purMaks) {
        this.purMaks = purMaks == null ? null : purMaks.trim();
    }

    public String getPurAddress() {
        return purAddress;
    }

    public void setPurAddress(String purAddress) {
        this.purAddress = purAddress == null ? null : purAddress.trim();
    }

    public String getPurMethod() {
        return purMethod;
    }

    public void setPurMethod(String purMethod) {
        this.purMethod = purMethod == null ? null : purMethod.trim();
    }

    public String getPurMode() {
        return purMode;
    }

    public void setPurMode(String purMode) {
        this.purMode = purMode == null ? null : purMode.trim();
    }

    public Integer getPurState() {
        return purState;
    }

    public void setPurState(Integer purState) {
        this.purState = purState;
    }

    //    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getPurMakeDate() {
        return purMakeDate;
    }

    public void setPurMakeDate(Date purMakedate) {
        this.purMakeDate = purMakedate;
    }

    public String getPurModifier() {
        return purModifier;
    }

    public void setPurModifier(String purModifier) {
        this.purModifier = purModifier == null ? null : purModifier.trim();
    }

    public Date getPurModifierDate() {
        return purModifierDate;
    }

    public void setPurModifierDate(Date purModifierDate) {
        this.purModifierDate = purModifierDate;
    }

    public Float getPurPaidPrice() {
        return purPaidPrice;
    }

    public void setPurPaidPrice(Float purPaidPrice) {
        this.purPaidPrice = purPaidPrice;
    }

    public Float getPurUnpaidPrice() {
        return purUnpaidPrice;
    }

    public void setPurUnpaidPrice(Float purUnpaidPrice) {
        this.purUnpaidPrice = purUnpaidPrice;
    }

    public Float getPurArrivalAccount() {
        return purArrivalAccount;
    }

    public void setPurArrivalAccount(Float purArrivalAccount) {
        this.purArrivalAccount = purArrivalAccount;
    }

    public Float getPurUnarrivalAccount() {
        return purUnarrivalAccount;
    }

    public void setPurUnarrivalAccount(Float purUnarrivalAccount) {
        this.purUnarrivalAccount = purUnarrivalAccount;
    }

    public Integer getPutNum() {
        return putNum;
    }

    public void setPutNum(Integer putNum) {
        this.putNum = putNum;
    }

    public Float getPurSum() {
        return purSum;
    }

    public void setPurSum(Float purSum) {
        this.purSum = purSum;
    }

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId == null ? null : spId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public List<Purdetails> getPurdetailsList() {
        return purdetailsList;
    }

    public void setPurdetailsList(List<Purdetails> purdetailsList) {
        this.purdetailsList = purdetailsList;
    }

    public List<Enclosure> getEnclosureList() {
        return enclosureList;
    }

    public void setEnclosureList(List<Enclosure> enclosureList) {
        this.enclosureList = enclosureList;
    }

    public List<Custom> getCustomList() {
        return customList;
    }

    public void setCustomList(List<Custom> customList) {
        this.customList = customList;
    }

    public int getPudTaxRate() {
        return pudTaxRate;
    }

    public void setPudTaxRate(int pudTaxRate) {
        this.pudTaxRate = pudTaxRate;
    }

    public Purdetails getPurdetails() {
        return purdetails;
    }

    public void setPurdetails(Purdetails purdetails) {
        this.purdetails = purdetails;
    }

    public String getPurSpName() {
        return purSpName;
    }

    public void setPurSpName(String purSpName) {
        this.purSpName = purSpName;
    }

    public String getPurSPhone() {
        return purSPhone;
    }

    public void setPurSPhone(String purSPhone) {
        this.purSPhone = purSPhone;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}