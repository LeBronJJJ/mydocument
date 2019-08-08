package com.revision.Thread;
//利用匿名内部类实现多线程的启动
public class MyThread2 {

    public static void main(String[] args) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i = 0;i <= 10;i++){
                        System.out.println(i);
                    }
                }
            }).start();
    }
}
