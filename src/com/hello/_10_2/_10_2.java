package com.hello._10_2;

public class _10_2 {
    public static void main(String[] args) {
        // 青蛙跳台阶问题
    }
}

class Solution {
    public int numWays(int n) {
        if (n==0){
            return 1;
        }
        if (n==1){
            return 1;
        }
        int[] array = new int[n+1];
        array[0] = 1;
        array[1] = 1;

        for (int i=2;i<n+1;i++){
            array[i] = (array[i-1]+array[i-2])%1000000007;
        }
        return array[n];
    }
}