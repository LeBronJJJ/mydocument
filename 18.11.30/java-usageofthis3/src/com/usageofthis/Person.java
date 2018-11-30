package com.usageofthis;

public class Person {
    public void print(){

        System.out.println("[PRINT]方法:" + this);   //这里的this表示当前对象
        //只要对象调用了本类中的方法，这个this就表示当前执行的对象
    }
}
