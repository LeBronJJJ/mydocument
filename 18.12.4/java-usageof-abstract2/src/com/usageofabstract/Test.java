package com.usageofabstract;

abstract class A{
    public A(){
    this.print();
    }
    public abstract void print();
}

class B extends A{
    private int num = 100;
    public B(int num){
        //super();            //这里的super写或不写都不会有影响
        this.num = num;        //因为进入B传参时都会先调用父类构造
        this.print();
    }
    public void print(){
        System.out.println(this.num);
    }
}

public class Test {
    public static void main(String[] args) {
        new B(30);
    }
}
