package com.javasefile;
//引用对象方法
@FunctionalInterface
interface IUtil1 <R>{
    public R switchPara1();
        }
public class Test1 {
    public static void main(String[] args) {
        //hello 这个对象有String类的方法
        IUtil1<String> iu1 = "Hello" :: toUpperCase;
        System.out.println(iu1.switchPara1());
    }
}
