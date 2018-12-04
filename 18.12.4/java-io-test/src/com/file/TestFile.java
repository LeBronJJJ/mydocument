package com.file;

import java.io.File;
import java.io.IOException;
//1.文件分隔符  windows \ linux /  unix /代码跨平台注意使用  File.separator
//2.路径分隔符 windows ;  linux  :  unix  :   跨平台   使用FIle.pathSeparator
//3.文件名大小写  windows不区分  linux  unix  区分
//widows  hello.txt,Hello.txt是一个文件
//



public class TestFile {
    public static void main(String[] args){
    File file = new File("D:\\hello.txt");
    try {
        if (file.createNewFile()) {
            System.out.println("创建成功！");
        } else {
            System.out.println("" +
                    "创建失败！");
        }
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
}
}
