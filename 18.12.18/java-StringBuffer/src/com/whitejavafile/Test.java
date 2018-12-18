package com.whitejavafile;

public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World");
        fun(sb);
        fun2(sb);
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer("HelloWorld");
        System.out.println(sb1.delete(5,10).insert(0,"你好"));

    }
    public static void fun(StringBuffer temp){
        temp.append("\n").append("www.baidu.com");
    }
    public static void fun2(StringBuffer temp){
        temp.reverse();
    }
}
