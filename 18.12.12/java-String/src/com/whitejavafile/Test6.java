package com.whitejavafile;
//字节就是一个字符的二进制表达形式
public class Test6 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        //将字符串转为字节数组
        byte[] data = str.getBytes();
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        //把字节数组转换为字符串
        System.out.println(new String (data));
    }
}
