package com.javase.file;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    String str = new String("hello");
    char[] ch = {'a','b'};

    public static void main(String[] args) {
        Test t = new Test();
        t.change(t.str,t.ch);
        System.out.println(t.str + " and " + Arrays.toString(t.ch));
    }

    private void change(String  str,char[] ch) {
        str = "test ok!";
        ch[0] = 'c';
    }

}
