package com.hello._64;

public class _64 {
    public static void main(String[] args) {
        // 64. 求1+2+…+n
    }
}

class Solution {
    public int sumNums(int n) {
        int a = n;
        int b = n + 1;
        int sum = 0;
        boolean flag;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        flag = ((b & 1) > 0) && (sum += a) > 0;
        a = a << 1;
        b = b >> 1;

        sum = sum >> 1;
        return sum;
    }
}