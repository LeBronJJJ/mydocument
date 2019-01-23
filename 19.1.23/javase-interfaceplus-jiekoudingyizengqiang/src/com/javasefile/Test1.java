package com.javasefile;

interface IMessage1{
    public default void fun(){
        System.out.println("IMessage");
    }
    public static IMessage1 getInstance(){
        return new MessageImpl1();
    }
    public void print();
}

class MessageImpl1 implements IMessage1{

    @Override
    public void print() {
        System.out.println("MessageImpl1");
    }
}

public class Test1 {
    public static void main(String[] args) {
        IMessage1 iMessage1 = IMessage1.getInstance();
        iMessage1.fun();
        iMessage1.print();
    }
}
