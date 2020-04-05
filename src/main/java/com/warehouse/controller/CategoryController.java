package com.warehouse.controller;

import com.warehouse.common.JsonData;
import com.warehouse.common.UserMap;
import com.warehouse.pojo.Category;
import com.warehouse.pojo.Users;
import com.warehouse.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public JsonData getAllCategoryName(HttpServletRequest request) {

//        Users users = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);

        List<Category> list = null;
        try {
            list = categoryService.getAllCategoryInfo(user.getUsername());
        } catch (Exception e) {
            e.printStackTrace();

            return JsonData.faile("查询失败");
        }


        return JsonData.success("查询成功", list);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonData addCategory(@RequestBody Category category, HttpServletRequest request) {
//        Users users = (Users) request.getSession().getAttribute("users");
        Users user = UserMap.getUser(request);
        category.setUsername(user.getUsername());

        try {
            categoryService.addCategoryInfo(category);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("添加失败");
        }

        return JsonData.success("添加成功");
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public JsonData updateCategory(@RequestBody Category category) {

        try {
            categoryService.updateCategoryInfo(category);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("修改失败");
        }

        return JsonData.success("修改成功");
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public JsonData updateCategory(@PathVariable("id") String id) {

        try {
            categoryService.deleteCategoryInfo(id);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonData.faile("删除失败");
        }

        return JsonData.success("删除成功");
    }

}
