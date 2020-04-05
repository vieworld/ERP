package com.warehouse.mapper;

import com.warehouse.pojo.Method;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MethodMapper {

    List<Method> getAllMethodInfo(@Param(value = "username") String username);

    void addMethodInfo(Method method);

    void updateMethodInfo(Method method);

    void deleteMethodInfo(@Param(value = "id") String id);
}
