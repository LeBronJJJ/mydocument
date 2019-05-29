package com.javase.file;
/*
*
* 模拟龟兔赛跑
* 1.创建 多线程  继承Thread类  + 重写 run(线程体)
* 2.使用线程   创建子类对象 + 调用对象.start方法  线程启动
* */
public class Rabbit extends Thread {
    @Override
    public void run() {
        for(int i = 0; i<100;i++){
            System.out.println("兔子跑了" + i + "步");
        }
    }
}
class Tortoise extends Thread {
    @Override
    public void run() {
        for(int i = 0; i<100;i++){
            System.out.println("乌龟跑了" + i + "步");
        }
    }
}
