package com.hello._55_2;

public class _55_2 {
    public static void main(String[] args) {
        // 55 - II. 平衡二叉树
    }
}

class Solution {
    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return true;
        } else {
            return Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    int getDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(getDepth(node.left), getDepth(node.right)) + 1;
    }
}

class Solution2 {
    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    int height(TreeNode node) {
        if (null == node) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            // 参考 Solution1 的方法进行计算高度
            return Math.max(leftHeight, rightHeight) + 1;
        }
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
