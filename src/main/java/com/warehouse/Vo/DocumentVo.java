package com.warehouse.Vo;

import java.io.Serializable;

public class DocumentVo implements Serializable {

    private String docnId;

    private int docnDateType;

    private String docnType;

    private String dpId;

    private String dpName;

    public String getDocnId() {
        return docnId;
    }

    public void setDocnId(String docnId) {
        this.docnId = docnId;
    }

    public int getDocnDateType() {
        return docnDateType;
    }

    public void setDocnDateType(int docnDateType) {
        this.docnDateType = docnDateType;
    }

    public String getDocnType() {
        return docnType;
    }

    public void setDocnType(String docnType) {
        this.docnType = docnType;
    }

    public String getDpId() {
        return dpId;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }

    public String getDpName() {
        return dpName;
    }

    public void setDpName(String dpName) {
        this.dpName = dpName;
    }
}
