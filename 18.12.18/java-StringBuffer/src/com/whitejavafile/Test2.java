package com.whitejavafile;

class Person1 {
    private String name;
    private int age;

    public Person1(String name,int age) {
        this.age = age;
        this.name = name;
    }
}

class Student1 {}

public class Test2 {
    public static void main(String[] args) {
        fun(new Person1("LeBron",20));
        fun("Hello");
    }

    public static void fun(Object obj) {
        System.out.println(obj.toString()); // 默认输出
    }
}