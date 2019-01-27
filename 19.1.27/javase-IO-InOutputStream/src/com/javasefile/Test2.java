package com.javasefile;
//实现AutoCloseable接口
//必须结合try  catch  才能使用
class Message implements AutoCloseable{

    @Override
    public void close() {
        System.out.println("[AutoCloseable]自动关闭方法");
    }
    public Message(){
        System.out.println("创建一条新消息");
    }
    public void print(){
        System.out.println("666");
    }
}
public class Test2 {
    public static void main(String[] args) {
        try(Message message = new Message()){     //必须在try中定义对象
            message.print();
        }catch(Exception e){
        }
    }
}
