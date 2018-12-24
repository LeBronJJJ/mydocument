package com.whitejavafile;

//饿汉式单例模式
//不管你是否使用Singleton类的对象，
// 只要该类加载了，那么一定会自动创 建好一个公共的instance对象。
// 既然是饿汉式，就希望整体的操作之中只能够有一个实例化对象，
// 所以一般还会在 前面追加一个final关键字

class Singleton4{
    private static final Singleton4 INSTANCE = new Singleton4();
    private Singleton4(){}
    public static Singleton4 getInstance(){
        return INSTANCE;
    }
    public void print(){
        System.out.println("shit");
    }
}

public class Test4 {
    public static void main(String[] args) {
        Singleton4 singleton4= null;
        singleton4 = Singleton4.getInstance();
        singleton4.print();
    }
}
