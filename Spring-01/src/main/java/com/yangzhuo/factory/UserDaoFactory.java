package com.yangzhuo.factory;

import com.yangzhuo.dao.OrderDao;
import com.yangzhuo.dao.UserDao;
import com.yangzhuo.dao.impl.OrderDaoImpl;
import com.yangzhuo.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
