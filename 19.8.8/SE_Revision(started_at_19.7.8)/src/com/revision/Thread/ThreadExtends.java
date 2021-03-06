package com.revision.Thread;

class A implements  Runnable{
    @Override
    public void run() {
        System.out.println("A的优先级为:" + Thread.currentThread().getPriority());
        Thread thread = new Thread(new B());
        thread.start();
    }
}

class B implements Runnable{
    @Override
    public void run() {
        System.out.println("B的优先级为:" + Thread.currentThread().getPriority());
    }
}

public class ThreadExtends {
    public static void main(String[] args) {
        Thread thread = new Thread(new A());
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }
}
