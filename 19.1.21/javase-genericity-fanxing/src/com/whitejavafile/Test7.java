package com.whitejavafile;

class Message1<T extends Number>{
    //表明 上限 是Number
    private T msg;

    public T getMsg() {
        return msg;
    }

    public void setMsg(T msg) {
        this.msg = msg;
    }
}

public class Test7 {
    public static void main(String[] args) {
        Message1 <Integer> message1 = new Message1<>();
        message1.setMsg(111);
        fun(message1);

    }
    public static void fun(Message1<?> temp){
        //此时不能msg修改的内容
        System.out.println(temp.getMsg());
    }
}
