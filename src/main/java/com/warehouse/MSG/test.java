package com.warehouse.MSG;


import com.github.pagehelper.PageInfo;
import com.warehouse.DTO.SaleOrderItemDTO;
import com.warehouse.Vo.PurchaseVo;
import com.warehouse.mapper.ProductMapper;
import com.warehouse.mapper.PurchaseMapper;
import com.warehouse.service.InboundSevice;
import com.warehouse.service.PurchaseService;
import com.warehouse.service.SaleOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class test {

    @Autowired
    private PurchaseService purchaseService;
    @Autowired
    private PurchaseMapper purchaseMapper;

    @Autowired
    private InboundSevice inboundSevice;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private SaleOrderService saleOrderService;


    @Test
    public void test1() throws IOException {
//        PurchaseVo purchaseVo = new PurchaseVo();
//        purchaseVo.setUsername("123");
//        PageInfo<PurchaseDetailsVo> info = purchaseService.getAllPurchaseInfo(purchaseVo);
//
//        List<PurchaseDetailsVo> list = info.getList();
//        System.out.println("++++++++++++++++++++++++++++++++");
//
//        for (PurchaseDetailsVo vo : list) {
//            System.out.println(vo.getPurTime());
//        }
//
//        System.out.println("++++++++++++++++++++++++++++++++");

//        SaleOrder saleOrder = new SaleOrder();
//        saleOrder.setSoTime(new Date());
//        saleOrder.setUsername("123");
//        saleOrder.setcId("mark");
//
//        Purdetails purdetails = new Purdetails();
//        purdetails.setPudProName("中国近代史");
//        purdetails.setPudNum(20);
//
////        List<Purdetails> list = new ArrayList<>();
//        saleOrder.getPurdetailsList().add(purdetails);
//
//        SaleOrder order = saleOrderService.addSaleOrderInfo(saleOrder, null);
//
//        System.out.println("----------------------------->"+order.getSoId());

//        PurchaseVo purchaseVo = new PurchaseVo();
//        purchaseVo.setUsername("123");
//        PageInfo<PurchaseDetailsVo> Info = purchaseService.getAllPurchaseInfo(purchaseVo);
//        List<PurchaseDetailsVo> list = Info.getList();
//        for (PurchaseDetailsVo vo : list) {
//            System.out.println("============================<>"+vo.getPurMaks());
//        }

        PurchaseVo purchaseVo = new PurchaseVo();
        purchaseVo.setUsername("123");
        PageInfo<SaleOrderItemDTO> item = saleOrderService.getSaleOrderItem(purchaseVo);

        List<SaleOrderItemDTO> list = item.getList();

        System.out.println("================================>");

        for (SaleOrderItemDTO dto : list) {
            System.out.println(dto.getSoTime());
        }

        System.out.println("================================>");


    }

}
