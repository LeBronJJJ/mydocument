package com.javasefile;
//内建功能型接口
import java.util.function.IntFunction;
public class Test0 {
    public static void main(String[] args) {
    IntFunction<String> function = String :: valueOf;
        System.out.println(function.apply(1000));
    }
}
