package com.javasefile;
//创建文件
import java.io.File;
import java.io.IOException;

public class Test0 {
    public static void main(String[] args) {
        File f = new File("D:/Test/TestIo.java");
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
