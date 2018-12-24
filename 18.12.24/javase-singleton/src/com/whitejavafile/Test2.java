package com.whitejavafile;

class  Singleton2{
    static Singleton2 instance = new Singleton2();
    private Singleton2(){}      //private 声明构造
    public void print(){
        System.out.println("Hello World!");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Singleton2 singleton2;
        singleton2 = Singleton2.instance;
        singleton2.print();
    }
}
