package com.hello._38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _38 {
    public static void main(String[] args) {
        // 38. 字符串的排列
    }
}

class Solution {
    List<String> rec;
    boolean[] vis;

    public String[] permutation(String s) {
        int n = s.length();
        rec = new ArrayList<>();
        vis = new boolean[n];
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        StringBuilder perm = new StringBuilder();

        backtrack(sArr, 0, n, perm);

        String[] recArr = new String[rec.size()];
        for (int i = 0; i < rec.size(); i++) {
            recArr[i] = rec.get(i);
        }
        return recArr;
    }

    void backtrack(char[] arr, int i, int n, StringBuilder perm) {
        if (i == n) {
            rec.add(perm.toString());
            return;
        }
        for (int j = 0; j < n; j++) {
            if (vis[j] || j > 0 && !vis[j - 1] && arr[j - 1] == arr[j]) {
                continue;
            }
            perm.append(arr[j]);
            vis[j] = true;
            backtrack(arr, i + 1, n, perm);
            vis[j] = false;
            perm.deleteCharAt(perm.length() - 1);
        }
    }
}