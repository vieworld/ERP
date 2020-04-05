package com.warehouse.controller;

import com.warehouse.Vo.CustomVo;
import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Custom;
import com.warehouse.pojo.Users;
import com.warehouse.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.awt.geom.AreaOp;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 自定义表
 */
@Controller
@RequestMapping("/custom")
public class CustomController {

    @Autowired
    private CustomService customService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllCustomInfo(@RequestBody int id, HttpServletRequest request) {
//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        List<CustomVo> list = null;

        try {
            list = customService.getAllCustomInfo(user.getUsername(), id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }
        return JsonData.faile("查询成功");
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addCustomInfo(@RequestBody Custom custom, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);

        custom.setUsername(user.getUsername());

        try {
            customService.addCustomInfo(custom);
        } catch (Exception e) {

            e.printStackTrace();
            return JsonData.faile("添加失败");
        }


        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    @ResponseBody
    public JsonData updateCustomInfo(@RequestBody Custom custom) {

        try {
            customService.updateCustomInfo(custom);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("更新失败");
        }

        return JsonData.success("更新成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData deleteCustomInfo(@PathVariable String id) {

        try {
            customService.deleteCustomInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }

        return JsonData.success("删除成功");
    }


    @RequestMapping(value = "/getAllPurchaseCustomInfo", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllPurchaseCustomInfo(HttpServletRequest request) {
//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        List<String> customVoList = null;
        try {
            customVoList = customService.getAllPurchaseCustomInfo(user);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", customVoList);
    }
}
