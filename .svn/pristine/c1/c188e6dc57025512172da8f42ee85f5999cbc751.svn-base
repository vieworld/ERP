package com.warehouse.service.impl;

import com.warehouse.mapper.UserMapper;
import com.warehouse.pojo.Users;
import com.warehouse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserserviceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Users getUser(@RequestBody Users users) {
        Users users1 = userMapper.getUser(users);
//        System.out.println(users1.getUsername());
        return users1;
    }

    @Override
    public void addUser(@RequestBody Users users) {
        userMapper.addUser(users);
    }
}
