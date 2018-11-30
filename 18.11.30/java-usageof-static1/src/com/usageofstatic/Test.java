package com.usageofstatic;

public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        person.name = "LeBron";
        person.age = 33;
        person1.name = "Stephen";
        person1.age = 30;
        Person.Country = "China";   //修改static属性  不受对象化控制 因此直接
                                    //修改类的属性就行了
        System.out.println(person.getPersonInfo());
        System.out.println(person1.getPersonInfo());
    }
}
