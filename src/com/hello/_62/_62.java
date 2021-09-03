package com.hello._62;

public class _62 {
    public static void main(String[] args) {
        // 62. 圆圈中最后剩下的数字
    }
}

class Solution {
    public int lastRemaining(int n, int m) {
        return f(n, m);
    }

    int f(int n, int m) {
        if (n == 1) {
            return 0;
        }
        int x = f(n - 1, m);
        return (m + x) % n;
    }
}