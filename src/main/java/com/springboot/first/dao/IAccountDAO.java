package com.springboot.first.dao;

import com.springboot.first.entity.Account;
import java.util.List;

/**
 * Created by fangzhipeng on 2017/4/20.
 */
public interface IAccountDAO {
    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();
}
