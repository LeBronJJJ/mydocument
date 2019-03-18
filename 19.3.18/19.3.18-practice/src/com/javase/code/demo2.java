package com.javase.code;
import java.util.Scanner;
/**
 *递归练习
 * 求阶乘
 * 递归既花时间又花内存
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long t1 = System.currentTimeMillis();
        System.out.println("递归结果为：" + factorial(n));
        long t2 = System.currentTimeMillis();
        System.out.println("递归共耗时：" + (t2 - t1));
    }
    public static long factorial(int n){
        if(n == 1){
            return 1;
        }else if(n == 0){
            return 0;
        }else{
            return (n * factorial(n - 1));
        }
    }
}
