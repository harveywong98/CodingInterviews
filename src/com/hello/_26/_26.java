package com.hello._26;

public class _26 {
    public static void main(String[] args) {

    }
}


class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean result = false;
        if (null != A && null != B){
            result = recur(A, B);
            if (!result){
                result = isSubStructure(A.left, B) || isSubStructure(A.right, B);
            }
        }
        return result;
    }

    public boolean recur(TreeNode A, TreeNode B){
        if (null == B){
            return true;
        }
        if (null == A){
            return false;
        }
        return A.val == B.val && recur(A.left, B.left) && recur(A.right, B.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
