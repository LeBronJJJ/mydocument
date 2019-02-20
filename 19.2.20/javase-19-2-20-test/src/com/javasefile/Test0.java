package com.javasefile;

/**
 * 测试静态初始化块的使用
 * @author lbj
 */
public class Test0 {
    int id;
    String name;
    String passWord;
    static String company;

    static {
        System.out.println("执行类的初始化工作！");
        company = "凯亮工作室！";
        printCompany();
    }

    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        Test0 test0 = new Test0();
    }
}
