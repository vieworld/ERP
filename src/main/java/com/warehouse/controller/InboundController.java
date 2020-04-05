package com.warehouse.controller;

import com.github.pagehelper.PageInfo;
import com.warehouse.DTO.PurchaseInboundDTO;
import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Inbound;
import com.warehouse.pojo.Purchase;
import com.warehouse.pojo.Users;
import com.warehouse.service.InboundSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/inbound")
public class InboundController {

    @Autowired
    private InboundSevice inboundSevice;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public JsonData addInbound(@RequestBody Inbound inbound, HttpServletRequest request, MultipartFile[] filName) {

//        Users users = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);
        inbound.setUsername(user.getUsername());
        String id = null;
        try {
            id = inboundSevice.addInbound(inbound, filName);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("入库失败");
        }

        return JsonData.success("入库成功", id);
    }

    @RequestMapping(value = "/getPurchaseInboundInfo", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getPurchaseInboundInfo(@RequestBody String id, @RequestBody int pageSize, @RequestBody int page, HttpServletRequest request) {

        PageInfo<PurchaseInboundDTO> list = null;
        try {
            list = inboundSevice.getPurchaseInboundInfo(id, pageSize, page);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }

        return JsonData.success("查询成功", list);
    }

}
