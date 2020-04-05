package com.warehouse.service;

import com.warehouse.pojo.TaxRate;
import com.warehouse.pojo.Users;

import java.util.List;

public interface TaxRateService {
    /**
     * 获取用户自定义的税率信息
     *
     * @param username
     * @return
     */
    List<TaxRate> getAllTaxRateInfo(String username);

    //添加用户税率信息
    void addTaxRateInfo(TaxRate taxRate);

    //更新用户税率信息
    void updateTaxRateInfo(TaxRate taxRate);

    //删除用户税率信息
    void deleteTaxRateInfo(String id);


}
