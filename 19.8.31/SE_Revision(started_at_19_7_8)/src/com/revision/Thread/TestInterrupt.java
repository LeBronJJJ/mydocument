package com.revision.Thread;

class TestThread implements Runnable{

    private boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while(flag){
            try {
                Thread.sleep(1000);
                boolean bool = Thread.currentThread().isInterrupted();
                if(bool){
                    System.out.println("非阻塞情况下执行该操作：  线程状态" + bool);
                    break;
                }

                System.out.println("第" + i + "次执行，线程名称" + Thread.currentThread().getName());
                i++;
            } catch (InterruptedException e) {
                System.out.println("退出了");
                boolean bool = Thread.currentThread().isInterrupted();
                System.out.println(bool);
                return;
            }
        }
    }
    public void setFlag(boolean flag){
        this.flag = flag;
    }
}

public class TestInterrupt {

    public static void main(String[] args) throws InterruptedException {
        TestThread tt = new TestThread();
        Thread t1 = new Thread(tt,"子线程A");
        t1.start();
        Thread.sleep(10000);
        t1.interrupt();
        System.out.println("代码结束！");
    }

}
