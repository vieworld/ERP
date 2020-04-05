package com.warehouse.service;

import com.warehouse.Vo.SupplierVo;
import com.warehouse.pojo.Users;

import java.util.List;

public interface SupplierService {

    List<SupplierVo> getAllPurchaseSupplier(Users users);
}
