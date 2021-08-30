package com.hello._16;

public class _16 {
    public static void main(String[] args) {
        // 16. 数值的整数次方
    }
}

class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        long b = n;
        if (n < 0) {
            x = 1 / x;
            b = -b;
        }
        double res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }
}