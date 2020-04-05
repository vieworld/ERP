package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Address;
import com.warehouse.pojo.Users;
import com.warehouse.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllAddress(HttpServletRequest request) {
//        Users users = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        List<Address> list = null;

        try {
            list = addressService.getAllAddress(user.getUsername());
//            list = addressService.getAllAddress("");
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }
//        if(list != null) {
//
//            return JsonData.success("查询成功", list);
//        }
        return JsonData.success("查询成功", list);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addAddressInfo(@RequestBody Address address, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        address.setUsername(user.getUsername());

        try {
            addressService.addAddressInfo(address);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("添加失败");
        }
        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JsonData updateAddressInfo(@RequestBody Address address) {

        try {
            addressService.updateAddressInfo(address);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("更新失败");
        }
        return JsonData.success("更新成功");
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData deleteAddressInfo(@PathVariable("id") String id) {

        try {
            addressService.deleteAddressInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }
        return JsonData.success("删除成功");
    }
}
