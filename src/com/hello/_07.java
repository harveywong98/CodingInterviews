package com.hello;

import java.util.HashMap;
import java.util.Map;

public class _07 {
    public static void main(String[] args) {
        int[] preorder = {1,2,4,7,3,5,6,8};
        int[] inorder = {4,7,2,1,5,3,8,6};

        Solution solution = new Solution();
        TreeNode root = solution.buildTree(preorder,inorder);
        System.out.println(root);
    }
}

class Solution {
    int preorderIndex = 0;
    Map<Integer,Integer> inorderMap = null;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length){
            return null;
        }

        inorderMap = getInorderIndex(inorder);

        int left = 0;
        int right = preorder.length-1;
        TreeNode root = doBuildTree(left, right, preorder, inorder);
        return root;
    }

    public TreeNode doBuildTree(int left, int right, int[] preorder, int[] inorder){
        if (left > right){
            return null;
        }

        int inorderIndex = inorderMap.get(preorder[preorderIndex]);
        TreeNode currNode = new TreeNode(preorder[preorderIndex]);
        preorderIndex ++;
        currNode.left = doBuildTree(left, inorderIndex-1, preorder, inorder);
        currNode.right = doBuildTree(inorderIndex+1, right, preorder, inorder);
        return currNode;
    }


    public Map<Integer,Integer> getInorderIndex(int[] inorder){
        Map<Integer,Integer> result = new HashMap<>();
        for (int i=0;i<inorder.length;i++){
            result.put(inorder[i],i);
        }
        return result;
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
