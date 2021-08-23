package com.hello._58_1;

public class _58_1 {
    public static void main(String[] args) {
        // 翻转单词顺序
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("the sky is blue"));
    }
}

class Solution {
    public String reverseWords(String s) {
        if (0 == s.length()){
            return s;
        }
        StringBuffer stringBuffer = new StringBuffer();
        s = s.trim();
        int fast = s.length()-1;
        int slow = fast;
        while (fast >= 0){
            while (fast >= 0 && s.charAt(fast) != ' '){
                fast --;
            }
            stringBuffer.append(s.substring(fast + 1, slow + 1));
            stringBuffer.append(' ');
            while (fast >= 0 && s.charAt(fast) == ' '){
                fast --;
            }
            slow = fast;
        }
        return stringBuffer.toString().trim();
    }
}