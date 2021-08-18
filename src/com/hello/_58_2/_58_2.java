package com.hello._58_2;

public class _58_2 {
    public static void main(String[] args) {
        // 左旋转字符串
    }
}

class Solution {
    public String reverseLeftWords(String s, int n) {
        if (null == s){
            return null;
        }
        if (s.length() == n){
            return s;
        }
//        if (s.length() < n){
//            return null;
//        }
        char[] result = new char[s.length()];
        int resultIndex = 0;
        for (int i=n;i<result.length+n;i++){
            result[resultIndex++] = s.charAt(i%result.length);
        }
        return String.valueOf(result);
    }
}
