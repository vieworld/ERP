package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Account;
import com.warehouse.pojo.Users;
import com.warehouse.service.AccountService;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllAccountInfo(HttpServletRequest request) {

//        String token = request.getHeader("token");
//        Users user = (Users) request.getSession().getAttribute("users");

        Users user = UserMap.getUser(request);


        List<Account> list = null;

        try {

            list = accountService.getAllAccountInfo(user.getUsername());

        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("查询失败");
        }
        return JsonData.success("查询成功");
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addAccountInfo(@RequestBody Account account, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        account.setUsername(user.getUsername());

        try {

            accountService.addAccountInfo(account);

        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("添加失败");
        }
        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JsonData updateAccountInfo(@RequestBody Account account) {


        try {

            accountService.updateAccountInfo(account);

        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("更新失败");
        }
        return JsonData.success("更新成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData deleteAccountInfo(@PathVariable("id") String id) {


        try {

            accountService.deleteAccountInfo(id);

        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }
        return JsonData.success("删除成功");
    }

}
