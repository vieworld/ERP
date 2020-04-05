package com.warehouse.DTO;

import com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_zh_CN;

import java.io.Serializable;
import java.util.Date;

public class PurchaseInboundDTO implements Serializable {

    private String wareName;

    private String inbId;

    private java.util.Date inbDate;

    private String spId;

    private Float inbSum;

    private String inbHandle;

    private String inbMaks;

    public String getWareName() {
        return wareName;
    }

    public void setWareName(String wareName) {
        this.wareName = wareName;
    }

    public String getInbId() {
        return inbId;
    }

    public void setInbId(String inbId) {
        this.inbId = inbId;
    }

    public Date getInbDate() {
        return inbDate;
    }

    public void setInbDate(Date inbDate) {
        this.inbDate = inbDate;
    }

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public Float getInbSum() {
        return inbSum;
    }

    public void setInbSum(Float inbSum) {
        this.inbSum = inbSum;
    }

    public String getInbHandle() {
        return inbHandle;
    }

    public void setInbHandle(String inbHandle) {
        this.inbHandle = inbHandle;
    }

    public String getInbMaks() {
        return inbMaks;
    }

    public void setInbMaks(String inbMaks) {
        this.inbMaks = inbMaks;
    }
}
