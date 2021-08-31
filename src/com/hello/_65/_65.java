package com.hello._65;

public class _65 {
    public static void main(String[] args) {
        // 65. 不用加减乘除做加法
        // System.out.println(Integer.toBinaryString(-1));
        // System.out.println(Integer.toBinaryString(1));
        Solution solution = new Solution();
        solution.add(-8,5);
    }
}

class Solution {
    public int add(int a, int b) {
        while (b!=0){
            int c = (a&b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }
}