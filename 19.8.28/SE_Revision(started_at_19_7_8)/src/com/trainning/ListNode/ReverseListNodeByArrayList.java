package com.trainning.ListNode;
/**
 * 要求使用ArrayList将一个链表进行逆置输出
 * 两种方法
 * 1. 使用ArrayList仅有的add()方法进行尾插，然后再将最后一个元素开始进行在新的ArrayList再次尾插
 * 2. 利用链表的头插先将其逆置，然后通过ArrayList的add()直接尾插就是逆置过来的链表元素了
 */

import java.util.ArrayList;



class ListNode1 {
     int val;
     ListNode next = null;

     ListNode1(int val) {
             this.val = val;
         }
 }
 class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null){
            return null;
        }
        ArrayList<Integer> array = new ArrayList<>();
        while(listNode != null){
            array.add(listNode.val);
            listNode = listNode.next;
        }

        return reverseArray(array);
    }
    public static ArrayList<Integer> reverseArray(ArrayList<Integer> array){
        ArrayList<Integer> newArray = new ArrayList<>();
        int index = array.size()-1;
        for(int i = index;i>=0;i--){
            newArray.add(array.get(i));
        }
        return newArray;
    }
    static ListNode s = new ListNode(1);
     {
         s.next = new ListNode(2);
         s.next.next = new ListNode(3);
     }

     public static void main(String[] args) {
        new Solution().printListFromTailToHead(s);
         System.out.println(new Solution().printListFromTailToHead(s));
     }

}
