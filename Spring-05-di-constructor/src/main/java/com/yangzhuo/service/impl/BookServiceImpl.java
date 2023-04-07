package com.yangzhuo.service.impl;

import com.yangzhuo.dao.BookDao;
import com.yangzhuo.dao.UserDao;
import com.yangzhuo.service.BookService;

public class BookServiceImpl implements BookService {
    // 5 删除业务层中使用new的方式创建dao对象
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
