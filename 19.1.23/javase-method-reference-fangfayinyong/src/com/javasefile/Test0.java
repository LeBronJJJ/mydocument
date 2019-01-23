package com.javasefile;
//static method reference
//静态方法引用
//相当于为这个方法起了个别名
@FunctionalInterface
interface IUtil<P,R>{
    public R switchPara(P p);
}

public class Test0 {
    public static void main(String[] args) {
        IUtil<Integer,String> iu = String :: valueOf;
        String str = iu.switchPara(159);
        System.out.println(str.length());
    }
}
