package com.hello._24;

public class _24 {
    public static void main(String[] args) {

    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode first = null;
        ListNode second = head;

        while (second != null){
            ListNode temp = second.next;
            second.next = first;
            first = second;
            second = temp;
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
