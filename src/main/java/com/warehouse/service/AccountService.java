package com.warehouse.service;

import com.warehouse.pojo.Account;

import java.util.List;

public interface AccountService {

    //查询所有资金账户
    List<Account> getAllAccountInfo(String username);

    //添加资金账户
    void addAccountInfo(Account account);

    //更新资金账户信息
    void updateAccountInfo(Account account);

    //删除资金账户信息
    void deleteAccountInfo(String id);
}
