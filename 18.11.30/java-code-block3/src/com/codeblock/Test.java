package com.codeblock;

public class Test{
    {
        System.out.println("1.Test的构造块");
    }
    public Test(){
        System.out.println("2.Test的构造方法");
    }
    static {
        System.out.println("3.Test的静态块");       //放在主类里面的静态块甚至优于
                                                    //主方法先执行！！！
    }                                                  //如果一些属性需要在使用前做处理，
                                                        // 可以考虑使用代码块。

    public static void main(String[] args) {
        System.out.println("--Start--");
        new Test();
        new Test();
        System.out.println("--End--");
    }
}