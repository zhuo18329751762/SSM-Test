package com.yangzhuo;

import com.yangzhuo.dao.BookDao;
import com.yangzhuo.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP2 {
    public static void main(String[] args) {
        // 3 获取IOC容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4 获取bean
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService) ctx.getBean("bookService");
        BookService bookService2 = (BookService) ctx.getBean("bookService");
        //bookService.save();
        System.out.println(bookService);
        System.out.println(bookService2);
        System.out.println(bookDao1);
        System.out.println(bookDao2);
    }
}
