package com.nestedclass;

    //所谓内部类就是在一个类的内部进行其他类结构的嵌套的操作
public class Outer {
    private String message = "Hello World";
    class Inner{        //定义一个内部类
        public void print(){
            System.out.println(message);
        }
    }
    public void fun(){      //此方法用来产生内部对象并且调用print()方法
        Inner inner = new Inner();
        inner.print();      //调用print()方法
    }
}
