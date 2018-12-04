package com.usageofio;



import java.io.File;
import java.io.IOException;



public class Test {


        public static File code1() {
            File file = new File("D:\\file.txt");
            try {
                if (file.createNewFile()) {
                    System.out.println("创建成功！");
                    return  file;
                } else {
                    System.out.println("" +
                            "创建失败！");
                    return null;
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }



    //1.传入一个文件file
//2.打印输入如下内容
//2。1每一个文件一行
//2.2F/D name size last_modified

    public static void print(File d) {
        if (d.exists()) {
            System.out.println(d.getName());
            if (d.isFile()) {
                System.out.println("大小为：" + d.length());
                System.out.println("最后修改日期为：" + d.lastModified());
            } else {
                System.out.println("最后修改日期为：" + d.lastModified());
            }
        }
    }


        //1.递归遍历文件
        //2.输出格式：tree  目录

        public static void tree (File d) throws NullPointerException{
            if (d.exists()) {
                if (d.isFile()) {
                    System.out.println(d.getName());
                } else {
                    File[] files = d.listFiles();
                    if(files ==null){
                        System.out.println("hahah");
                    }
                    for (File s : files) {
                        tree(s);
                    }
                }

            }
        }

        public static void main (String[]args) throws NullPointerException {

          // tree(code1());
           File file = new File("D:");
           tree(file);


        }

    }

