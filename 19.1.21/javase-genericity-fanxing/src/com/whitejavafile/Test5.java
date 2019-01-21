package com.whitejavafile;

class MyClass<T>{
    public void testMethod1(T t){
        System.out.println(t);
    }
    public <E> E testMethod2(E e){
        return e;
    }
}
public class Test5 {
    public static void main(String[] args) {
        MyClass <String>mc1 = new MyClass();
        mc1.testMethod1("泛型类");
        Integer i = mc1.testMethod2(666);
        System.out.println(i);
    }
}
