package com.warehouse.mapper;

import com.warehouse.pojo.Express;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExpressMapper {

    List<Express> getAllExpressInfo(@Param(value = "username") String username);

    void addExpressInfo(Express express);

    void updateExpressInfo(Express express);

    void deleteExpressInfo(@Param(value = "id") String id);
}
