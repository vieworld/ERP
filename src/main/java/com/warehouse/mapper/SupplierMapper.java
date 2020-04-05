package com.warehouse.mapper;

import com.warehouse.Vo.SupplierVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierMapper {

    List<SupplierVo> getAllPurchaseSupplier(@Param(value = "username") String username);

    //查询所有的供应商名称
    List<String> getAllSupplierName(@Param(value = "username") String username);
}
