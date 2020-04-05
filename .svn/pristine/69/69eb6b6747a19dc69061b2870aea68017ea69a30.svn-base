package com.warehouse.service.impl;

import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.IncomeTypeMapper;
import com.warehouse.pojo.IncomeType;
import com.warehouse.service.IncomeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class IncomeTypeServiceImpl implements IncomeTypeService {

    @Autowired
    private IncomeTypeMapper incomeTypeMapper;

    @Override
    public List<IncomeType> getAllIncomeTypeInfo(String username) {
        return incomeTypeMapper.getAllIncomeTypeInfo(username);
    }

    @Override
    public void addIncomeTypeInfo(IncomeType incomeType) {
        incomeType.setIntId(UUIDUtils.getUUID());
        incomeTypeMapper.addIncomeTypeInfo(incomeType);
    }

    @Override
    public void updateIncomeTypeInfo(IncomeType incomeType) {
        incomeTypeMapper.updateIncomeTypeInfo(incomeType);
    }

    @Override
    public void deleteIncomeInfo(String id) {
        incomeTypeMapper.deleteIncomeInfo(id);
    }
}
