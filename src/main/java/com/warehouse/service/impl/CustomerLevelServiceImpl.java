package com.warehouse.service.impl;

import com.warehouse.mapper.CustomerLevelMapper;
import com.warehouse.pojo.CustomerLevel;
import com.warehouse.service.CustomerLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerLevelServiceImpl implements CustomerLevelService {

    @Autowired
    private CustomerLevelMapper customerLevelMapper;

    @Override
    public List<CustomerLevel> getAllCustomerLevelInfo(String username) {
        return customerLevelMapper.getAllCustomerLevelInfo(username);
    }

    @Override
    public void addCustomerLevelInfo(CustomerLevel customerLevel) {
        customerLevelMapper.addCustomerLevelInfo(customerLevel);
    }

    @Override
    public void updateCustomerLevelInfo(CustomerLevel customerLevel) {
        customerLevelMapper.updateCustomerLevelInfo(customerLevel);
    }

    @Override
    public void deleteCustomerLevelInfo(String id) {
        customerLevelMapper.deleteCustomerLevelInfo(id);
    }
}
