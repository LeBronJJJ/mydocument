package com.revision.Algorithm;

/*求最大连续子数组和(Maximum Sub_Array)

        题目是这样的 加入给定一个数组{6,-3,-2,7,-15,1,2,2},求连续子数组的最大和，也就是8。*/

import java.awt.print.PrinterGraphics;
import java.util.Scanner;
import java.util.Vector;

public class Maximum_Sub_Array {
    public static void main(String[] args) {
        Vector<Integer> array = new Vector<>();
        array.add(6);
        array.add(-3);
        array.add(-2);
        array.add(7);
        array.add(-15);
        array.add(1);
        array.add(2);
        array.add(2);

        System.out.println("经计算，此数组的连续子数组最大值为：" + Solution(array));

    }

    private static int Solution(Vector<Integer> array) {
        if (array.isEmpty()) {
            return -1;
        }
        //F(i)初始化
        int sum = array.get(0);
        //maxsum初始化
        int maxsum = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            //F(i) = max(F(i - 1) + array[i],array[i])
            sum = sum > 0 ? sum + array.get(i) : array.get(i);
            //maxnum = max(maxnum,F(i))
            maxsum = sum < maxsum ? maxsum : sum;
        }
        return maxsum;
    }
}
