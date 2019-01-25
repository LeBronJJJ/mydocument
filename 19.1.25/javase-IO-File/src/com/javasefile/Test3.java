package com.javasefile;
//查看文件大小和最后修改时间
import java.io.IOException;
import java.io.File;
import java.util.Date;
public class Test3 {
    public static void main(String[] args) {
        //要操作的文件
        File f3 = new File("D:/Movie/TF5.mp4");
        //保证文件存在后  再执行操作
        if(f3.exists() && f3.isFile()){
            System.out.println("文件大小为：" + f3.length() + "字节");
            System.out.println("文件最后修改时间为：" + new Date(f3.lastModified()));
        }else{
            System.out.println("错误的文件路径！");
        }
    }
}
