package com.javase.parctice;

import java.util.Objects;

/**
 * 测试 == 和 equals()方法的区别和 用法
 */
public class Demo4 {
    public static void main(String[] args) {
       Person2 p2  = new Person2(100,"KD","123456");
       Person2 p21 = new Person2(100,"KD","123456");
        // ==  基本类型时  表示值是否相等
        // 引用类型时  表示地址是否相等
        System.out.println(p2 == p21);         //false,地址  不同  所以  false
        System.out.println(p2.equals(p21));    //

    }
}

class Person2{
    private int id;
    private String name;
    private String pwd;


    //一般equals()方法都是要重写的
    //用来判断  对象的  内容是否相等
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return id == person2.id;
    }



    public Person2(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;



    }

}
