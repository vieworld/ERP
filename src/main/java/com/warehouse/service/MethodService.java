package com.warehouse.service;

import com.warehouse.pojo.Method;
import com.warehouse.pojo.Users;

import java.util.List;

public interface MethodService {
    List<Method> getAllMethodInfo(String username);

    void addMethodInfo(Method method);

    void updateMethodInfo(Method method);

    void deleteMethodInfo(String id);
}
