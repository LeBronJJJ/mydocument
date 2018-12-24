package com.whitejavafile;

//懒汉式单例模式
//当第一次去使用Singleton对象的时候才会为其产生实例化对象的操作

class Singleton5{
    private static Singleton5 instance;
    private Singleton5(){}
    public static Singleton5 getInstance(){
        if(instance == null){
            return new Singleton5();
        }
        return instance;
    }
    public void print(){
        System.out.println("killer!");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Singleton5 singleton5 = null;
        singleton5 = Singleton5.getInstance();
        singleton5.print();
    }
}
