/*
package com.revision.Algorithm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Word_Break {
    public static void main(String[] args) {
        String s = "pop style";
        //此处选择使用HashSet是因为  HashSet存储时内容是无序的
        Set<String> dict = new HashSet<>();
        dict.add("pop");
        dict.add("style");
        System.out.println("此字符串 " + s + " 可以被Break吗？" +
                Solution(s,dict));
    }
    public static boolean Solution(String s, Set<String> dict){
        if(s.isEmpty()){
            return false;
        }
        if(dict.isEmpty()){
            return false;
        }
        //获取字典中单词的最大长度
        int max_length = 0;

    }
}
*/
