package com.warehouse.service.impl;

import com.warehouse.mapper.CategoryMapper;
import com.warehouse.pojo.Category;
import com.warehouse.pojo.Users;
import com.warehouse.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getAllCategoryInfo(String username) {

        return categoryMapper.getAllCategoryInfo(username);
    }

    @Override
    public void addCategoryInfo(Category category) {
        categoryMapper.addCategoryInfo(category);
    }

    @Override
    public void updateCategoryInfo(Category category) {
        categoryMapper.updateCategoryInfo(category);
    }

    @Override
    public void deleteCategoryInfo(String id) {
        categoryMapper.deleteCategoryInfo(id);
    }
}
