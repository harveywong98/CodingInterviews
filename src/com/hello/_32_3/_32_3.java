package com.hello._32_3;

import java.util.*;

public class _32_3 {
    public static void main(String[] args) {

    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i=0;i<levelSize;i++){
                TreeNode node = queue.poll();
                if (result.size() % 2 == 0){
                    temp.addLast(node.val);
                } else {
                    temp.addFirst(node.val);
                }
                if (null != node.left){
                    queue.offer(node.left);
                }
                if (null != node.right){
                    queue.offer(node.right);
                }
            }
            result.add(temp);
        }
        return result;
    }
}

class Solution2{
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList();
        List<List<Integer>> result = new ArrayList<>();

        if (null == root){
            return result;
        }

        deque.addLast(root);
        while (!deque.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int levelSize = deque.size();
            for (int i=0;i<levelSize;i++){
                TreeNode node = deque.pollFirst();
                temp.add(node.val);
                if (null != node.left){
                    deque.addLast(node.left);
                }
                if (null != node.right){
                    deque.addLast(node.right);
                }
            }
            result.add(temp);
            if (deque.isEmpty()){
                break;
            }
            temp = new ArrayList<>();
            levelSize = deque.size();
            for (int i=0;i<levelSize;i++){
                TreeNode node = deque.pollLast();
                temp.add(node.val);
                if (null != node.right){
                    deque.addFirst(node.right);
                }
                if (null != node.left){
                    deque.addFirst(node.left);
                }
            }
            result.add(temp);
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