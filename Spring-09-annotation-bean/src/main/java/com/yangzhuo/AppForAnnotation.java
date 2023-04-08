package com.yangzhuo;

import com.yangzhuo.config.SpringConfig;
import com.yangzhuo.dao.BookDao;
import com.yangzhuo.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAnnotation {
    /**
     * 纯注解开发
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookService=ctx.getBean(BookService.class);
        System.out.println(bookService);
    }
}
