package com.warehouse.mapper;

import com.warehouse.pojo.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {

    List<Category> getAllCategoryInfo(@Param(value = "username") String username);

    void addCategoryInfo(Category category);

    void updateCategoryInfo(Category category);

    void deleteCategoryInfo(@Param(value = "id") String id);
}
