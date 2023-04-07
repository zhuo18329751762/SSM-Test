package com.yangzhuo.dao.impl;

import com.yangzhuo.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("User dao save");
    }
}
