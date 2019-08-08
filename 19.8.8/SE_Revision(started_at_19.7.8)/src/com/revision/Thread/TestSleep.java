package com.revision.Thread;

public class TestSleep implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i <= 10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("当前线程：" + Thread.currentThread().getName() + " i = " + i);
        }
    }

    public static void main(String[] args) {
        TestSleep ts = new TestSleep();
        new Thread(ts).start();
        new Thread(ts).start();
        new Thread(ts).start();
    }

}
