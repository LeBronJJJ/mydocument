package com.javase.practice;

/**
 * 测试数组 引用对象型数组
 */
public class Demo3 {
    public static void main(String[] args) {
        //长度为10的对象数组
        Person[] people = new Person[10];
        for(int i = 0; i < people.length;i++){
            people[i] = new Person();
    }
        for(int i = 0;i < people.length;i++){
            people[i].setId(i*2);
            people[i].setName("白" + i + "亮");
        }
        for(int i = 0;i < people.length;i++){
            System.out.println(people[i].getId());
            System.out.println(people[i].getName());
        }
    }
}

class Person{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
