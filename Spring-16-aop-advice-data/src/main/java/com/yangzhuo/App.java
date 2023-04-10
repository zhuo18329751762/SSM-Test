package com.yangzhuo;

import com.yangzhuo.config.SpringConfig;
import com.yangzhuo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao=ctx.getBean(BookDao.class);
        String name = bookDao.findName(100,"1234");
        System.out.println(name);
    }
}
