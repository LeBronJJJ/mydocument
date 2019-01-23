package com.javasefile;
//引用构造方法
class Person{
    private String name;
    private int age;
    public Person(String name, int age){
        super();
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
@FunctionalInterface
interface IUtil3<R, PN, PA>{
    public R createPerson(PN pn, PA pa);
}
public class Test3 {
    public static void main(String[] args) {
        IUtil3<Person, String, Integer> iu3 = Person :: new;
        System.out.println(iu3.createPerson("白玉亮",21));
    }
}
