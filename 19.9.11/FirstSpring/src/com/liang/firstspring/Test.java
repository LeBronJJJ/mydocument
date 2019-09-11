package com.liang.firstspring;

import java.util.Arrays;

public class Test {

    static int solution(int[] arr) {
        if(arr.length == 0){
            return 0;
        }
        int[] newArr = Arrays.copyOf(arr,arr.length);
        int temp = 0;
        for(int i =0;i<newArr.length;i++) {
            for (int j = 0; j < newArr.length - i - 1; j++) {
                if (newArr[j] > newArr[j + 1]) {
                    temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                }
            }
        }
            int l = arr.length;
            int count = 0;
            while(l != 0){
                if(arr[l] == newArr[l]){
                    l--;
                    continue;
                }else{
                    count++;
                    l--;
                }
            }
            int res = count/2;
            return res;
        }
    }

