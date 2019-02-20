package com.javasefile;

/**
 * 测试参数传值机制
 * @author lbj
 */

public class Test1 {
    int id;
    String name;
    String passWord;

    public Test1(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void testParameterTransfer1(Test1 t){
        t.name = "8";
    }

    public void testParameterTransfer2(Test1 t){
        t = new Test1(100,"666");
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1(1,"7");
        //t这个参数就是t1  因此共享同一个地址
        //通过改变t的name  间接修改了t1的内容
        t1.testParameterTransfer1(t1);
        System.out.println(t1.name);
        //新实例化了一个对象  和t1不同  因此不属于同一个地址
        //虽然t1传进去了 但是并未修改t1的内存
        //所以t不是t1  因此未能更改t1的内容
        t1.testParameterTransfer2(t1);
        System.out.println(t1.name);
    }

}
