package com.trainning.String;

/**
 * 要求将字符串的空格替换为%20
 */
public class ReplaceCharFromString {

    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        //StringBuffer里没有replaceAll这个方法
        //所以转为String  利用 toString()方法，再调用String的replaceAll
        //即可
        return str.toString().replaceAll(" ", "%20");

    }
}
