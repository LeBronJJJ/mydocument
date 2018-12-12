package com.whitejavafile;
//范例：现在有一个字符串判断其是否由数字所组成
//因为现在不知道字符串的长度以及包含的内容，所以最好的做法是将字符串变为字符数组而后
// 判断每一位字符是否 是" 0 "~"'9'"之间的内容，如果是则为数字。

class Fun{
    public static boolean IsNumber(String str){
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++ ){
            if(data[i] < '0' || data[i] > '9'){
                return false;
            }
        }
    return true;
    }
}

public class Test5 {
    public static void main(String[] args) {
        Fun fun = new Fun();
        System.out.println(fun.IsNumber("1a23456")?"字符串由数字组成！" :
                "字符串中有非数字成员！");
    }
}
