package com.warehouse.service;

import com.github.pagehelper.PageInfo;
import com.warehouse.Vo.ProcurementDetailsVo;
import com.warehouse.Vo.PurchaseContentVo;
import com.warehouse.Vo.PurchaseDetailsVo;
import com.warehouse.Vo.PurchaseVo;
import com.warehouse.pojo.Purchase;
import com.warehouse.pojo.Users;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface PurchaseService {

    //添加采购单
    Purchase addPurchase(Purchase purchase, MultipartFile[] fileName, Users users) throws IOException;

    //查询所有采购信息
    PageInfo<PurchaseDetailsVo> getAllPurchaseInfo(PurchaseVo purchaseVo);

    //查询所有采购id、物品名称、项目、供应商
    List<String> getQueryItem(String username);

    //查询采购单信息详情
    Purchase getPurchaseInfo(String id);

    //采购订单明细表
    PageInfo<Purchase> getPurchaseDetails(ProcurementDetailsVo procurementDetailsVo);

    void updatePurchaseInfo(Purchase purchase, MultipartFile[] fileName) throws IOException;

    //
    void deletePurchaseInfo(String id);

//    void getPurchaseDetailsExcel(ProcurementDetailsVo procurementDetailsVo);
}
