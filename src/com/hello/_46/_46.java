package com.hello._46;

public class _46 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int translateNum(int num) {
        String numStr = String.valueOf(num);
        char[] numArray = numStr.toCharArray();

        int length = numArray.length;
        int[] dp = new int[length];

        dp[0] = 1;

        for (int i=1;i<length;i++){
            // 至少，dp[i] = dp[i-1]
            dp[i] = dp[i-1];
            if ((numArray[i-1] == '2' && numArray[i] < '6')  || numArray[i-1] == '1'){
                if (i==1){
                    dp[i] ++;
                } else {
                    dp[i] += dp[i-2];
                }
            }
        }
        return dp[length-1];
    }
}