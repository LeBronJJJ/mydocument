package com.javasefile;

@FunctionalInterface
interface IMessage1{

    public void print();
}

public class Test1 {
    public static void main(String[] args) {
        IMessage1 iMessage1 = () -> System.out.println("hello world!");
        iMessage1.print();
    }
}
