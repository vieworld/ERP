package com.warehouse.service.impl;

import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.MethodMapper;
import com.warehouse.pojo.Method;
import com.warehouse.pojo.Users;
import com.warehouse.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MethodServiceImpl implements MethodService {

    @Autowired
    private MethodMapper methodMapper;


    @Override
    public List<Method> getAllMethodInfo(String username) {
//        users.setUsername('123');
        return methodMapper.getAllMethodInfo(username);
    }

    @Override
    public void addMethodInfo(Method method) {
        method.setMetId(UUIDUtils.getUUID());
        methodMapper.addMethodInfo(method);
    }

    @Override
    public void updateMethodInfo(Method method) {
        methodMapper.updateMethodInfo(method);
    }

    @Override
    public void deleteMethodInfo(String id) {
        methodMapper.deleteMethodInfo(id);
    }
}
