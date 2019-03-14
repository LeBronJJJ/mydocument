
package com.javasefile;

/**
 * 自动类型转化
 * 容量小的数据类型  自动转化为 容量大的数据类型
 * ***特例：
 * long  8 个byte
 * float 4 个byte
 *long 可以自动转化为 float
 * 因为 float 表示的范围比 long 要大
 *
 * 可以将整型常量直接赋给byte short char等类型的
 * 变量  而不需要强制类型转换
 * 只要不超出其表数范围即可
 */
public class Test1 {
    public static void main(String[] args) {
        int a = 324;
        long b = a;
        double d = b;
        //a = b;
        //long e = 3.23;
        float f = 2132132132L;

        //特例
        //byte b2 = 1230;
    }
}
