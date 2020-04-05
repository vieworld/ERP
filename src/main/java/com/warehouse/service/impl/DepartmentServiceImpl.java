package com.warehouse.service.impl;

import com.warehouse.mapper.DepartmentMapper;
import com.warehouse.pojo.Department;
import com.warehouse.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAllInfo(String username) {

        return departmentMapper.getAllInfo(username);
    }

    @Override
    public void addDepartmentInfo(Department department) {
        departmentMapper.addDepartmentInfo(department);
    }

    @Override
    public void updateDepartmentInfo(Department department) {
        departmentMapper.updateDepartmentInfo(department);
    }

    @Override
    public void deleteDepartmentInfo(String id) {
        departmentMapper.deleteDepartmentInfo(id);
    }
}
