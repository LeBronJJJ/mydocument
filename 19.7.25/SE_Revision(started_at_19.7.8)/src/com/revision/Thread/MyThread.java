package com.revision.Thread;

public class MyThread extends Thread {
    private String title;

    public MyThread(String title) {
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
        MyThread mt1 = new MyThread("byl1");
        MyThread mt2 = new MyThread("byl2");
        MyThread mt3 = new MyThread("byl3");
        MyThread mt4 = new MyThread("byl4");
        /*mt1.run();
        mt2.run();
        mt3.run();
        mt4.run();*/
        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
    }
}
