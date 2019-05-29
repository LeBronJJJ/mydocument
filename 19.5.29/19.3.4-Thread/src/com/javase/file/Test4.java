package com.javase.file;
//首先导入大数包和输入包
import java.math.BigInteger;
import java.util.Scanner;

//计算n!(1*2*...*n)
public class Test4 {
    public static void main(String[] args){
        //输入n
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();

        //输入最终答案的初始值
        int pre_answer=1;
        //将答案初始值由int类型转变为String类型
        String x=String.valueOf(pre_answer);
        //将String类型的答案的初始值，传递给BigInteger类型，初始化为最终的答案
        BigInteger answer=new BigInteger(x);

        //循环迭代逐次相乘
        for (int i=1;i<=n;i++){

            //因为BigInteger类型只能和该类型的变量相乘，因此还需将每次的中间乘数也依次变为BigInteger类型
            String var=String.valueOf(i);
            BigInteger variable=new BigInteger(var);

            //调用相乘函数进行相乘运算
            answer=answer.multiply(variable);

        }
        //输出最终答案
        String s = String.valueOf(answer);
        StringBuilder sb = new StringBuilder(s);
        String newsb = sb.reverse().toString();
        String[] str = newsb.split("");
        Integer[] intArr = new Integer[str.length];
        for(int i = 0;i<str.length;i++){
            intArr[i] = Integer.valueOf(str[i]);
        }
        int count = 0;
        for(int j = 0;j<intArr.length;j++){
            if(intArr[j] == 0){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}


