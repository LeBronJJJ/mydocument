package com.revision.Thread;

class TestFlagStop implements Runnable {

    private boolean flag = true;

    @Override
    public void run() {
        int i = 1;
        while (flag) {
            try {
                Thread.sleep(1000);
                System.out.println("第" + i + "次执行程序，线程名为" + Thread.currentThread().getName());
                i++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

public class FlagStop {

    public static void main(String[] args) throws InterruptedException {
        TestFlagStop tfs = new TestFlagStop();
        Thread thread = new Thread(tfs,"子线程A");
        thread.start();
        Thread.sleep(2000);
        tfs.setFlag(false);
        System.out.println("代码结束！");
    }

}
