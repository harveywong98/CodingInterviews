package com.hello._48;

import java.util.HashMap;
import java.util.Map;

public class _48 {
    public static void main(String[] args) {
        // 最长不含重复字符的子字符串
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int max = 0;
        int temp = 0;
        for (int i=0;i<s.length();i++){
            int index = dic.getOrDefault(s.charAt(i),-1);
            dic.put(s.charAt(i), i);
            temp = temp < i - index ? temp+1 : i - index;
            max = Math.max(max, temp);
        }
        return max;
    }
}