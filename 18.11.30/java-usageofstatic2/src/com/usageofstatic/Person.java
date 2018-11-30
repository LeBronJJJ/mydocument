package com.usageofstatic;


        //使用static定义方法只有一个目的：
        // 某些方法不希望受到对象的控制，即可以在没有实例化对象的时候执行（广泛 存在于工具类中）。
    public class Person {
    private static String country;
    private String name;

    private int age;
    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void setCountry(String c){
        country = c;
    }
    public void getPersonInfo (){
        System.out.println("姓名:" + this.name + " 年龄:" + this.age + " 国籍:"
        + this.country);
    }
}
