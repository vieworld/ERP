package com.warehouse.mapper;

import com.warehouse.pojo.CustomerLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CustomerLevelMapper {

    List<CustomerLevel> getAllCustomerLevelInfo(@Param(value = "username") String username);

    void addCustomerLevelInfo(CustomerLevel customerLevel);

    void updateCustomerLevelInfo(CustomerLevel customerLevel);

    void deleteCustomerLevelInfo(@Param(value = "id") String id);
}
