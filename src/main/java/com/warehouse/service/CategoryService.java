package com.warehouse.service;

import com.warehouse.pojo.Category;
import com.warehouse.pojo.Users;

import java.util.List;

public interface CategoryService {

    //查询物品分类信息名称
    List<Category> getAllCategoryInfo(String username);

    //添加分类信息
    void addCategoryInfo(Category category);

    //更新分类信息
    void updateCategoryInfo(Category category);

    //删除分类信息
    void deleteCategoryInfo(String id);
}
