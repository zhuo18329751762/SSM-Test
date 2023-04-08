package com.yangzhuo.dao.impl;

import com.yangzhuo.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
//获取多个对象
@Scope("prototype")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

}
