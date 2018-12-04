package com.usageofabstract;

abstract class A{
    public void print(){
        //空实现，普通方法
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A();   //抽象类就算没有抽象方法  也是无法被实例化的！
    }
}

//抽象类一定不能使用ﬁnal声明，因为使用ﬁnal声明的类不允许有子类；
// 而抽象类必须有子类；相应的，抽象 方法也不能使用private定义，因为抽象方法必须要能被覆写
