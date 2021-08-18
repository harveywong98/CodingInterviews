package com.hello._28;

import com.sun.tools.hat.internal.model.Root;

public class _28 {
    public static void main(String[] args) {
        System.out.println(true ^ true);
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (null == root){
            return true;
        }
        return recur(root.left, root.right);

    }
    public boolean recur(TreeNode left, TreeNode right){
        if (null != left && null != right){
            return left.val != right.val && recur(left.right, right.left) && recur(right.left, left.right);
        } else {
            if (left == null){}
        }
        return false;
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