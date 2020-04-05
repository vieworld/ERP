package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.ExpendType;
import com.warehouse.pojo.Users;
import com.warehouse.service.ExpendTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/expendType")
public class ExpendTypeController {

    @Autowired
    private ExpendTypeService expendTypeService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllExpendTypeInfo(HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        List<ExpendType> list = null;

        try {

            list = expendTypeService.getAllExpendTypeInfo(user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", list);
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addExpendTypeInfo(@RequestBody ExpendType expendType, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        expendType.setUsername(user.getUsername());

        try {

            expendTypeService.addExpendTypeInfo(expendType);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("添加失败");
        }

        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JsonData updateExpendTypeInfo(@RequestBody ExpendType expendType) {

        try {

            expendTypeService.updateExpendTypeInfo(expendType);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("更新失败");
        }

        return JsonData.success("更新成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData deleteExpendTypeInfo(@PathVariable("id") String id) {

        try {

            expendTypeService.deleteExpendTypeInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }

        return JsonData.success("删除成功");
    }

}
