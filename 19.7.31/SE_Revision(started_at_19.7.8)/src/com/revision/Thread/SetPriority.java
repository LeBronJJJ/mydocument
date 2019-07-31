package com.revision.Thread;


class TestSetPriority implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i < 5; i++){
            System.out.println("当前线程：" + Thread.currentThread().getName() + " i = "+ i);
        }
    }
}

public class SetPriority {
    public static void main(String[] args) {
        TestSetPriority tsp = new TestSetPriority();
        Thread t1 = new Thread(tsp,"子线程A");
        Thread t2 = new Thread(tsp,"子线程B");
        Thread t3 = new Thread(tsp,"子线程C");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
