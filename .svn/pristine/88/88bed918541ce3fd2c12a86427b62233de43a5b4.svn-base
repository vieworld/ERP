package com.warehouse.service.impl;

import com.warehouse.mapper.EmployeeMapper;
import com.warehouse.pojo.Employee;
import com.warehouse.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployeeInfo(String username) {
        return employeeMapper.getAllEmployeeInfo(username);
    }

    @Override
    public void addEmployeeInfo(Employee employee) {
        employeeMapper.addEmployeeInfo(employee);
    }

    @Override
    public void updateEmployeeInfo(Employee employee) {
        employeeMapper.updateEmployeeInfo(employee);
    }

    @Override
    public void deleteEmployeeInfo(String id) {
        employeeMapper.deleteEmployeeInfo(id);
    }
}
