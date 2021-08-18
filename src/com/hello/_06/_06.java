package com.hello._06;

import java.util.List;
import java.util.Stack;

public class _06 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;

        Solution solution = new Solution();
        int[] result = solution.reversePrint(l1);
        System.out.println(result);
    }
}

class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (null != head){
            stack.push(head.val);
            head = head.next;
        }

        int size = stack.size();
        int[] result = new int[size];
        int index = 0;
        while (!stack.isEmpty()){
            result[index] = stack.pop();
            index ++;
        }
        return result;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
