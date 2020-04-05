package com.warehouse.mapper;

import com.warehouse.pojo.Department;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface DepartmentMapper {

    List<Department> getAllInfo(@Param(value = "username") String username);

    void addDepartmentInfo(Department department);

    void updateDepartmentInfo(Department department);

    void deleteDepartmentInfo(@Param(value = "id") String id);
}
