package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.InvoiceType;
import com.warehouse.pojo.Users;
import com.warehouse.service.InvoiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/invoiceType")
public class InvoiceTypeController {

    @Autowired
    private InvoiceTypeService invoiceTypeService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllInvoiceTypeInfo(HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        List<InvoiceType> list = null;

        try {

            list = invoiceTypeService.getAllInvoiceTypeInfo(user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }
        return JsonData.success("查询成功", list);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addInvoiceTypeInfo(@RequestBody InvoiceType invoiceType, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);
        invoiceType.setUsername(user.getUsername());

        try {

            invoiceTypeService.addInvoiceTypeInfo(invoiceType);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("添加失败");
        }
        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JsonData updateInvoiceTypeInfo(@RequestBody InvoiceType invoiceType) {

        try {

            invoiceTypeService.updateInvoiceTypeInfo(invoiceType);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("更新失败");
        }

        return JsonData.success("更新成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData deleteInvoiceTypeInfo(@PathVariable("id") String id) {

        try {

            invoiceTypeService.deleteInvoiceTypeInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }

        return JsonData.success("删除成功");
    }

}
