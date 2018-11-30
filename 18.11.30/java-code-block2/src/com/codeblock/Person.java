package com.codeblock;

public class Person {
    {       //  构造块
            System.out.println("1.Person类的构造块");
    }
    public Person(){
            System.out.println("2.Person类的构造方法");
    }
    static {            //定义在非主类的静态块
            System.out.println("3.Person类的静态块");
    }
}
