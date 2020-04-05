package com.warehouse.Vo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ChartVo<T> implements Serializable {
    private List<Float> amountList;//金额
    private List<Integer> countList;//单数
    private List<String> groupNameList;//排序字段
    private Float totalAmount;//总金额
    private int countAmount;//总单数

    public List<Float> getAmountList() {
        return amountList;
    }

    public void setAmountList(List<Float> amountList) {
        this.amountList = amountList;
    }

    public List<Integer> getCountList() {
        return countList;
    }

    public void setCountList(List<Integer> countList) {
        this.countList = countList;
    }

    public List<String> getGroupNameList() {
        return groupNameList;
    }

    public void setGroupNameList(List<String> groupNameList) {
        this.groupNameList = groupNameList;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getCountAmount() {
        return countAmount;
    }

    public void setCountAmount(int countAmount) {
        this.countAmount = countAmount;
    }
}
