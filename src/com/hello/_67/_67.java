package com.hello._67;

public class _67 {
    public static void main(String[] args) {
        // 67. 把字符串转换成整数
    }
}

class Solution {
    public int strToInt(String str) {
        char[] strArray = str.trim().toCharArray();
        if (strArray.length == 0) {
            return 0;
        }
        int res = 0;
        int boundary = Integer.MAX_VALUE / 10;
        int i = 1;
        int sign = 1;
        if (strArray[0] == '-') {
            sign = -1;
        } else if (strArray[0] != '+'){
            i = 0;
        }
        for (int j = i; j < strArray.length; j++){
            if (strArray[j] < '0' || strArray[j] > '9'){
                break;
            }
            if (res > boundary || res == boundary && strArray[j] > '7'){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + strArray[j] - '0';
        }
        return sign * res;
    }
}