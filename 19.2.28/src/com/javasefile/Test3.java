package com.javasefile;

/**
 * 类型提升
 */
public class Test3 {
    public static void main(String[] args) {
        int money = 1000000000;
        int years = 20;
        int total = money*years;
        //负数 超过了int的范围
        System.out.println(total);
        long total1 = money*years;
        //虽然这里用long声明了total1的数据类型
        //但是计算时默认的是int 会计算完之后
        //再转化为long  所以结果还是total
        System.out.println(total1);
        //这里事先声明money 是 long
        //一人提升  全家升天
        //类型提升
        long total2 = (long)money*years;
        System.out.println(total2);
    }
}
