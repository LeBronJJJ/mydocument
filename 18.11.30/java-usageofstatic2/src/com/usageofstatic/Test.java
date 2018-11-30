package com.usageofstatic;

public class Test {
    public static void main(String[] args) {
        Person.setCountry("中国");
        Person person = new Person("白玉亮",20);
        person.getPersonInfo();
    }
}
