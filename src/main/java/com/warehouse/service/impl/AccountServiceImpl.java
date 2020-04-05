package com.warehouse.service.impl;

import com.warehouse.common.UUIDUtils;
import com.warehouse.mapper.AccountMapper;
import com.warehouse.pojo.Account;
import com.warehouse.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> getAllAccountInfo(String username) {
        return accountMapper.getAllAccountInfo(username);
    }

    @Override
    public void addAccountInfo(Account account) {
        account.setAccId(UUIDUtils.getUUID());
        accountMapper.addAccountInfo(account);
    }

    @Override
    public void updateAccountInfo(Account account) {
        accountMapper.updateAccountInfo(account);
    }

    @Override
    public void deleteAccountInfo(String id) {
        accountMapper.deleteAccountInfo(id);
    }
}
