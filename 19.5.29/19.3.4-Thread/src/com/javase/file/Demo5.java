package com.javase.file;
//用Runnable实现数据共享
class MyThread3 implements Runnable{

    private int ticket = 10;

    @Override
    public void run() {
        while(this.ticket > 0){
            System.out.println("剩余票数:"+ this.ticket--);
        }
    }
}
public class Demo5 {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        new Thread(myThread3).start();
        new Thread(myThread3).start();
        new Thread(myThread3).start();
    }
}
