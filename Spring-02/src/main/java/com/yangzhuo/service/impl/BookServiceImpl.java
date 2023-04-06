package com.yangzhuo.service.impl;

import com.yangzhuo.dao.BookDao;
import com.yangzhuo.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService ,InitializingBean,DisposableBean{
    // 5 删除业务层中使用new的方式创建dao对象
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
    // 6 提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service destroy");
    }
}
