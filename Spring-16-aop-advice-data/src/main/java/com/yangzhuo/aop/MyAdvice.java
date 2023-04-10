package com.yangzhuo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//aop获取数据

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.yangzhuo.dao.BookDao.findName(..))")
    private void pt(){}

    //@Before("pt()")
    public void before(JoinPoint jp){
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }
    //@After("pt()")
    public void after(){
        System.out.println("after advice ...");
    }

    //@Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("around before advice");
        //表示对原始操作的调用
        //可以对arg中的数据进行操作
        pjp.proceed(args);
        System.out.println("around after advice");
    }
    //原始方法运行完成后执行的方法
    @AfterReturning(value = "pt()",returning = "ret")
    public void afterReturning(Object ret){
        System.out.println("afterReturning advice ..."+ret);
    }

    //抛出异常时运行
    //@AfterThrowing("pt()")
    public void afterThrowing(){
        System.out.println("afterThrowing advice ...");
    }

}
