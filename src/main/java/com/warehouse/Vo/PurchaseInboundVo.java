package com.warehouse.Vo;

import java.io.Serializable;
import java.util.*;

public class PurchaseInboundVo implements Serializable {

    private String purId;

    private Date inbDate;

    private String warehouse;

    private String username;

    private List<PinboundDetailsVo> list = new ArrayList<>();

    public String getPurId() {
        return purId;
    }

    public void setPurId(String purId) {
        this.purId = purId;
    }

    public Date getInbDate() {
        return inbDate;
    }

    public void setInbDate(Date inbDate) {
        this.inbDate = inbDate;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public List<PinboundDetailsVo> getList() {
        return list;
    }

    public void setList(List<PinboundDetailsVo> list) {
        this.list = list;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
