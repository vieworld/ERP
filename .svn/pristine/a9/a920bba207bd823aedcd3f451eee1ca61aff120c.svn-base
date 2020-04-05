package com.warehouse.service.impl;

import com.warehouse.Vo.SupplierVo;
import com.warehouse.mapper.SupplierMapper;
import com.warehouse.pojo.Users;
import com.warehouse.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public List<SupplierVo> getAllPurchaseSupplier(Users users) {

//        users.setUsername("123");

        return supplierMapper.getAllPurchaseSupplier(users.getUsername());
    }
}
