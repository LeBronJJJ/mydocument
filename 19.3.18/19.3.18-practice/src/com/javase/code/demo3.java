package com.javase.code;
import java.util.Scanner;
/**
 * 循环实现阶乘
 */
public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字用以计算阶乘：");
        int n = scanner.nextInt();
        long t1 = System.currentTimeMillis();
        System.out.println("计算结果为：" + factorial(n));
        long t2 = System.currentTimeMillis();
        System.out.println("总共耗时：" + (t2 - t1));
    }
    public static int factorial(int n){
        int res = 1;
        if(n == 1){
            return 1;
        }
        else if(n == 0){
            return 0;
        }
        else {
            while (n > 1) {
                res *= n * (n - 1);
                n -= 2;
            }
        }return res;
        }
    }

