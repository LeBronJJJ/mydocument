package com.javase.polymorphism.servlet;

public class HttpServlet {

    public void service(){
        System.out.println("HttpServlet.service");
        doGet();        //这里的doGet就相当于   this.doGet();  调用当前对象  所以就执行了MyServlet的doGet();
    }

    public void doGet(){
        System.out.println("HttpServlet.doGet");
    }
}
