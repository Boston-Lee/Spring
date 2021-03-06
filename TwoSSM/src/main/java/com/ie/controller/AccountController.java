package com.ie.controller;

import com.ie.domain.Account;
import com.ie.service.AccountService;
import com.ie.service.Impl.AccountServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/account/findAll")
    public String findAll(Model model) {
        System.out.println("Controller表现层：查询所有账户");
        List<Account> list=accountService.fainAll();
        model.addAttribute("list",list);
        return "list";//在视图解析器中配置了前缀后缀
    }
}
