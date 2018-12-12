package com.whitejavafile;
//字符串比较
public class Test7 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));              //区分大小写的比较
        System.out.println(str1.equalsIgnoreCase(str2));    //不区分大小写的比较
        //在String类中compareTo()方法是一个非常重要的方法，该方法返回一个整型，
        //该数据会根据大小关系返回三类内容：
        // 1. 相等：返回0.
        // 2. 小于：返回内容小于0.
        // 3. 大于：返回内容大于0。
        System.out.println("A".compareTo("a")); // -32
        System.out.println("a".compareTo("A")); // 32
        System.out.println("A".compareTo("A")); // 0
        System.out.println("AB".compareTo("AC")); // -1
        System.out.println("刘".compareTo("杨"));
    }
}
