package com.whitejavafile;
//如果要传递多类参数，可变参数一定放在最后，并且只能设置一个可变参数
public class Test1 {
    public static void main(String[] args) {
        System.out.println(add("hello",new int[]{1, 2, 3}));
        System.out.println(add("666",2, 3, 4, 5, 6));
        System.out.println(add("Hello"));
    }
    public static String  add(String msg, int ... data){
        int res = 0;
        for(int i = 0; i < data.length; ++i){
            res += data[i];
        }
        return msg;
    }
}
