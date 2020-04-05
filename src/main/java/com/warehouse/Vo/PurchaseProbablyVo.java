package com.warehouse.Vo;

import java.io.Serializable;

public class PurchaseProbablyVo implements Serializable {

    private String pudProName;

    private Integer pudNum;

    public String getPudProName() {
        return pudProName;
    }

    public void setPudProName(String pudProName) {
        this.pudProName = pudProName;
    }

    public Integer getPudNum() {
        return pudNum;
    }

    public void setPudNum(Integer pudNum) {
        this.pudNum = pudNum;
    }
}
