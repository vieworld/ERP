package com.warehouse.mapper;

import com.warehouse.pojo.Unit;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UnitMapper {

    List<Unit> getAllUnitInfo(@Param(value = "username") String username);

    void addUnitInfo(Unit unit);

    void deleteUnitInfo(@Param(value = "id") String id);
}
