package com.liang.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LogBefore implements MethodBeforeAdvice {

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知。。。");
    }
}
