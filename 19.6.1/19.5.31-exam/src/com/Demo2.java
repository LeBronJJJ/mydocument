package com;

public class Demo2 extends Thread{
    public static void main(String[] args){
        Thread t = new Thread(){
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.println("ping");

    }

    private static void pong() {
        System.out.println("pong");
    }

}
