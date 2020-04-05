package com.warehouse.mapper;

import com.warehouse.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountMapper {

    List<Account> getAllAccountInfo(@Param(value = "username") String username);

    void addAccountInfo(Account account);

    void updateAccountInfo(Account account);

    void deleteAccountInfo(@Param(value = "id") String id);
}
