package com.javase.parctice;

/**
 * 测试方法的重写
 * 基于继承的机制
 * 返回值类型
 * 子类 <= 父类
 */
public class Demo2 {
    public static void main(String[] args) {
       Horse h = new Horse();
       h.run();
       h.stop();
       System.out.println(h.passenger().toString());
    }
}

class vehicle {
    public void run(){
        System.out.println("run...");
    }

    public void stop(){
        System.out.println("stop...!");
    }

    public Person passenger(){
        return new Person("123",12);
    }

}

class Horse extends vehicle{
    @Override
    public void run() {
        System.out.println("马蹄咯噔！");
    }

    public Student passenger(){
        return new Student("1234",11,"communication","study");
    }

}

