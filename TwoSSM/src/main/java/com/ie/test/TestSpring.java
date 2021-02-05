package com.ie.test;

import com.ie.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void Test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService= (AccountService) applicationContext.getBean("accountService");
        accountService.fainAll();
    }
}
