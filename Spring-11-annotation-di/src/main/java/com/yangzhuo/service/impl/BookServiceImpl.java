package com.yangzhuo.service.impl;

import com.yangzhuo.dao.BookDao;
import com.yangzhuo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {
    @Autowired//按照类进行装配
    @Qualifier("bookDao")//按照名称进行装配
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
