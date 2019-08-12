package com.byl.aug12;

import java.util.Scanner;

//题目描述：   请求获取到输入字符串中连续最长的数字串
//例：  输入   123a1234
//  输出：1234
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(solution(str));
    }

    public static String solution(String str) {

        int index = 0;
        String res = "";

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9') {
                int count = 1;
                index = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] >= '0' && arr[j] <= '9'){
                        count++;
                        index = j;
                    }else{
                        break;
                    }
                }if(count > res.length()){
                    res = str.substring(i,index+1);
                }
            }
        }

        return res;
    }

}
