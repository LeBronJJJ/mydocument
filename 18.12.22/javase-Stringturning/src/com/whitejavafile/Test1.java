package com.whitejavafile;

public class Test1 {
    public static void main(String[] args) {
        //将字符串变为int型
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);        //123

        //字符串转化为 double
        String str1 = "123";
        double num1 = Double.parseDouble(str1);
        System.out.println(num1);       //123.0

        //需要注意的是，将字符串转为数字的时候，
        // 字符串的组成有非数字，那么转换就会出现错误
        // （NumberFormatException），以后就因为这个异常，
        // 我们要写一堆程序来回避。

        /*String str2 = "123aaa";
        double num2 = Double.parseDouble(str2);
        System.out.println(num2);   //NumberFormatException*/

        //而字符串与boolean之间转换就没有影响

        String str3 = "false";
        boolean num3 = Boolean.parseBoolean(str3);  //字符串是true  转换就可以是true  其他全是
        //false
        System.out.println(num3);       //false
    }
}
