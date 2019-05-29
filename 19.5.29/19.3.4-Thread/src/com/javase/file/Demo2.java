package com.javase.file;

import java.security.spec.MGF1ParameterSpec;

/**
 * 利用runnable接口实现线程主体类
 */
class MyThread1 implements Runnable{
    private String title;
    public MyThread1(String title){
        this.title = title;
    }
    @Override
    public void run() {
        for(int i = 0;i < 10;i++){
            System.out.println(this.title + " " + i);
        }
    }
}

public class Demo2 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1("title");
        MyThread1 myThread2 = new MyThread1("666");
        MyThread1 myThread3 = new MyThread1("886");
        //when use runnable;
        //need to use new Thread() to start a thread.
        new Thread(myThread1).start();
        new Thread(myThread2).start();
        new Thread(myThread3).start();
    }
}
