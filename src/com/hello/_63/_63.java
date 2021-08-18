package com.hello._63;

public class _63 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minCost = Integer.MAX_VALUE;
        for (int i=0;i<prices.length;i++){
            if (minCost > prices[i]){
                minCost = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minCost);
            }
        }
        return maxProfit;
    }
}