package com.whitejavafile;

//面试题：请解释String类中两种对象实例化的区别
// 1. 直接赋值：只会开辟  一块  堆内存空间，并且该字符串对象可以自动保存在对象池中以供下次使用。
//2. 构造方法：会开辟两块堆内存空间，其中  一块  成为垃圾空间，不会自动保存在对象池中，
// 可以使用 intern()方法手工入池。


//对象池：在JVM底层实际上会自动维护一个对象池（字符串对象池），
// 如果现在采用了直接赋值的模式进行String类的对象 实例化操作，
// 那么该实例化对象（字符串内容）将自动保存到这个对象池之中。
// 如果下次继续使用直接赋值的模式 声明String类对象，此时对象池之中如若有指定内容，
// 将直接进行引用；如若没有，则开辟新的字符串对象而后将 其保存在对象池之中以供下次使用

public class Test2 {
    public static void main(String[] args) {
        String str = new String("hello");   //这个字符串常量并没有保存在对象池里
        String str1 = "hello";
        System.out.println(str == str1);       //false

        //在String类中提供有方法入池操作 public String intern();
        //这是一个入池操作
        String str2 = new String("hello").intern();
        System.out.println(str1 == str2);      //true
    }

}
