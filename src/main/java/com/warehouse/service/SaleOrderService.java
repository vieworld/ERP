package com.warehouse.service;

import com.github.pagehelper.PageInfo;
import com.warehouse.DTO.SaleOrderItemDTO;
import com.warehouse.Vo.PurchaseVo;
import com.warehouse.pojo.SaleOrder;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface SaleOrderService {

    //添加销售订单信息
    SaleOrder addSaleOrderInfo(SaleOrder saleOrder, MultipartFile[] fileName) throws IOException;

    //查询用户所有
    PageInfo<SaleOrderItemDTO> getSaleOrderItem(PurchaseVo purchaseVo);

    SaleOrder getSaleOrderInfo(String id);
}
