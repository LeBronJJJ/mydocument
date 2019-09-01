package com.revision.Set;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {

    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(111);
        linkedHashSet.add(222);
        linkedHashSet.add(666);
        linkedHashSet.add(888);
        linkedHashSet.add(555);
        System.out.println(linkedHashSet);
    }

}
