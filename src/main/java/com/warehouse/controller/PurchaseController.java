package com.warehouse.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.warehouse.Vo.ProcurementDetailsVo;
import com.warehouse.Vo.PurchaseContentVo;
import com.warehouse.Vo.PurchaseDetailsVo;
import com.warehouse.Vo.PurchaseVo;
import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.*;
import com.warehouse.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;


    /**
     * 新建采购单
     *
     * @param purchase
     * @param fileName
     * @param request
     * @return
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addPurchase(@RequestBody Purchase purchase, MultipartFile[] fileName, HttpServletRequest request) {

        Users user = (Users) request.getSession().getAttribute("users");


        Purchase purchase1 = null;
//        Users user = new Users();
//        user.setUsername("123");

        try {
            purchase1 = purchaseService.addPurchase(purchase, fileName, user);

        } catch (Exception e) {
            e.printStackTrace();

            return JsonData.faile("添加失败");
        }

        return JsonData.success("添加成功", purchase1);
    }


    /**
     * 查询所有采购信息
     *
     * @param purchaseVo
     * @param request
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public JsonData getPurchaseInfo(@RequestBody PurchaseVo purchaseVo, HttpServletRequest request) {
//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

//        PurchaseVo object = JSONObject.parseObject(purchaseVo, PurchaseVo.class);

        purchaseVo.setUsername(user.getUsername());

//        System.out.println("===========================<>state");


//        Users user = new Users();
//        user.setUsername("123");
//        purchaseVo.setUsername(user.getUsername());

        PageInfo<PurchaseDetailsVo> list = null;
        try {
            list = purchaseService.getAllPurchaseInfo(purchaseVo);
        } catch (Exception e) {

            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", list);
    }

    @RequestMapping(value = "/getQueryItem", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getQueryItem(HttpServletRequest request) {

//        Users users = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);
        List<String> queryItem = null;

        try {
            queryItem = purchaseService.getQueryItem(user.getUsername());
//            queryItem = purchaseService.getQueryItem("123");
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", queryItem);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getPurchaseInfo(@PathVariable("id") String id) {
//
        Purchase purchase = null;

        try {
            purchase = purchaseService.getPurchaseInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }


        return JsonData.success("查询成功", purchase);
    }


    @RequestMapping(value = "/purchaseDetails", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getPurchaseDetails(@RequestBody ProcurementDetailsVo procurementDetailsVo, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        procurementDetailsVo.setUsername(user.getUsername());

        PageInfo<Purchase> list = null;
        try {

            list = purchaseService.getPurchaseDetails(procurementDetailsVo);

        } catch (Exception e) {
            e.printStackTrace();

            return JsonData.faile("查询失败");
        }
        return JsonData.success("查询成功", list);
    }

    @RequestMapping(value = "/getPurchaseTacking", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getPurchaseTacking(@RequestBody PurchaseVo purchaseVo, HttpServletRequest request) {

        PageInfo pageInfo = null;

        try {

        } catch (Exception e) {
            e.printStackTrace();

            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", pageInfo);
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    @ResponseBody
    public JsonData updatePurchase(@RequestBody Purchase purchase, MultipartFile[] fileName) {

        try {

            purchaseService.updatePurchaseInfo(purchase, fileName);

        } catch (Exception e) {
            e.printStackTrace();

            return JsonData.faile("更新失败");
        }

        return JsonData.success("更新成功");
    }

    @RequestMapping(value = "/dele/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData deletePurchaseInfo(@PathVariable("id") String id) {

        try {

            purchaseService.deletePurchaseInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }

        return JsonData.success("删除成功");
    }


}
