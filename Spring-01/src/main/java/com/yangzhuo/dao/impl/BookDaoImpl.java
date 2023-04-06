package com.yangzhuo.dao.impl;

import com.yangzhuo.dao.BookDao;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
}
