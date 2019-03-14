package com.javasefile;

/**
 * 位运算符
 * @author white
 */
public class Test {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a & b);  //0
        System.out.println(a | b);  //7
        System.out.println(a ^ b);  //7
        System.out.println(~a);     //-4取反之后加负号
        //移位运算
        int c = 3 << 1;
        System.out.println(c);
        //左移变大 乘以2
        System.out.println(12>>2);
        //右移变小 除以4
    }
}
