package com.revision.Others;

public class PassByValue {

    public static void main(String[] args) {
        int i = 10;
        PassByValue pbv = new PassByValue();
        pbv.print(i);
        System.out.println("main i = " + i);
    }
    public void print(int j) {
        j = 20;
        System.out.println("print j = " + j);
    }
}
