package com.javase.parctice;

//测试instanceof的用法

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("搭噶好!");
    }
}

class Student extends Person{
    String favor;
    String job;

    public Student(String name, int age, String favor, String job) {
        super(name, age);
        this.favor = favor;
        this.job = job;
    }
    void print(){
        System.out.println("姓名:" + this.name + "\n年龄:" + this.age +"\n爱好:" + this.favor
        + "\n工作:" + this.job);
    }
}


public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student("张瑞",21,"敲代码","鸭子");
        student.printInfo();
        student.print();
        System.out.println(student instanceof Person);
        System.out.println(student instanceof Student);
        System.out.println(student instanceof Object);
        System.out.println(new Person("1",2) instanceof Student);
    }
}
