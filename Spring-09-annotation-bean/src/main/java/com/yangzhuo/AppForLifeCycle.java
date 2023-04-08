package com.yangzhuo;

import com.yangzhuo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppForLifeCycle {
    //注解开发定义bean
    public static void main(String[] args) {
        // 1 加载类路径下的配置文件
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
    }
}
