package com.warehouse.mapper;

import com.warehouse.DTO.SaleOrderItemDTO;
import com.warehouse.Vo.PurchaseVo;
import com.warehouse.pojo.SaleOrder;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SaleOrderMapper {

    Integer getSaleOrderCount(@Param(value = "soTime") Date soTime, @Param(value = "username") String username);

    //添加销售订单
    Integer addSaleOrderInfo(SaleOrder saleOrder);

    //查询销售订单信息
    SaleOrder getSaleOrderInfo(@Param(value = "id") String soId);

    //查询用户销售订单项
    List<SaleOrderItemDTO> getSaleOrderItem(PurchaseVo purchaseVo);
}
