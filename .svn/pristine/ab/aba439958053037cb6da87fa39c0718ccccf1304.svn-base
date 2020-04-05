package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UUIDUtils;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Unit;
import com.warehouse.pojo.Users;
import com.warehouse.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/unit")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllUnitInfo(HttpServletRequest request) {

//        Users users = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        List<Unit> list = null;
        try {
            list = unitService.getAllUnitInfo(user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }


        return JsonData.success("查询成功", list);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addUnitInfo(@RequestBody Unit unit, HttpServletRequest request) {

//        Users users = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);
        unit.setUsername(user.getUsername());

        try {
            unitService.addUnitInfo(unit);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("添加失败");
        }


        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData deleteUnitInfo(@PathVariable("id") String id) {


        try {
            unitService.deleteUnitInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }


        return JsonData.success("删除成功");
    }
}
