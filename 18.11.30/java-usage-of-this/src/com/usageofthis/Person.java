package com.usageofthis;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;           //当参数与类中属性同名时，类中属性无法被正确赋值
        this.age = age;             //此时我们加上this关键字便可以正 确给对象属性赋值
        this.print();               //this调用普通方法
    }
    public String getPersonInfo(){
        return "姓名:" + name + " 年龄:" + age;
    }
    public void print(){
        System.out.println("*************************");
    }
}
