package com.whitejavafile;
//foreach可以避免数组越界问题  但是只能适合简单的输出模式
public class Test2 {
    public static void main(String[] args) {
        int[] data = {1,2,33,4,6};
        for(int i : data){
            System.out.println(i);
        }
    }
}
