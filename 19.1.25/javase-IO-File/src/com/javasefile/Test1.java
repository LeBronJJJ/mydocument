package com.javasefile;
//编写文件的基本操作(如果文件不存在则进行创建；存在则删除)
import java.io.IOException;
import java.io.File;
public class Test1 {
    public static void main(String[] args) throws IOException{
        File f1 = new File("D:/Test/TestIo.java");
        if(f1.exists()){
            f1.delete();
        }else{
            f1.createNewFile();
        }
    }
}
