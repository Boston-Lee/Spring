package com.ie.Factory;

import com.ie.Dao.Impl.UserDaoImpl;
import com.ie.Dao.UserDao;

public class StaticFactory {
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
