package com.warehouse.mapper;

import com.warehouse.pojo.ExpendType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExpendTypeMapper {
    List<ExpendType> getAllExpendTypeInfo(@Param(value = "username") String username);

    void addExpendTypeInfo(ExpendType expendType);

    void updateExpendTypeInfo(ExpendType expendType);

    void deleteExpendTypeInfo(@Param(value = "id") String id);
}
