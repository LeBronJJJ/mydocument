package com.javase.hook;

public class TestInnerClass {
    public static void main(String[] args) {
       new Thread(() -> System.out.println("666")).start();    }
}
 class Test1{

    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Test1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
