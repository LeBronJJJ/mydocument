package com.revision.Algorithm;

import java.util.Scanner;

//递归时间复杂度为O(2^n)
//
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //用于接收数据
       /* System.out.println("第" + n + "项的斐波那契数是" + Solution(n));
        System.out.println("第" + n + "项的斐波那契数是" + Solution1(n));*/
        System.out.println("第" + n + "项的斐波那契数是" + Solution2(n));


    }

    /*private static int Solution(int n) {
        if(n <= 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return Solution(n - 2) + Solution(n - 1);
    }


    private static int Solution1(int n) {
        //初始值
        if(n <= 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        //申请一个数组  用来保存子问题的解
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        for(int i = 3;i <= n;i++){
            array[i] = array[i-1] + array[i-2];
        }
        return array[n];
    }*/

    private static int Solution2(int n) {
        //初始值
        if(n <= 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        //由于结果只和它的前两个值有关  我们每次计算完就对两个临时变量进行重新赋值 比刚才的方法
        //更加节省空间  时间复杂度因为没有了最后的数组查找 变成了O(1)
        int fn1 = 0;
        int fn2 = 1;
        int res = 0;
        for(int i = 2;i <= n;i++){
            res = fn1 + fn2;
            fn1 = fn2;
            fn2 = res;
        }
        return res;
    }


}
