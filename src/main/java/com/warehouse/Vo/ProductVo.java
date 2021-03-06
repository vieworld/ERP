package com.warehouse.Vo;

import java.io.Serializable;

public class ProductVo implements Serializable {

    private String name;

    private String category;

    //库存状态，0全部库存，1 正常，2负库存，3超出库存上限，4低于库存下线
    private Integer stockState;

    //展示状态
    private Integer state;

    private Integer totalItem = 20;//20,100,200

    private Integer page = 1;

    private String username;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStockState() {
        return stockState;
    }

    public void setStockState(Integer stockState) {
        this.stockState = stockState;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
