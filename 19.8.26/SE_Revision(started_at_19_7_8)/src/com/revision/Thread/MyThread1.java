package com.revision.Thread;

public class MyThread1 implements Runnable {

    private String title;

    public MyThread1(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        //所有线程都从这里开始
        for(int i = 0;i <= 10;i++){
            System.out.println(this.title + ", i = " + i);
        }
    }

    public static void main(String[] args) {

        MyThread1 mt1 = new MyThread1("byl1");
        MyThread1 mt2 = new MyThread1("byl2");

        new Thread(mt1).start();
        new Thread(mt2).start();
    }
}
