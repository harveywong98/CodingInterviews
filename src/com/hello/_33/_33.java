package com.hello._33;

public class _33 {
    public static void main(String[] args) {
        // 33. 二叉搜索树的后序遍历序列
    }
}

class Solution {
    int[] postorder;

    public boolean verifyPostorder(int[] postorder) {
        this.postorder = postorder;
        return doVerify(0, postorder.length - 1);
    }

    boolean doVerify(int left, int right) {
        if (left >= right) {
            return true;
        }
        int p = left;
        while (postorder[p] < postorder[right]) {
            p++;
        }
        int m = p;
        while (postorder[p] > postorder[right]) {
            p++;
        }
        return p == right && doVerify(left, m - 1) && doVerify(m, right - 1);
    }
}