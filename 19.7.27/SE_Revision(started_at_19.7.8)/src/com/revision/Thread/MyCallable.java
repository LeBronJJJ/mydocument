package com.revision.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable {

    private int tickets = 10;

    @Override
    public Object call() throws Exception {
        while(this.tickets >= 0){
            System.out.println("剩余票数：" + tickets--);
        }
        return "票卖完了！";
    }

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        FutureTask<String> task = new FutureTask<>(new MyCallable());
        new Thread(task).start();
        new Thread(task).start();
        System.out.println(task.get());

    }
}
