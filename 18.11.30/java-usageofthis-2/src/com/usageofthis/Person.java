package com.usageofthis;

public class Person {
    private String name;
    private int age;

    public Person(){
        System.out.println("***1产生一个新的person对象***");
    }
    public Person(String name){
        this();                     //调用本类无参构造方法 必须放在构造方法首行
        System.out.println("***2产生一个新的person对象***");
        this.name = name;
    }
    public Person (String name,int age){
        this(name);                 //调用本类有参构造方法
        System.out.println("***3产生一个新的person对象***");
        this.name = name;
        this.age = age;
    }
    public String getPeronInfo(){
        return "姓名："+ name + " 年龄：" + age;
    }
}
