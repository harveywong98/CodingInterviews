package com.hello._20;

public class _20 {
    public static void main(String[] args) {
        // 20. 表示数值的字符串
        Solution solution = new Solution();
        System.out.println(solution.isNumber("1 "));
    }
}

class Solution {
    public boolean isNumber(String s) {
        if (null == s || s.length() == 0){
            return false;
        }
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;
        char[] str = s.trim().toCharArray();
        if (str.length == 0){
            return false;
        }
        for (int i = 0; i < str.length; i++) {
            if (str[i] >= '0' && str[i] <= '9'){
                numSeen = true;
            } else if (str[i] == '.'){
                if(dotSeen || eSeen){
                    return false;
                }
                dotSeen = true;
            } else if (str[i] == 'e' || str[i] == 'E'){
                if (eSeen || !numSeen){
                    return false;
                }
                eSeen = true;
                numSeen = false;
            } else if (str[i] == '+' || str[i] == '-'){
                if (i != 0 && str[i-1] != 'e' && str[i-1] != 'E'){
                    return false;
                }
            } else {
                return false;
            }
        }
        return numSeen;
    }
}