package com.trainning.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//判断是否为相交链表
public class XiangJiaoListNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode[] list = new ListNode[100];
        int i = 0;
        while (headB != null) {
            list[i++] = headB;
            headB = headB.next;
        }
        while (headA != null) {
            for (int j = 0; j < i; j++) {
                if (headA == list[j]) {
                    return headA;
                }
            }
            headA = headA.next;
        }
        return null;
    }
}
