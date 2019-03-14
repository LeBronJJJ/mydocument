package com.javase.file;

class Mythread extends Thread{
    private String title;
    public Mythread(String title){
        this.title = title;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println(this.title + ",i" + i);
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Mythread mythread = new Mythread("okay");
        //run() is not multithreading;
        mythread.run();
        //start() is multithreading;
        //we should use start() to call run();
        mythread.start();
    }
}
