package com.hello._66;

import sun.security.util.Length;

public class _66 {
    public static void main(String[] args) {
        // 66. 构建乘积数组
    }
}

class Solution {
    public int[] constructArr(int[] a) {
        if (a.length == 0) {
            return new int[0];
        }
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        // 注意它第一个位置存放的是 1，这样到 i 时正好没有乘到 i
        left[0] = 1;
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }
        right[right.length - 1] = 1;
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }

        int[] result = new int[a.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}