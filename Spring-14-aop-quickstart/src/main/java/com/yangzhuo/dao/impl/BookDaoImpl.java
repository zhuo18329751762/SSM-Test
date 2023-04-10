package com.yangzhuo.dao.impl;

import com.yangzhuo.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save(){
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save ...");
    }
    public void update(){
        System.out.println("book dao update ...");
    }

    @Override
    public int select() {
        System.out.println("book dao select ...");
        return 0;
    }
}
