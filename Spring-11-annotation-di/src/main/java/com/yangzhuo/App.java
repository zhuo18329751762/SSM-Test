package com.yangzhuo;

import com.yangzhuo.config.SpringConfig;
import com.yangzhuo.dao.BookDao;
import com.yangzhuo.service.BookService;
import com.yangzhuo.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    /**
     * 纯注解开发
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
       BookService bookService=ctx.getBean(BookService.class);
       bookService.save();
    }
}
