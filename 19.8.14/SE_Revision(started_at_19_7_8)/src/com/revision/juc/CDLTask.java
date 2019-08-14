package com.revision.juc;

import java.util.concurrent.TimeUnit;

//运动员线程
public class CDLTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始跑步！");
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName() + "到达终点！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
