package com.javase.file;

public class Demo3 {
    public static void main(String[] args) {
        //anonymous(匿名内部类)to make a object by runnable;
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("666");
            }
        }).start();
        */
        //lambda to make a object by runnable;
        Runnable runnable = () -> System.out.println("6660");
        new Thread(runnable).start();

    }
}
