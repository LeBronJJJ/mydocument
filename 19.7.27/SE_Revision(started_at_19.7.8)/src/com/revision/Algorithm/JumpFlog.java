package com.revision.Algorithm;

import java.util.Scanner;

//青蛙一次可以跳1级台阶，也可以2级。。。。。。也可以n级，求跳上n级台阶有多少种方法
public class JumpFlog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("跳"+n+"阶台阶的方法数有" + Solution(n)+"种！");
        System.out.println("跳"+n+"阶台阶的方法数有" + Solution1(n)+"种！");
    }

    private static int Solution(int n) {
        if(n <= 0){
            return 0;
        }
        int res = 1;
        //利用循环实现F(N) = 2^(N-1)
        for(int i = 1;i <= n-1;i++){
            res *= 2;
        }
        return res;
    }
    //可以利用左移一位的思想  左移一位相当于乘一个2
    private static int Solution1(int n) {

        if(n <= 0){
            return 0;
        }
        //左移n-1就是乘2的(n-1)次方喽。。。
        int res = 1;
        return 1 << (n - 1);
    }
}
