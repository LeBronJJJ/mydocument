package com.javasefile;


interface IMessage{
    public default void fun(){
        //  追加了default普通方法
        System.out.println("hello IMessage!");
    }
    public void print();
}

class MessageImpl implements IMessage{
    @Override
    public void print() {
        System.out.println("hello MessageImpl");
    }
}

public class Test0 {
    public static void main(String[] args) {
        IMessage iMessage = new MessageImpl();
        iMessage.print();
        iMessage.fun();
    }
}
