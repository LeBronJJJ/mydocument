package com.trainning.ListNode;

import java.util.HashMap;
import java.util.HashSet;

/*class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/


public class DeleteDuplication {

    public static void main(String[] args) {

        ListNode pHead = new ListNode(1);
        pHead.next = new ListNode(2);
        pHead.next.next = new ListNode(2);
        pHead.next.next.next = new ListNode(3);
        pHead.next.next.next.next = new ListNode(3);
        pHead.next.next.next.next.next = new ListNode(4);
        deleteDuplication(pHead);
        while(pHead != null){
            System.out.println(pHead.val);
            pHead = pHead.next;
        }
    }
    public  static ListNode deleteDuplication(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return pHead;
        }else{
            ListNode cur = pHead;
            ListNode prev = new ListNode(-1);
            prev.next = pHead;
            while(cur.next != null){
                boolean flag = false;
                while(cur.val == cur.next.val){
                    cur.next = cur.next.next;
                    flag = true;
                }
                if(cur.val != cur.next.val){
                    cur = cur.next;
                }
                if(flag == true){
                    prev.next = cur;
                }else{
                    prev = prev.next;
                }
            }
        }
        return pHead;
    }
}
