package com.trainning.sogoutest;

import java.util.Scanner;

public class Main {
    //利用hashMap
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = null;
        while(sc != null){
            str = sc.nextLine();
        }
        System.out.println(size + " " + str);
    }
}
