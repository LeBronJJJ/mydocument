package com.javase.practice;

/**
 * 测试  对象的转型
 */
public class Demo2 {
    public static void main(String[] args) {
        //虽然new了一个Dog  但是  给他的引用类型 编译时就是animals
        //运行时jvm知道 d 就是 一个Dog对象
        Animals1 d = new Dog1();
        animalsShock(d);
        //这样是调不出shout的  因为编译器认为d这个对象为一个animals
        //d.shout();
        //所以应该先转型为Dog类型的对象
        //随后便可使用该方法
        Dog1 d1 = (Dog1) d;
        d.shout();
        Animals1 c = new Cat1();
        //如果把猫  强转为  狗
        Dog1 d2 = (Dog1) c;
        //就会class cast exception
        d2.shout();
    }

    public static void animalsShock(Animals1 a){  //这里就是体现了多态性
        a.shout();
    }

}


class Animals1{
    public void shout(){
        System.out.println("叫了一声！");
    }
}

class Dog1 extends Animals1 {

    @Override
    public void shout() {
        System.out.println("汪汪汪！");
    }

    public void watchDog(){
        System.out.println("看门");
    }

}

class Cat1 extends Animals1 {
    @Override
    public void shout() {
        System.out.println("喵喵喵！");
    }
}
