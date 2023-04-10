package com.yangzhuo.dao.impl;

import com.yangzhuo.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public String findName(int id, String passWord) {
        System.out.println("id:"+id);
        return "itcast";
    }
}
