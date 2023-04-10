package com.yangzhuo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    /*
    *表示单个的任意符号，可以单独出现，也可以作为前缀或者后缀的匹配符出现
    * .. 对个连续的符号，可以独立出现，常用于简化包名与参数的书写
    * + 专用于匹配子类类型
     */
   //@Pointcut("execution(void com.yangzhuo.dao.impl.BookDaoImpl.update())")
   //@Pointcut("execution(* com.yangzhuo.*.*Service.find*(..))")
    //@Pointcut("execution(* com.yangzhuo.dao.impl.BookDaoImpl.update())")
    @Pointcut("execution(void com.yangzhuo.dao.BookDao.update())")
    private void pt(){}
    //@Before("pt()")
    /* public void method(){
        System.out.println(System.currentTimeMillis());
    }
    */


    @Pointcut("execution(int com.yangzhuo.dao.BookDao.select())")
    private void pt1(){}

    //@Before("pt()")
    public void before(){
        System.out.println("before advice ...");
    }
    ///@After("pt()")
    public void after(){
        System.out.println("after advice ...");
    }

    //@Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice");
        //表示对原始操作的调用
        pjp.proceed();
        System.out.println("around after advice");
    }

    //@Around("pt1()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice");
        //表示对原始操作的调用
        Object o = pjp.proceed();
        System.out.println("around after advice");
        return o;
    }

    //原始方法运行完成后执行的方法
    //@AfterReturning("pt1()")
    public void afterReturning(){
        System.out.println("afterReturning advice ...");
    }

    //抛出异常时运行
    @AfterThrowing("pt1()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }

}
