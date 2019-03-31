package com.javase.hook;

public class Test {
    public static void main(String[] args) {
        IMyFrame iMyFrame = new Demo();
        iMyFrame.paint();
    }
}

class Demo implements IMyFrame{
    @Override
    public void paint() {
        System.out.println("lalala Demasia!!!");
    }
}
