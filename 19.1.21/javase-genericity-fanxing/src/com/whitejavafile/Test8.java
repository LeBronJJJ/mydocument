package com.whitejavafile;

class Message2<T>{
    private T msg;

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}

public class Test8 {
    public static void main(String[] args) {
        Message2 <String> message2 = new Message2();
        message2.setMsg("abc");
        fun2(message2);
    }
    public static void fun2(Message2<? super String> temp) {
        //设置下限可以更改内容
        temp.setMsg("bit");
        System.out.println(temp.getMsg());
    }
}
