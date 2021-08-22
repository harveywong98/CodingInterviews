package com.hello._25;

public class _25 {
    public static void main(String[] args) {
        // 合并两个排序的链表
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // 创建伪头节点
        ListNode dum = new ListNode(0);
        ListNode cur = dum;

        while (null != l1 && null != l2){
            if (l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = null == l1 ? l2 : l1;
        return dum.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
