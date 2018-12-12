package com.whitejavafile;

public class Test4 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        //将字符串改为字符数组
        char[] data = str.toCharArray();
        for(int i = 0;i < data.length; i++){
            System.out.print(data[i] + ",");
        }
        System.out.println("\n");
        //字符数组转化为字符串
        System.out.println(new String(data));       //全部转化为字符串
        System.out.println(new String(data,5,1));
        //offset:偏移量 //count:偏移之后的第几个元素
    }
}
