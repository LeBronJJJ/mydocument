package com.javase.file;
//用thread实现数据共享
class MyThread2 extends Thread{
    private int ticket = 10;

    @Override
    public void run() {
        while(this.ticket > 0){
            System.out.println("剩余票数:" + this.ticket--);
        }
    }
}
public class Demo4 {
    public static void main(String[] args) {
        /*MyThread2 myThread2 = new MyThread2();
        myThread2.start();*/
        new MyThread2().start();
        new MyThread2().start();
        new MyThread2().start();
    }
}
