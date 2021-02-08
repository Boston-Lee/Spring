package com.ie.Demo;

import com.ie.Dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao =(UserDao) app.getBean("userDao");
        userDao.saveDao();
    }
}
