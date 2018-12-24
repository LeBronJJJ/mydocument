package com.whitejavafile;
//所谓的单例设计指的是一个类只允许产生一个实例化对象。
class Singleton{
    public void print(){
        System.out.println("HelloWorld");
    }
}

class Singleton1{
    //在这个类的内部进行实例化  可以访问私有构造方法
    private static Singleton1 singleton1=new Singleton1();
    private Singleton1(){
        System.out.println("Hello world!");
    }
    public static class Si{
        public static Singleton1 getInstance(){
            return singleton1;
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        Singleton1 singleton = Singleton1.Si.getInstance();
        System.out.println(singleton);
        Singleton1 singleton1=Singleton1.Si.getInstance();
        System.out.println(singleton1);

    }
}
