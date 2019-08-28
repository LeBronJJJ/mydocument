package com.revision.Thread;

import java.io.PrintStream;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Goods{
    private int maxGoodsNum;
    private Lock lock = new ReentrantLock();
    private int currentNum;

    private Condition producerQueue = lock.newCondition();
    private Condition consumerQueue = lock.newCondition();

    public Goods(int maxGoodsNum) {
        this.maxGoodsNum = maxGoodsNum;
    }

    public void produceGoods(){
        try {
            lock.lock();
            while(this.currentNum == maxGoodsNum){
                producerQueue.await();
            }
            System.out.println("...");
            currentNum++;
            //唤醒消费者线程
            consumerQueue.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}

public class MultiThreadPC {
}
