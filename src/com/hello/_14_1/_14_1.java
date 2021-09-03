package com.hello._14_1;

public class _14_1 {
    public static void main(String[] args) {
        // 14- I. 剪绳子
    }
}

class Solution {
    public int cuttingRope(int n) {
        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                // 注意这里取的是剪短所有绳子断的最大值
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}