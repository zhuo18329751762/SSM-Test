package com.yangzhuo;

import com.yangzhuo.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        //ctx.close();
        //ctx.registerShutdownHook();
        BookDao bookDao=(BookDao) ctx.getBean("bookDao");
        bookDao.save();
        ctx.close();
    }
}
