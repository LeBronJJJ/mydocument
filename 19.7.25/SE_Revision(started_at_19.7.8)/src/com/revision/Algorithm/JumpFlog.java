package com.revision.Algorithm;
//青蛙一次可以跳1级台阶，也可以2级。。。。。。也可以n级，求跳上n级台阶有多少种方法
public class JumpFlog {
    //状态  跳上i级台阶的方法数
    //跳1级：1,F(i-1)
    //跳2级：2,F(i-2)
    //用已知的方法解求未知   F(i)=F(i-1)+F(i-2)+F(i-3)+ ...... + F(1)  (状态转移方程)
    //F(i-1) = F(i-2)+F(i-3)+ ...... + F(1)
    //F(i) = 2*F(i - 1)
    //初始状态：
    //F(1) = 1      返回结果F(n)
    //
}
