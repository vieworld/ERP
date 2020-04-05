package com.warehouse.controller;

import com.github.pagehelper.PageInfo;
import com.warehouse.DTO.SaleOrderItemDTO;
import com.warehouse.Vo.PurchaseVo;
import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.SaleOrder;
import com.warehouse.pojo.Users;
import com.warehouse.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/saleOrder")
public class SaleOrderController {

    @Autowired
    private SaleOrderService saleOrderService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addSaleOrderInfo(@RequestBody SaleOrder saleOrder, MultipartFile[] fileName, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        saleOrder.setUsername(user.getUsername());

        SaleOrder saleOrderInfo = null;
        try {
            saleOrderInfo = saleOrderService.addSaleOrderInfo(saleOrder, fileName);
        } catch (Exception e) {
            e.printStackTrace();

            return JsonData.faile("添加失败");
        }
        return JsonData.success("添加成功", saleOrderInfo);
    }

    @RequestMapping(value = "/getSaleItem", method = RequestMethod.POST)
    @ResponseBody
    public JsonData getSaleOrderItem(@RequestBody PurchaseVo purchaseVo, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        purchaseVo.setUsername(user.getUsername());

        PageInfo<SaleOrderItemDTO> page = null;
        try {
            page = saleOrderService.getSaleOrderItem(purchaseVo);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", page);
    }


    @RequestMapping(value = "/getSaleOrderInfo", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getSaleOrderInfo(@RequestBody String id) {

        SaleOrder saleOrder = null;
        try {

            saleOrder = saleOrderService.getSaleOrderInfo(id);
        } catch (Exception e) {
            e.printStackTrace();

            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", saleOrder);
    }


}
