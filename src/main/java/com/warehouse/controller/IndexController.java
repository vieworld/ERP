package com.warehouse.controller;

import com.warehouse.Vo.ChartVo;
import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Users;
import com.warehouse.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping(value = "/sale/chart", method = RequestMethod.GET)
    @ResponseBody
    public JsonData saleChart(@RequestBody Integer mytime, HttpServletRequest request) {

//        System.out.println("-------------------->"+mytime);
//        System.out.println(mytime==0);

//        Users users = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);
        ChartVo chartVo = null;

        try {
            chartVo = indexService.getSaleChart(mytime, user);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

//        System.out.println("controller-------->"+chartVo);
        return JsonData.success("查询成功", chartVo);
    }

    @RequestMapping(value = "/purchase/chart", method = RequestMethod.GET)
    @ResponseBody
    public JsonData addPurchaseChart(@RequestBody Integer mytime, HttpServletRequest request) {

//        Users users = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);
        ChartVo chartVo = null;

        try {

            chartVo = indexService.getPurchaseChart(mytime, user);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", chartVo);
    }
}

