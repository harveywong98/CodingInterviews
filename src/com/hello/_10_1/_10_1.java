package com.hello._10_1;

public class _10_1 {
    public static void main(String[] args) {

    }
}
class Solution {
    public int fib(int n) {
        if (n==0){
            return 0;
        }
        if (n==1 || n==2){
            return 1;
        }
        int[] array = new int[n+1];
        array[0] = 0;
        array[1] = 1;

        for (int i=2;i<n+1;i++){
            array[i] = (array[i-1]+array[i-2])%1000000007;
        }
        return array[n];
    }
}