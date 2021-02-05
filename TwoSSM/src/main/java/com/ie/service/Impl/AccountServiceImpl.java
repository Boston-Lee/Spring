package com.ie.service.Impl;

import com.ie.dao.IAccountdao;
import com.ie.domain.Account;
import com.ie.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private IAccountdao iAccountdao;

    @Override
    public List<Account> fainAll() {
        System.out.println("Service业务层：查询所有账户...");
        return iAccountdao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("Service业务层：保存账户...");
    }
}
