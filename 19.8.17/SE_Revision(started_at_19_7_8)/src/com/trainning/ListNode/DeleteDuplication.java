package com.trainning.ListNode;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class DeleteDuplication {

    public static void main(String[] args) {
        ListNode pHead = new ListNode(1);
        pHead.next = new ListNode(2);
        pHead.next = new ListNode(2);
        pHead.next = new ListNode(3);
        pHead.next = new ListNode(3);
        pHead.next = new ListNode(4);
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
            while(cur != null){
                if(cur.val == cur.next.val){
                    cur.next = cur.next.next;
                    continue;
                }else {
                    cur = cur.next;
                }
            }
        }
        return pHead;
    }
}
