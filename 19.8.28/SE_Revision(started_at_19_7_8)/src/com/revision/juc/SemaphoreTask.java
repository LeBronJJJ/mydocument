package com.revision.juc;

import java.util.concurrent.Semaphore;

public class SemaphoreTask implements Runnable {

    private Semaphore semaphore;

    public SemaphoreTask(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + "占用一台设备生产");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "生产完毕，释放设备");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
