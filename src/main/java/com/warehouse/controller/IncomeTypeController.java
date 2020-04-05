package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.IncomeType;
import com.warehouse.pojo.Users;
import com.warehouse.service.IncomeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/incomeType")
public class IncomeTypeController {

    @Autowired
    private IncomeTypeService incomeTypeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllIncomeTypeInfo(HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        List<IncomeType> list = null;

        try {
            list = incomeTypeService.getAllIncomeTypeInfo(user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", list);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addIncomeTypeInfo(@RequestBody IncomeType incomeType, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);
        incomeType.setUsername(user.getUsername());

        try {
            incomeTypeService.addIncomeTypeInfo(incomeType);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("添加失败");
        }

        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JsonData updaeIncomeTypeInfo(@RequestBody IncomeType incomeType) {

        try {
            incomeTypeService.updateIncomeTypeInfo(incomeType);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("更新失败");
        }

        return JsonData.success("更新成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData deleteIncomeTypeInfo(@PathVariable("id") String id) {

        try {
            incomeTypeService.deleteIncomeInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }

        return JsonData.success("删除成功");
    }

}
