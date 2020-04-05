package com.warehouse.service.impl;

import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.ExpressMapper;
import com.warehouse.pojo.Express;
import com.warehouse.service.ExpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpressServiceImpl implements ExpressService {

    @Autowired
    private ExpressMapper expressMapper;


    @Override
    public List<Express> getAllExpressInfo(String username) {
        return expressMapper.getAllExpressInfo(username);
    }

    @Override
    public void addExpressInfo(Express express) {
        express.setExpId(UUIDUtils.getUUID());
        expressMapper.addExpressInfo(express);
    }

    @Override
    public void updateExpressInfo(Express express) {
        expressMapper.updateExpressInfo(express);
    }

    @Override
    public void deleteExpressInfo(String id) {
        expressMapper.deleteExpressInfo(id);
    }
}
