package test;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age  = age;
    }
    public String getPersonInfo(){
        return "姓名:" + this.name + " 年龄:" + this.age;
    }
}
