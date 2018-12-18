package com.whitejavafile;

class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "name:" + this.name + "age:" + this.age;
        //对toString进行了覆写
        //达成自定义的输出方式
        // String作为信息输出的重要数据类型，
        // 在Java中所有的数据类型只要遇见了String并且执行了 + ,
        // 那么都要求将其变 为字符串后连接，
        // 而所有对象要想变为字符串就默认使用 toString() 方法。
    }
}

class Student{}

public class Test {
    public static void main(String[] args) {
        fun(new Person("LeBron",20));
        fun("Hello");
    }
    public static void fun(Object obj){
        System.out.println(obj.toString());
    }
}
