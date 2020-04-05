package com.warehouse.service.impl;

import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.ExpendTypeMapper;
import com.warehouse.pojo.ExpendType;
import com.warehouse.service.ExpendTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpendTypeServiceImpl implements ExpendTypeService {

    @Autowired
    private ExpendTypeMapper expendTypeMapper;

    @Override
    public List<ExpendType> getAllExpendTypeInfo(String username) {
        return expendTypeMapper.getAllExpendTypeInfo(username);
    }

    @Override
    public void addExpendTypeInfo(ExpendType expendType) {
        expendType.setExptId(UUIDUtils.getUUID());

        expendTypeMapper.addExpendTypeInfo(expendType);
    }

    @Override
    public void updateExpendTypeInfo(ExpendType expendType) {
        expendTypeMapper.updateExpendTypeInfo(expendType);
    }

    @Override
    public void deleteExpendTypeInfo(String id) {
        expendTypeMapper.deleteExpendTypeInfo(id);
    }
}
