package com.javasefile;

@FunctionalInterface
interface IMessage2{
    public void print();
}

public class Test2 {
    public static void main(String[] args) {
        IMessage2 iMessage2 = () -> {       //匿名内部类
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
        };
        iMessage2.print();
    }
}
