package com.warehouse.service;

import com.warehouse.pojo.Users;

public interface UserService {

    /**
     * 用户登录
     *
     * @param users
     * @return
     */
    Users getUser(Users users);

    /**
     * 用户注册
     *
     * @param users
     */
    void addUser(Users users);
}
