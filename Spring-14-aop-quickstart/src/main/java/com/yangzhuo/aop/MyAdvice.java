package com.yangzhuo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    /*
    *表示单个的任意符号，可以单独出现，也可以作为前缀或者后缀的匹配符出现
    * .. 对个连续的符号，可以独立出现，常用于简化包名与参数的书写
    * + 专用于匹配子类类型
     */
   //@Pointcut("execution(void com.yangzhuo.dao.BookDao.update())")
   //@Pointcut("execution(void com.yangzhuo.dao.impl.BookDaoImpl.update())")
   //@Pointcut("execution(* com.yangzhuo.dao.impl.BookDaoImpl.update())")
   @Pointcut("execution(* com.yangzhuo.*.*Service.find*(..))")
    private void pt(){
   }
    @Before("pt()")
    public void method(){
        System.out.println(System.currentTimeMillis());
    }
}
