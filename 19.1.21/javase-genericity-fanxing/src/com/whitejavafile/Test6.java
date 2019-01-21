package com.whitejavafile;

class Message<T>{
    private T message;

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}

public class Test6 {
    public static void main(String[] args) {
        Message<String> message = new Message();
        message.setMessage("java不错哦");
        fun(message);
    }
    public static void fun(Message<?> temp){
        //?：通配符
        //只可接收  无法修改
        //temp.setMessage(100);
        System.out.println(temp.getMessage());
    }
}
