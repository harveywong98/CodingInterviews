package com.hello._32_1;

import java.util.*;

public class _32_1 {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] levelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (null == root){
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            result.add(node.val);
            if (node.left != null){
                queue.offer(node.left);
            }
            if (node.right != null){
                queue.offer(node.right);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i=0;i<resultArray.length;i++){
            resultArray[i] = result.get(i);
        }
        return resultArray;
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