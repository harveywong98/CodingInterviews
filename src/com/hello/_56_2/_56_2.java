package com.hello._56_2;

public class _56_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.singleNumber(new int[]{3,4,3,3});
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int[] a = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                a[i] += num & 1;
                num >>>= 1;
            }
        }
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            ret <<= 1;
            ret |= a[31 - i] % 3;
        }
        return ret;
    }
}
