package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Employee;
import com.warehouse.pojo.Users;
import com.warehouse.service.EmployeeService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllEmployeeInfo(HttpServletRequest request) {

//        Users users = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);
        List<Employee> list = null;

        try {

            list = employeeService.getAllEmployeeInfo(user.getUsername());

        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", list);
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public JsonData addEmployeeInfo(@RequestBody Employee employee) {

        try {

            employeeService.addEmployeeInfo(employee);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("添加失败");
        }

        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    @ResponseBody
    public JsonData updateEmployeeInfo(@RequestBody Employee employee) {

        try {
            employeeService.updateEmployeeInfo(employee);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("修改失败");
        }

        return JsonData.success("修改成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData deleteEmployeeInfo(@PathVariable("id") String id) {

        try {

            employeeService.deleteEmployeeInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }

        return JsonData.success("删除成功");
    }


}
