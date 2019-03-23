package com.javase.practice;

/**
 * 测试  多态  polymorphism
 * 对于同一个方法的调用  不同的对象有不同的方法
 */
public class Demo1 {
    public static void main(String[] args) {
        Animals1 a = new Animals1();
        a.shout();
        animalsShock(new Dog());
    }

    public static void animalsShock(Animals1 a){  //这里就是体现了多态性
        a.shout();
    }

}


class Animals {
    public void shout(){
        System.out.println("叫了一声！");
    }
}

class Dog extends Animals1 {

    @Override
    public void shout() {
        System.out.println("汪汪汪！");
    }
}

class Cat extends Animals1 {
    @Override
    public void shout() {
        System.out.println("喵喵喵！");
    }
}
