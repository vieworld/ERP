package com.warehouse.service.impl;

import com.warehouse.Vo.CustomVo;
import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.CustomMapper;
import com.warehouse.pojo.Custom;
import com.warehouse.pojo.Users;
import com.warehouse.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomSrviceImpl implements CustomService {

    @Autowired
    private CustomMapper customMapper;


    @Override
    public List<String> getAllPurchaseCustomInfo(Users user) {
        return customMapper.getAllPurchaseCustomInfo(user.getUsername());
    }

    @Override
    public List<CustomVo> getAllCustomInfo(String username, int id) {
        return customMapper.getAllCustomInfo(username, id);
    }

    @Override
    public void addCustomInfo(Custom custom) {
        custom.setCusId(UUIDUtils.getUUID());
        customMapper.addCustomInfo(custom);
    }

    @Override
    public void updateCustomInfo(Custom custom) {
        customMapper.updateCustomInfo(custom);
    }

    @Override
    public void deleteCustomInfo(String id) {
        customMapper.deleteCustomInfo(id);
    }
}
