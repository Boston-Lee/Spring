package com.ie.Service.Impl;

import com.ie.Dao.Impl.UserDaoImpl;
import com.ie.Dao.UserDao;
import com.ie.Service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    @Override
    public void save() {
        userDao.saveDao();
    }
}
