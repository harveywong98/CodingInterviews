package com.hello._25;

public class _25 {
    public static void main(String[] args) {
        // 合并两个排序的链表
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1){
            return l2;
        }
        if (null == l2){
            return l1;
        }

        ListNode p1;
        ListNode p2;
        ListNode cur;
        ListNode result;

        if (l1.val <= l2.val){
            p1 = l1.next;
            p2 = l2;
            cur = l1;
            result = l1;
        } else {
            p1 = l1;
            p2 = l2.next;
            cur = l2;
            result = l2;
        }

        while (null != p1 && null != p2){
            if (p1.val <= p2.val){
                cur.next = p1;
                p1 = p1.next;
            } else {
                cur.next = p2;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        if (null == p1){
            cur.next = p2;
        } else if (null == p2){
            cur.next = p1;
        }

        return result;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
