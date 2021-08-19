package com.hello._42;

public class _42 {
    public static void main(String[] args) {
        // 连续子数组的最大和
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxInDp = dp[0];

        for (int i=1;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1] + nums[i],nums[i]);
            maxInDp = Math.max(maxInDp, dp[i]);
        }
        return maxInDp;
    }
}