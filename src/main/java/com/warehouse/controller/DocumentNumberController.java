package com.warehouse.controller;

import com.warehouse.Vo.DocumentVo;
import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.DocumentNumber;
import com.warehouse.pojo.Users;
import com.warehouse.service.DocumentNumberService;
import jdk.nashorn.internal.runtime.JSONFunctions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/document")
public class DocumentNumberController {

    @Autowired
    private DocumentNumberService documentNumberService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllDocumentInfo(HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);
        List<DocumentVo> list = null;

//        Users user = new Users();
//        user.setUsername("123");
        try {

            list = documentNumberService.getAllDocumentInfo(user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }
        return JsonData.success("查询成功", list);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JsonData updateDocumentInfo(@RequestBody List<DocumentNumber> documentNumberList, HttpServletRequest request) {
//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

//        documentNumber.getDocumentPrefix().setUsername(user.getUsername());

        try {
            documentNumberService.updateDocumentInfo(documentNumberList, user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("保存失败");
        }

        return JsonData.success("保存成功");
    }
}
