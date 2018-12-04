package com.myjavafile;

abstract class makeDrink{
    final void prepareProcess(){
        boilWater();
        brew();         //泡制
        addOthers();
        pourIn();
    }
    abstract void brew();
    abstract void addOthers();
    void boilWater(){
        System.out.println("烧水");
    }
    void pourIn(){
        System.out.println("将调至好的饮品倒入杯中");
    }
}
 class Tea extends makeDrink{
    void brew(){
        System.out.println("放茶叶");
    }
    void addOthers(){
        System.out.println("不添加其他辅料");
    }
}

class Coffee extends makeDrink{
    void brew(){
        System.out.println("加入咖啡粉");
    }
    void addOthers(){
        System.out.println("加糖");
    }
}

public class Test {
    public static void main(String[] args) {
        makeDrink tea = new Tea();
        tea.prepareProcess();
        makeDrink coffee = new Coffee();
        coffee.prepareProcess();
    }
}
