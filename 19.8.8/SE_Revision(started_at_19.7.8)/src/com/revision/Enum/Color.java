package com.revision.Enum;

import java.util.Scanner;

/**
 * 枚举：enum 全称 enumeration(列举)
 * JDK1.5新特性  存放于java.lang包中
 */

//创建枚举类型使用enum关键字
public enum Color {
    RED,GREEN,YELLOW,BLUE
    //相当于new Enum<Color>("RED",0);
    //... ...
}



class Test{
    public static void main(String[] args) {
        for(Color color : Color.values()){
            System.out.println(color + " " + color.ordinal());
        }
        System.out.println("-------------这是分界线-------------");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Color color = Color.valueOf(str);
        switch (color){
            case RED:
                System.out.println("这是红色！");
                break;
            case BLUE:
                System.out.println("这是蓝色！");
                break;
            case GREEN:
                System.out.println("这是绿色！");
                break;
            case YELLOW:
                System.out.println("这是黄色！");
                break;

                default:
                    System.out.println("没有这个！");
                    break;
        }
    }
}
