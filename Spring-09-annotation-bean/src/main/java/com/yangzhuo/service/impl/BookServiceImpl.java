package com.yangzhuo.service.impl;

import com.yangzhuo.dao.BookDao;
import com.yangzhuo.service.BookService;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
