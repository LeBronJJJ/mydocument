package com.javasefile;
//内建消费型接口
import java.util.function.Consumer;
public class Test2 {
    public static void main(String[] args) {
        Consumer<String> consumer = System.out ::println;
        consumer.accept("哈哈");
    }
}
