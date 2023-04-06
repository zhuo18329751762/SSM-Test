package com.yangzhuo.dao.impl;

import com.yangzhuo.dao.BookDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookDaoImpl implements BookDao , InitializingBean, DisposableBean {
    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
    //表示bean初始化对应的操作
    public void init(){
        System.out.println("init ...");
    }
    //表示bean销毁前的对应的操作
    public void destory(){
        System.out.println("destory ...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("接口实现 destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("接口实现 初始化");
    }
}
