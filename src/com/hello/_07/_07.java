package com.hello._07;

import java.util.HashMap;
import java.util.Map;

public class _07 {
    public static void main(String[] args) {
        // 07. 重建二叉树
        Solution solution = new Solution();
        TreeNode node = solution.buildTree(new int[]{3,9,20,15,7},new int[]{9,3,15,20,7});
        System.out.println(node);
    }
}

class Solution {
    int[] preorder;
    int[] inorder;
    Map<Integer, Integer> inorderIndexes;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) {
            return null;
        }
        int length = preorder.length;
        inorderIndexes = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndexes.put(inorder[i], i);
        }
        this.preorder = preorder;
        this.inorder = inorder;

        return recur(0, length - 1, 0, length - 1);
    }

    TreeNode recur(int preorderLeft, int preorderRight, int inorderLeft, int inorderRight) {
        if (inorderLeft > inorderRight) {
            return null;
        }
        int preorderRoot = preorderLeft;
        int inorderRoot = inorderIndexes.get(preorder[preorderRoot]);
        int leftSubtreeSize = inorderRoot - inorderLeft;
        TreeNode node = new TreeNode(preorder[preorderRoot]);
        node.left = recur(preorderLeft + 1, preorderLeft + leftSubtreeSize, inorderLeft, inorderRoot - 1);
        node.right = recur(preorderLeft + leftSubtreeSize + 1, preorderRight, inorderRoot + 1, inorderRight);
        return node;
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
