package com.whitejavafile;

interface IMessage <T> {
    public void print(T t);
}

class MessageIml<T> implements IMessage<T>{

    @Override
    public void print(T t) {
        System.out.println(t);
    }
}

public class Test9 {
    public static void main(String[] args) {
        IMessage<Number> msg = new MessageIml<>();
        msg.print(123.3333333);
    }
}
