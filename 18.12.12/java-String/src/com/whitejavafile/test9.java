package com.whitejavafile;

public class test9 {
    public static void main(String[] args) {
        String str = "Hello";
        //replaceAll("替换所有为这个字符的元素","替换为这个")
        System.out.println(str.replaceAll("l","0"));
        //replaceFirst("替换第一个找到的这个字符的元素","替换为这个")
        System.out.println(str.replaceFirst("l","1"));

        String str1 = "Hello World Hello LeBron";
        //按照空格进行拆分
        System.out.println("#################");
        String[] result = str1.split(" ");
        for(String s : result) System.out.println(s);

        String[] result1 = str.split(" ",2);
        System.out.println("#################");
        for(String s : result1) System.out.println(s);

        //拆分ip地址
        String str2 = "192.168.1.1";
        String[] res = str2.split("\\.");
        for(String s1 : res) System.out.println(s1);

        //多次拆分
        String str3 = "张瑞:21|王博:20";
        String[] res1 = str3.split("\\|");
        for(int i = 0; i < res1.length; i++){
            String[] res2 = res1[i].split("\\:");
            System.out.println(res2[0] + " = " + res2[1]);
        }
    }
}
