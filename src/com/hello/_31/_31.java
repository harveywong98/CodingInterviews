package com.hello._31;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _31 {
    public static void main(String[] args) {
        // 31. 栈的压入、弹出序列
    }
}

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num: pushed) {
            stack.push(num);
            while (!stack.empty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}