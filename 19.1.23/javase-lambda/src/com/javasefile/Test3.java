package com.javasefile;

@FunctionalInterface
interface IMath{
    public int add(int x, int y);
}

public class Test3 {
    public static void main(String[] args) {
        IMath iMath = (p1,p2) -> p1 + p2;
        System.out.println(iMath.add(10,100));
    }
}
