package com.revision.Thread;
//使用Thread类对售票进行模拟
public class SellTickets implements Runnable{
    private int ticketnum = 10; //十张票

    @Override
    public void run() {
        while(this.ticketnum >= 1){
            System.out.println("剩余票数："+ ticketnum--);
        }
    }

    public static void main(String[] args) {
        SellTickets st = new SellTickets();

        new Thread(st).start();
        new Thread(st).start();

    }
}
