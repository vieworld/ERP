package com.warehouse.service.impl;

import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.UnitMapper;
import com.warehouse.pojo.Unit;
import com.warehouse.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    private UnitMapper unitMapper;

    @Override
    public List<Unit> getAllUnitInfo(String username) {
        return unitMapper.getAllUnitInfo(username);
    }

    @Override
    public void addUnitInfo(Unit unit) {
        unit.setuId(UUIDUtils.getUUID());
        unitMapper.addUnitInfo(unit);
    }

    @Override
    public void deleteUnitInfo(String id) {
        unitMapper.deleteUnitInfo(id);
    }

}
