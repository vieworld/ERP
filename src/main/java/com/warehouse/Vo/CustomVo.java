package com.warehouse.Vo;

import java.io.Serializable;

public class CustomVo implements Serializable {

    private String cusId;

    private String cusName;

    private String cusContent;


    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusContent() {
        return cusContent;
    }

    public void setCusContent(String cusContent) {
        this.cusContent = cusContent;
    }

}
