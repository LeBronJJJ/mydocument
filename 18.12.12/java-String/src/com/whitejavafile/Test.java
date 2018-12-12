package com.whitejavafile;

//面试题：请解释String类 == 与 equals 的区别
//1. ”==”：进行的数值比较，比较的是两个字符串对象的内存地址数值。
// 2.“equals（）”：可以进行字符串内容的比较


public class Test {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(str1 == str2);       //false  ==本身是对数值进行比较如果用于
        // 对象比较  那么比较的就是两个对象所保存的  内存地址数值  比较

        //equals方法可以进行字符串内容的比较
        System.out.println(str1.equals(str2));  //true

    }
}
