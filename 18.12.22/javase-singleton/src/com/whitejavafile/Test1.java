package com.whitejavafile;
//所谓的单例设计指的是一个类只允许产生一个实例化对象。
class Singleton{
    public void print(){
        System.out.println("HelloWorld");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Singleton singleton = null;     //声明对象
        singleton = new Singleton();
        singleton.print();
    }
}
