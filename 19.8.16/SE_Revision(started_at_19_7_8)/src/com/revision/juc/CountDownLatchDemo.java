package com.revision.juc;

public class CountDownLatchDemo {
    private int countDownLatchNum;
    public static void main(String[] args) {
        CountDownLatchDemo countDownLatchDemo = new CountDownLatchDemo(4);
        CDLTask cdlTask = new CDLTask();
        System.out.println("比赛开始：");
        new Thread(cdlTask,"运动员A");
        new Thread(cdlTask,"运动员B");
        new Thread(cdlTask,"运动员C");
        System.out.println("比赛结束");
    }

    public CountDownLatchDemo(int countDownLatchNum) {
        this.countDownLatchNum = countDownLatchNum;
    }
}
