package com.warehouse.mapper;

import com.warehouse.Vo.ProcurementDetailsVo;
import com.warehouse.Vo.PurchaseContentVo;
import com.warehouse.Vo.PurchaseDetailsVo;
import com.warehouse.Vo.PurchaseVo;
import com.warehouse.pojo.Purchase;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface PurchaseMapper {
    /**
     * 查询当天采购单数
     *
     * @param date
     * @param username
     * @return
     */
    Integer getPurchaseCount(@Param(value = "date") java.util.Date date, @Param(value = "username") String username);

    /**
     * 添加采购单信息
     *
     * @param purchase
     */
    Integer addPurchase(Purchase purchase);

    Purchase getPurchaseInfo(String purId);

    /**
     * 查询所有采购单信息
     *
     * @param purchaseVo
     * @return
     */
    List<PurchaseDetailsVo> getAllPurchaseInfo(PurchaseVo purchaseVo);

    //查询所有采购单id
    List<String> getAllPurchaseId(@Param(value = "username") String username);

    List<Purchase> getPurchaseDetails(ProcurementDetailsVo procurementDetailsVo);

    void updatePurchaseInfo(Purchase purchase);

    void deletePurchaseInfo(@Param(value = "id") String id);
}
