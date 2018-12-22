package com.whitejavafile;
//将基本数据类型转为字符串
public class Test2 {
    public static void main(String[] args) {
        String str = String.valueOf(100);
        System.out.println(str);

        //1. 任何数据类型使用了"+"连接空白字符串就变为了字符串类型。
        //2. 使用String类中提供的valueOf()方法，此方法不产生垃圾。
    }
}
