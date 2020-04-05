package com.warehouse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.warehouse.common.JsonData;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ErrorController {

    @RequestMapping("/error")
    public JsonData getError(HttpServletRequest request){

        Object msg = request.getAttribute("msg");
        return JsonData.faile((String)msg);
    }
}
