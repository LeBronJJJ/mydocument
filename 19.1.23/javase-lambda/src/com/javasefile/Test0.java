package com.javasefile;

interface IMessage{
    public void print();
}

public class Test0 {
    public static void main(String[] args) {
        IMessage iMessage = new IMessage() {
            @Override
            public void print() {
                System.out.println("old style");
            }
        };
            iMessage.print();
    }
}
