package com.usageofthis;

public class Test {
    public static void main(String[] args) {
        Person per1 = new Person ();
        Person per2 = new Person ("白玉亮");
        Person per3 = new Person ("白玉亮",20);
        System.out.println(per1.getPeronInfo());
        System.out.println(per2.getPeronInfo());
        System.out.println(per3.getPeronInfo());
    }
}
