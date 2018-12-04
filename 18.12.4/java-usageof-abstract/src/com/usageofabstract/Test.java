package com.usageofabstract;

abstract class Person {
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public abstract void getPersonInfo();
    //抽象类中包含有抽象方法，而抽象方法不包含方法体，即没有具体实现。
    // 因此抽象类不能直接产生实例化对象。

}

class Student extends Person{
    public Student(){       //构造方法
        System.out.println("*****************");
    }
    public void getPersonInfo(){        //空实现

    }
}

public class Test{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张瑞");
        System.out.println(student.getName());

    }
}
