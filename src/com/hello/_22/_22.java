package com.hello._22;

public class _22 {
    public static void main(String[] args) {
        // 链表中倒数第k个节点
    }
}

class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (null == head){
            return null;
        }

        ListNode second = head;
        for (int i=0;i<k;i++){
            if (second == null){
                return null;
            }
            second = second.next;
        }

        ListNode first = head;
        while (second != null){
            first = first.next;
            second = second.next;
        }
        return first;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
