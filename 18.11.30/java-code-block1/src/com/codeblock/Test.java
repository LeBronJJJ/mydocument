package com.codeblock;

public class Test {
    public static void main(String[] args) {

        {                                                   //普通代码块
            int x = 10;
            System.out.println("x = " + x);
        }

        int x = 100;
        System.out.println("x = " + x);
        Person per1 = new Person();
        Person per2 = new Person();
    }

}

