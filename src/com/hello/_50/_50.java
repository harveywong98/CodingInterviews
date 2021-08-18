package com.hello._50;


public class _50 {
    public static void main(String[] args) {
        // 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
    }
}

class Solution {
    public char firstUniqChar(String s) {
        if (s.length() == 0){
            return ' ';
        }
        int[] charAndNumArray = new int[26];
        char[] indexAndCharArray = new char[s.length()];

        int maxIndex = 0;
        for (int i=0;i<s.length();i++){
            charAndNumArray[s.charAt(i)-'a'] ++;
            indexAndCharArray[maxIndex++] = s.charAt(i);
        }
        for (int i=0;i<maxIndex;i++){
            if (charAndNumArray[indexAndCharArray[i] - 'a'] == 1) {
                return indexAndCharArray[i];
            }
        }
        return ' ';
    }
}