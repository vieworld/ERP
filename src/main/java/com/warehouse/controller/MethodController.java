package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Method;
import com.warehouse.pojo.Users;
import com.warehouse.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/method")
public class MethodController {
    @Autowired
    private MethodService methodService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllMethodInfo(HttpServletRequest request) {
//        Users users = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

//        Users users = new Users();
//        users.setUsername("123");

        List<Method> list = null;

        try {
            list = methodService.getAllMethodInfo(user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", list);
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addMethodInfo(@RequestBody Method method, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);
        method.setUsername(user.getUsername());
        try {
            methodService.addMethodInfo(method);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("添加失败");
        }

        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JsonData updateMethodInfo(@RequestBody Method method) {

        try {
            methodService.updateMethodInfo(method);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("修改失败");
        }

        return JsonData.success("修改成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public JsonData deleteMethodInfo(@PathVariable("id") String id) {

        try {
            methodService.deleteMethodInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }

        return JsonData.success("删除成功");
    }
}
