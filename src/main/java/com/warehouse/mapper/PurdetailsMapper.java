package com.warehouse.mapper;

import com.warehouse.pojo.Purdetails;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurdetailsMapper {

    void addPurdetailsList(@Param(value = "list") List<Purdetails> list);

    //查询所有采购物品名称
    List<String> getAllProductName(@Param(value = "allPurchaseId") List<String> allPurchaseId);

    //更新物品入库数量
    void updatePurchaseInbound(@Param(value = "list") List<Purdetails> purdetailsList);

    //更新物品详情
    void updatePurdetailsInfo(@Param(value = "purdetailsList") List<Purdetails> purdetailsList);

//    //更新采购物品详情
//    void updatePurdetailsList(@Param(value = "purdetailsList") List<Purdetails> purdetailsList);

//    //添加采购物品信息
//    void addInboundPurdetailsList(@Param(value = "purdetailsList") List<Purdetails> purdetailsList);
}
