package com.revision.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallableTask implements Callable{
    private int tickts = 20;
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "还剩" + tickts-- + "票");
        }
        return "票已卖完";
    }
}
public class FutureTaskDemo {
    public static void main(String[] args) {
        CallableTask callableTask = new CallableTask();
        FutureTask<String> futureTask = new FutureTask<String>(callableTask);
        new Thread(futureTask,"1");
        new Thread(futureTask,"2");
        new Thread(futureTask,"3");

    }
}
