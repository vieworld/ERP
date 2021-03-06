package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Department;
import com.warehouse.pojo.Users;
import com.warehouse.service.DepartmentService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllInfo(HttpServletRequest request) {
//        Users users = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);

        List<Department> list = null;
        try {
            list = departmentService.getAllInfo(user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", list);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addDepartmentInfo(@RequestBody Department department, HttpServletRequest request) {
//        Users users = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);
        department.setUsername(user.getUsername());

        try {

            departmentService.addDepartmentInfo(department);
        } catch (Exception e) {

            e.printStackTrace();
            return JsonData.faile("添加失败");
        }


        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JsonData updateDepartmentInfo(@RequestBody Department department) {

        try {

            departmentService.updateDepartmentInfo(department);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("更新失败");
        }

        return JsonData.success("更新成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData deleteDepartmentInfo(@PathVariable("id") String id) {

        try {
            departmentService.deleteDepartmentInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }

        return JsonData.success("删除成功");
    }
}
