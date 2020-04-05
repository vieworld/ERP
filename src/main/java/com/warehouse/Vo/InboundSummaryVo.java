package com.warehouse.Vo;

import java.io.Serializable;
import java.util.*;

public class InboundSummaryVo implements Serializable {

    private String warehouse;

    private String inbId;

    private Date inbDate;

    private String puiSupid;

    private Float inbSum;

    private String inbHandle;

    private String inbMaks;

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
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

    public String getPuiSupid() {
        return puiSupid;
    }

    public void setPuiSupid(String puiSupid) {
        this.puiSupid = puiSupid;
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
