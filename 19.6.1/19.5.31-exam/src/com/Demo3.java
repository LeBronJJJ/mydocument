package com;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo3 {
        String str = new String("good");
        char ch[] = {'a','b','c'};

    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
        d3.change(d3.str,d3.ch);
        System.out.println(d3.str + " " + Arrays.toString(d3.ch));
    }

    private void change(String str,char ch[]) {
        str = "hello world";
        ch[0] = 'g';
    }
}
