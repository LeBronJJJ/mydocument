package com.test;

public class Person {
    private String name;
    private int age;
    public Person(String n,int i){   //若类中定义了构造方法
        //则默认的无参构造方法将不再生成
        name = n;
        setAge(i);
    }
    public void setName(String n){    //无参构造方法
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int i){
        if (i > 0 && i <= 200){
            age = i;
        }else{
            age = 0;
        }
    }
    public int getAge(){
        return age;
    }
    public void getPersonInfo(){
        System.out.println("姓名:" + name + " 年龄:" + age);
    }

}















