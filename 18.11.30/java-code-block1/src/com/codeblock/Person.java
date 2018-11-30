package com.codeblock;


        //构造块优先于构造方法执行，
        //每产生一个新的对象就调用一次构造块，
        //构造块可以进行简单的逻辑操作（在调用构造方法前）
public class Person {
    public Person(){
        System.out.println("2.Person类的构造方法，并不是构造块");
    }

    {   //定义在类中，不加任何修饰符，构造块
        System.out.println("1.Person类的构造块");    //构造块比构造方法总是先运行！
    }

}
