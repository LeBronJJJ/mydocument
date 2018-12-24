package com.whitejavafile;

class Singleton3 {
    private static Singleton3 Instance = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return Instance;
    }
    public void print(){
        System.out.println("fuck");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Singleton3 singleton3;
        singleton3 = Singleton3.getInstance();
        singleton3.print();
    }
}
