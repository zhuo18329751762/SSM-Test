package com.yangzhuo;

import com.yangzhuo.dao.BookDao;
import com.yangzhuo.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppForLifeCycle {
    /**
     * setter注入
     * @param args
     */
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
