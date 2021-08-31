package com.hello._15;

public class _15 {
    public static void main(String[] args) {
        // 15. 二进制中1的个数
        Solution2 solution2 = new Solution2();
        solution2.hammingWeight(0xfffffffd);
   }
}

class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        while (n != 0){
            n &= (n-1);
            result ++;
        }
        return result;
    }
}

class Solution2{
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            System.out.println((n & (1 << i)));
            if ((n & (1 << i)) != 0){
                result ++;
            }
        }
        return result;
    }
}