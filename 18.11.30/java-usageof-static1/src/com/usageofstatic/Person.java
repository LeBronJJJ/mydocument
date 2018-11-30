package com.usageofstatic;

public class Person {
    static String Country = "America";
    String name;
    int age;

    public String getPersonInfo(){
        return "姓名:" + name + " 年龄:" + age + " 国籍:" + Country;
    }
}
