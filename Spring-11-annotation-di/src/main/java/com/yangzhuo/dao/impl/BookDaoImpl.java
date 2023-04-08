package com.yangzhuo.dao.impl;

import com.yangzhuo.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bookDao")
public class BookDaoImpl implements BookDao {
    @Value("${name}")
    private String name;
    @Value("13")
    private int age;
    @Override
    public void save() {
        System.out.println("book dao save ..."+name+" "+age);
    }

}
