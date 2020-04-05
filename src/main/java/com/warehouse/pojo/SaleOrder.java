package com.warehouse.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleOrder {
    private String soId;

    private Date soTime;

    private String soCode;

    private String soAddress;

    private String soProject;

    private String soMethod;

    private String soOrder;

    private String soName;

    private String soContacts;

    private String soPhone;

    private String soMaks;

    private Integer soState;

    private Date soMakeDate;

    private String soModifier;

    private Date soModifierDate;

    private Integer soNum;

    private Float soSum;

    private String username;

    private String cId;

    private String soCustomerName;

    private String soCustomerPhone;

    private Float soReceivables;

    private Float soUnReceivables;

    private Float soInvoice;

    private Float soUnInvoice;

    private List<Custom> customList = new ArrayList<>();

    private List<Enclosure> enclosureList = new ArrayList<>();

    private List<Purdetails> purdetailsList = new ArrayList<>();

    public String getSoCustomerName() {
        return soCustomerName;
    }

    public void setSoCustomerName(String soCustomerName) {
        this.soCustomerName = soCustomerName;
    }

    public String getSoCustomerPhone() {
        return soCustomerPhone;
    }

    public void setSoCustomerPhone(String soCustomerPhone) {
        this.soCustomerPhone = soCustomerPhone;
    }

    public String getSoId() {
        return soId;
    }

    public void setSoId(String soId) {
        this.soId = soId == null ? null : soId.trim();
    }

    public Date getSoTime() {
        return soTime;
    }

    public void setSoTime(Date soTime) {
        this.soTime = soTime;
    }

    public String getSoCode() {
        return soCode;
    }

    public void setSoCode(String soCode) {
        this.soCode = soCode == null ? null : soCode.trim();
    }

    public String getSoAddress() {
        return soAddress;
    }

    public void setSoAddress(String soAddress) {
        this.soAddress = soAddress == null ? null : soAddress.trim();
    }

    public String getSoProject() {
        return soProject;
    }

    public void setSoProject(String soProject) {
        this.soProject = soProject == null ? null : soProject.trim();
    }

    public String getSoMethod() {
        return soMethod;
    }

    public void setSoMethod(String soMethod) {
        this.soMethod = soMethod == null ? null : soMethod.trim();
    }

    public String getSoOrder() {
        return soOrder;
    }

    public void setSoOrder(String soOrder) {
        this.soOrder = soOrder == null ? null : soOrder.trim();
    }

    public String getSoName() {
        return soName;
    }

    public void setSoName(String soName) {
        this.soName = soName == null ? null : soName.trim();
    }

    public String getSoContacts() {
        return soContacts;
    }

    public void setSoContacts(String soContacts) {
        this.soContacts = soContacts == null ? null : soContacts.trim();
    }

    public String getSoPhone() {
        return soPhone;
    }

    public void setSoPhone(String soPhone) {
        this.soPhone = soPhone == null ? null : soPhone.trim();
    }

    public String getSoMaks() {
        return soMaks;
    }

    public void setSoMaks(String soMaks) {
        this.soMaks = soMaks == null ? null : soMaks.trim();
    }

    public Integer getSoState() {
        return soState;
    }

    public void setSoState(Integer soState) {
        this.soState = soState;
    }

    public Date getSoMakeDate() {
        return soMakeDate;
    }

    public void setSoMakeDate(Date soMakeDate) {
        this.soMakeDate = soMakeDate;
    }

    public String getSoModifier() {
        return soModifier;
    }

    public void setSoModifier(String soModifier) {
        this.soModifier = soModifier;
    }

    public Date getSoModifierDate() {
        return soModifierDate;
    }

    public void setSoModifierDate(Date soModifierDate) {
        this.soModifierDate = soModifierDate;
    }

    public Integer getSoNum() {
        return soNum;
    }

    public void setSoNum(Integer soNum) {
        this.soNum = soNum;
    }

    public Float getSoSum() {
        return soSum;
    }

    public void setSoSum(Float soSum) {
        this.soSum = soSum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public List<Custom> getCustomList() {
        return customList;
    }

    public void setCustomList(List<Custom> customList) {
        this.customList = customList;
    }

    public List<Enclosure> getEnclosureList() {
        return enclosureList;
    }

    public void setEnclosureList(List<Enclosure> enclosureList) {
        this.enclosureList = enclosureList;
    }

    public List<Purdetails> getPurdetailsList() {
        return purdetailsList;
    }

    public void setPurdetailsList(List<Purdetails> purdetailsList) {
        this.purdetailsList = purdetailsList;
    }

    public Float getSoReceivables() {
        return soReceivables;
    }

    public void setSoReceivables(Float soReceivables) {
        this.soReceivables = soReceivables;
    }

    public Float getSoUnReceivables() {
        return soUnReceivables;
    }

    public void setSoUnReceivables(Float soUnReceivables) {
        this.soUnReceivables = soUnReceivables;
    }

    public Float getSoInvoice() {
        return soInvoice;
    }

    public void setSoInvoice(Float soInvoice) {
        this.soInvoice = soInvoice;
    }

    public Float getSoUnInvoice() {
        return soUnInvoice;
    }

    public void setSoUnInvoice(Float soUnInvoice) {
        this.soUnInvoice = soUnInvoice;
    }
}