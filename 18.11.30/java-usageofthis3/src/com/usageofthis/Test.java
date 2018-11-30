package com.usageofthis;

public class Test {
    public static void main(String[] args) {
        Person per1 = new Person();
        System.out.println("[MAIN]方法:" + per1);
        per1.print();
        System.out.println("====================");
        Person per2 = new Person();
        System.out.println("[MAIN]方法:" + per2);
        per2.print();
    }
}
