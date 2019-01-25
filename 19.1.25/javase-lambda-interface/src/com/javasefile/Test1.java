package com.javasefile;
//内建供给型接口
import java.util.function.Supplier;
public class Test1 {
    public static void main(String[] args) {
        Supplier<String> sup = "hello" ::toUpperCase;
        System.out.println(sup.get());
    }
}
