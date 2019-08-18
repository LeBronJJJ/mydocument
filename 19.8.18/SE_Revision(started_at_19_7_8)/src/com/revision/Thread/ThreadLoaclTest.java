package com.revision.Thread;

public class ThreadLoaclTest {
    private static String commstr;
    private static ThreadLocal<String>threadLocal;

    public static void main(String[] args) throws InterruptedException {
        commstr = "main";
        threadLocal.set("main");

        Thread thread = new Thread(()->{
           commstr = "Thread";
           threadLocal.set("thread");
        });
        thread.start();
        Thread.sleep(1000);
        System.out.println(commstr);
        System.out.println(threadLocal.get());

    }

}
