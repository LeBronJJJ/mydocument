package com.javasefile;

import java.io.*;

public class Test0 {
    public static void main(String[] args) throws IOException {
/*
        System.getProperties().list(System.out);
*/
        OutputStream outputStream = new FileOutputStream(new File("D:/Test1/666/777/123.txt"));
        outputStream.write("德玛西亚万岁！".getBytes("UTF-8"));
        outputStream.close();
    }
}
