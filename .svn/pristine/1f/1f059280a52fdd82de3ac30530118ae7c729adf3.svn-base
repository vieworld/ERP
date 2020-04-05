package com.warehouse.mapper;

import com.warehouse.pojo.IncomeType;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IncomeTypeMapper {


    List<IncomeType> getAllIncomeTypeInfo(@Param(value = "username") String username);

    void addIncomeTypeInfo(IncomeType incomeType);

    void updateIncomeTypeInfo(IncomeType incomeType);

    void deleteIncomeInfo(@Param(value = "id") String id);
}
