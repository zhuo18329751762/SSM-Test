package com.yangzhuo.dao.impl;

import com.yangzhuo.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private String databaseName;
    private int  connectionNum;

    public BookDaoImpl(String databaseName, int connectionNum) {
        this.databaseName = databaseName;
        this.connectionNum = connectionNum;
    }

    @Override
    public void save() {
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
    }
}

