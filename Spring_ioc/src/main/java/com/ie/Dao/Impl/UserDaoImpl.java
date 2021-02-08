package com.ie.Dao.Impl;

import com.ie.Dao.UserDao;
import com.ie.Domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private List<String> list;
    private Map<String, User> userMap;
    private Properties properties;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void saveDao() {
        System.out.println(list);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println(name + "======" + age);
        System.out.println("save running....");
    }
}
