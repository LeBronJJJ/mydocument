package com.whitejavafile;
//早期的泛型
public class Test0 {
    public static void main(String[] args) {
        System.out.println(add(new int[]{1}));
        System.out.println(add(new int[]{1, 2, 3, 4, 5}));
        System.out.println(add(new int[]{1, 2, 3, 4, 5, 6, 7}));
    }
        public static int add (int [] data){
            int res = 0;
            //注意不能数组下标越界
            for(int i = 0; i < data.length; ++i){
                res += data[i];
            }
            return res;
        }

}
