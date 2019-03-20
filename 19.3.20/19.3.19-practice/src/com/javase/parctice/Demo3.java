package com.javase.parctice;

public class Demo3 {
    public static void main(String[] args) {
        Demo3 demo3 = new Demo3();
        System.out.println(demo3);
        Person1 p1 = new Person1("张瑞瓜皮",21);
        System.out.println(p1.toString());
    }

    @Override
    public String toString() {
        return "Obj testing!";
    }
}

class Person1{
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
