package com.hello._05;

public class _05 {
    public static void main(String[] args) {

    }
}

class Solution {
    public String replaceSpace(String s) {
        if (null == s){
            return null;
        }
        char[] stringArray = s.toCharArray();

        int numOfSpaces = 0;
        for (int i=0;i<stringArray.length;i++){
            if (stringArray[i] == ' '){
                numOfSpaces ++;
            }
        }

        char[] result = new char[s.length()+numOfSpaces*2];
        int resultIndex = 0;
        for (int i=0;i<stringArray.length;i++){
            if (stringArray[i] == ' '){
                result[resultIndex++] = '%';
                result[resultIndex++] = '2';
                result[resultIndex++] = '0';
            } else {
                result[resultIndex++] = stringArray[i];
            }
        }
        return String.valueOf(result);
    }
}