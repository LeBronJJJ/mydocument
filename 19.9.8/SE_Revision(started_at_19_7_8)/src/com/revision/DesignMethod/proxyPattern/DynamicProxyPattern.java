package com.revision.DesignMethod.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理的使用
interface Subject{
    void action();
}
//被代理类
class RealSubject implements Subject{
    @Override
    public void action() {
        System.out.println("被代理类!");
    }
}

//代理类
class MyInvocationHandler implements InvocationHandler {

    Object obj;
    //给被代理对象进行实例化，返回一个代理类的对象
    public Object blind(Object obj){
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method,Object[] args)throws Throwable {
        Object returnVal = method.invoke(obj,args);
        return returnVal;
    }
}

public class DynamicProxyPattern {
    public static void main(String[] args) {
        RealSubject real = new RealSubject();
        MyInvocationHandler handler = new MyInvocationHandler();
        Object obj = handler.blind(real);
        Subject sub = (Subject)obj;
        sub.action();
    }
}
