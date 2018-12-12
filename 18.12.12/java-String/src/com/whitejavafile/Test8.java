package com.whitejavafile;

public class Test8 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        //contains()可以查找字符串内容  很方便   :JDK  1.5后才有这个方法
        System.out.println(str.contains("World"));      //字符串中有World  所以返回true
        //JDK：1.5之前  使用indexOf()来完成查找
        //使用indexOf()需要注意的是，如果内容重复，它只能返回查找的第一个位置
        System.out.println(str.indexOf("World"));         //5
        System.out.println(str.indexOf("He")  + " " +  str.indexOf("e"));   // 0   1
        System.out.println(str.indexOf("shit"));            //-1  没有的话就返回-1

        System.out.println(str.indexOf("l",3)); // 3 从指定位置开始查找
        System.out.println(str.lastIndexOf("l"));         // 8 从指定位置开始倒叙查找

        //判断开头或者结尾
        //很多时候一些参数利用标记做一些处理，这时候就利用startsWith()与endsWith()来判断。
        String str1 = "**@@HelloWorld";
        System.out.println(str1.startsWith("**"));      //判断开头是否为**  返回true
        System.out.println(str1.startsWith("@@",2));//自定义位置后开头是否为@@
        System.out.println(str1.endsWith("d"));     //判断结尾   true
    }

}
