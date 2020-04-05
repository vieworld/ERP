package com.warehouse.mapper;

import com.warehouse.pojo.Users;

public interface UserMapper {

    public Users getUser(Users users);

    void addUser(Users users);
}
