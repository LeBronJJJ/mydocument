package com.revision.Set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("String1");
        hashSet.add("String12");
        hashSet.add("String3");
        hashSet.add("String55");
        hashSet.add("String222");
        hashSet.forEach(e -> System.out.println(e + " "));
    }
}
