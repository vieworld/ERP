package com.warehouse.service;

import com.warehouse.pojo.IncomeType;

import java.util.List;

public interface IncomeTypeService {

    //查询所有收入类型
    List<IncomeType> getAllIncomeTypeInfo(String username);

    //添加收入类型
    void addIncomeTypeInfo(IncomeType incomeType);

    //更新收入类型
    void updateIncomeTypeInfo(IncomeType incomeType);

    //删除收入类型
    void deleteIncomeInfo(String id);
}
