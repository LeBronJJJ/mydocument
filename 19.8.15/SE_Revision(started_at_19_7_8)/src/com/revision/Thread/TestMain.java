package com.revision.Thread;

public class TestMain implements Runnable {
    @Override
    public void run() {
        System.out.println("当前线程：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        TestMain tm = new TestMain();
        //这里tm的线程名叫做main
        tm.run();
        new Thread(tm).start();
    }

}
