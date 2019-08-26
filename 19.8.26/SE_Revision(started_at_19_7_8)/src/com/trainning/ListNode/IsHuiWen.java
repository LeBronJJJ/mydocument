package com.trainning.ListNode;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

    public class IsHuiWen {
        public boolean chkPalindrome(ListNode A) {

            if(A == null){
                return false;
            }
            if(A.next == null){
                return true;
            }
            int len = 0;
            ListNode cur = A;
            while(cur != null){
                cur = cur.next;
                len++;
            }
            if(len%2 == 1){
                return false;
            }
            cur = A;
            Stack<Integer> stack = new Stack<>();
            while(cur != null){
                stack.push(cur.val);
                cur = cur.next;
            }
            cur = A;
            while(cur != null){
                if(cur.val != stack.pop()){
                    return false;
                }else{
                    cur = cur.next;
                }
            }
            return true;
        }
    }
