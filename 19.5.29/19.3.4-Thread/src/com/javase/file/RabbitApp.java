package com.javase.file;

public class RabbitApp {

    public static void main(String[] args) {
        //创建子类对象
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();
        //调用start方法
        rabbit.start();//不要调用run方法
        tortoise.start();

        for(int i = 0; i < 100; i++){
            System.out.println("main ==>" + i  );
        }
    }
}
