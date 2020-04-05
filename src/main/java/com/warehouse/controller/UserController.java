package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Users;
import com.warehouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public JsonData login(@RequestBody Users users, HttpServletRequest request, HttpServletResponse response) {

        Users users1 = null;

        try {
            users1 = userService.getUser(users);

        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("用户账号或密码错误");
        }

        if (null != users1) {
            request.getSession().setAttribute("users", users1);

            String token = request.getSession().getId();
//            request.getSession().setAttribute("cookie", token);
            Cookie cookie = new Cookie("cookie", token);

            cookie.setMaxAge(24*60*60);
            response.addCookie(cookie);

            new JsonData().setToken(token);
            UserMap.addUser(token, request.getSession());
            return JsonData.success("查询成功", users1);
        } else {
            return JsonData.faile("用户账号或密码错误");
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public JsonData register(@RequestBody Users users) {

        try {
            userService.addUser(users);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("注册失败，请重新注册");
        }
        return JsonData.success("注册成功");
    }

}
