package com.jzheng.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.jzheng.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("-------------> before [Anno type]");
    }

    @After("execution(* com.jzheng.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("-------------> after [Anno type]");
    }

    @Around("execution(* com.jzheng.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("-------------> around before [Anno type]");
        System.out.println("Signature: " + proceedingJoinPoint.getSignature());
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("-------------> around after [Anno type]");
    }
}
