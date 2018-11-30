package com.codeblock;

public class Test {
    public static void main(String[] args) {
        System.out.println("Start");
        new Person();
        new Person();
        System.out.println("END");
    }
}

//1. 静态块优先于构造块执行。
//2. 无论产生多少实例化对象，静态块都只执行一次。
//结果；静态块最优先执行，但只执行一次，然后是构造块优先于构造方法
//静态块的主要作用是为static属性进行初始化