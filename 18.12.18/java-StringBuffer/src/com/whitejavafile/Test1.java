package com.whitejavafile;

class Person{}

class Student{}

public class Test1 {
    public static void main(String[] args) {
        fun(new Person());
        fun(new Student());
    }

public static void fun(Object obj){
    System.out.println(obj);
}
}
