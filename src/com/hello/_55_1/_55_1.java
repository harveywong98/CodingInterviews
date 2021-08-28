package com.hello._55_1;

public class _55_1 {
    public static void main(String[] args) {
        // 55 - I. 二叉树的深度
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        return recur(root, 0);
    }

    public int recur(TreeNode node, int depth) {
        if (null == node) {
            return depth;
        }
        return Math.max(recur(node.left, depth + 1), recur(node.right, depth + 1));
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