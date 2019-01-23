package com.javasefile;
//引用普通方法
@FunctionalInterface
interface IUtil2<R, P>{
    public R compare(P p1, P p2);
}

public class Test2 {
    public static void main(String[] args) {
        IUtil2<Integer,String> iu2 = String :: compareTo;
        System.out.println(iu2.compare("牛", "批"));
    }
}
