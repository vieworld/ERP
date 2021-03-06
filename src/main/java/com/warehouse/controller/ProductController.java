package com.warehouse.controller;

import com.github.pagehelper.PageInfo;
import com.warehouse.Vo.ProductVo;
import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Users;
import com.warehouse.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/getPartProduct", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllProductInfo(@RequestBody ProductVo productVo, HttpServletRequest request) {

//        Users user = (Users) request.getSession().getAttribute("users");
//        Users user = new Users();
//        user.setUsername("123");
        Users user = UserMap.getUser(request);

        productVo.setUsername(user.getUsername());

        PageInfo pageInfo = null;
        try {
            pageInfo = productService.getPartProduct(productVo);
        } catch (Exception e) {
            e.printStackTrace();

            return JsonData.faile("查询失败");
        }


        return JsonData.success("查询成功", pageInfo);
    }

}
