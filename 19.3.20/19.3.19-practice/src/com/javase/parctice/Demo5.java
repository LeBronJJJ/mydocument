package com.javase.parctice;

public class Demo5 {
    public static void main(String[] args) {
       ChildClass c = new ChildClass("6",666);
       c.f();
       c.print();
    }
}

class ChildClass extends FatherClass{
    private String name;
    private int age;

    public ChildClass(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void f(){
        super.f();
        System.out.println("这是子类的f方法");
    }

    public void print(){
            System.out.println(this.age+"\t" + this.name);
    }

}

class FatherClass{
    private String name;
    private int age;

    public FatherClass() {}

    public void f(){
        System.out.println("这是父类的f方法");
    }

    public void print(){
        System.out.println(this.age + this.name);
    }

}
