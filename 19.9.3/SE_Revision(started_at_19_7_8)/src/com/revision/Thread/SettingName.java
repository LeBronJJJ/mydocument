package com.revision.Thread;

public class SettingName implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i <= 10; i++){
            //通过获取当前线程来获取线程名
            System.out.println("当前线程为:" + Thread.currentThread().getName()
            + "   i = " + i);
        }
    }

    public static void main(String[] args) {
        SettingName sn = new SettingName();
        //未创建名字的线程则会默认叫做Thread-1,Thread-0
        new Thread(sn).start();
        new Thread(sn).start();
        //为该线程创建名字
        new Thread(sn,"name").start();
    }

}
