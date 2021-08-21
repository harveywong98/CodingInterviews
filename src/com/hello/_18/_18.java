package com.hello._18;

public class _18 {
    public static void main(String[] args) {
        // 删除链表的节点
    }
}

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (null == head){
            return null;
        }

        if (head.val == val){
            return head.next;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        while (null != cur){
            if (val == cur.val){
                pre.next = cur.next;
                break;
            }
            pre = cur;
            cur = cur.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
