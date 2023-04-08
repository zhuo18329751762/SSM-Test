package com.yangzhuo;

import com.yangzhuo.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.awt.print.Book;


public class AppForLifeCycle {
    public static void main(String[] args) {
        // 1 加载类路径下的配置文件
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        //绝对路径获取ctx 不推荐使用
        //ApplicationContext ctx2=new FileSystemXmlApplicationContext("D:\\SSM-Test\\Spring-08-container\\src\\main\\resources\\applicationContext.xml");
        //BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        //BookDao bookDao =  ctx.getBean("bookDao",BookDao.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();
    }
}
