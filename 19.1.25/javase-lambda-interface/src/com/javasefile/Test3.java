package com.javasefile;
//内建断言型接口
import java.util.function.Predicate;
public class Test3 {
    public static void main(String[] args) {
        Predicate<String> predicate = "@#$%^"::startsWith;
        //true
        System.out.println(predicate.test("@#"));
    }
}
