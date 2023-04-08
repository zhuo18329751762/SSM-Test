package com.yangzhuo.dao.impl;

import com.yangzhuo.dao.BookDao;
import org.springframework.stereotype.Component;

@Component("bookDao2")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...2");
    }

}
