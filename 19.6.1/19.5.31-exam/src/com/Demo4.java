package com;
//题目   输入一个数字   比如  01234560123456
//要求得到0有几个  1  有几个..........   输入范围非常大1000位以后的大数字
//输出格式为0:2  \n   1:2....(没有的不写)

//思路：
//因为是一个很大的数字  因此  不能用int去接收用户输入的内容
//1.选取String 进行接收用户输入
//2.将这个字符串转化为数组
//3.使用Integer里的parseInt进行转化 将str通过substring截取  范围为(i,i+1```也就是一个)
//  for循环填入新创建好的数组array
//4.利用排序的方法   比如冒泡排序  整理数组
//5.最后利用for循环嵌套的方法进行判断与输出结果
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        //获取用户输入
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //把这个String转成数组
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        /*for (int a:
             array) {
            System.out.print(a);
        }
        System.out.println("\n");*/

        //准备用一个冒泡 拍一下序
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        //测试之后发现排序成功！
        /*for (int a :
                array) {
            System.out.print(a);
        }*/

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i) {
                    count++;
                } else {
                    if (count != 0) {
                        continue;
                    }
                }
            }
            if(count != 0){
                System.out.println(i + ":" + count);
            }
        }
    }
}


