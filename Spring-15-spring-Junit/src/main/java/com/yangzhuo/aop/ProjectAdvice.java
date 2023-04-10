package com.yangzhuo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ProjectAdvice {
    //匹配业务层的所有方法
    @Pointcut("execution(* com.yangzhuo.service.*Service.*(..))")
    private void servicePt(){}

    @Around("ProjectAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        signature.getDeclaringType();
        Class declaringType = signature.getDeclaringType();
        String name = signature.getName();
        long start = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
             pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println("万次执行"+declaringType+"."+name+"方法时间:"+(end-start)+"ms");
    }
}
