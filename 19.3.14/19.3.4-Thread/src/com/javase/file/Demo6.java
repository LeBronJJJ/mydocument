package com.javase.file;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread4 implements Callable<String> {

    private int ticket = 10;

    @Override
    public String call() throws Exception {
        while(this.ticket > 0){
            System.out.println("剩余票数:" + this.ticket--);
        }
        return "票卖完了！";
    }
}

public class Demo6 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask <String> task = new FutureTask<>(new MyThread4());
        new Thread(task).start();
        new Thread(task).start();
        System.out.println(task.get());
    }
}
