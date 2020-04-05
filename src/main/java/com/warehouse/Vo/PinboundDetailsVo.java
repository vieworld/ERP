package com.warehouse.Vo;

import java.io.Serializable;

public class PinboundDetailsVo implements Serializable {

    private String pudId;

    private Integer number;

    private String reMarks;

    public String getPudId() {
        return pudId;
    }

    public void setPudId(String pudId) {
        this.pudId = pudId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getReMarks() {
        return reMarks;
    }

    public void setReMarks(String reMarks) {
        this.reMarks = reMarks;
    }
}
