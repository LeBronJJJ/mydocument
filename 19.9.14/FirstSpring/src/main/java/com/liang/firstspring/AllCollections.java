package com.liang.firstspring;

import java.util.*;

public class AllCollections {
    private List<String> list;
    private String[] array;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;   //一个配置文件类 类似于HashTable 键值对

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "AllCollections{" +
                "list=" + list +
                ", str=" + Arrays.toString(array) +
                ", set=" + set +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
