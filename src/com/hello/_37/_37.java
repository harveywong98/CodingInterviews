package com.hello._37;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _37 {
    public static void main(String[] args) {
        // 37. 序列化二叉树
    }
}

class Codec {
    public String serialize(TreeNode root) {
        return rserialize(root, "");
    }

    private String rserialize(TreeNode node, String str){
        if (node == null){
            str += "None,";
        } else {
            str = str + node.val + ",";
            str = rserialize(node.left, str);
            str = rserialize(node.right, str);
        }
        return str;
    }

    public TreeNode deserialize(String data) {
        String[] array = data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(array));
        return rdeserialize(list);
    }

    private TreeNode rdeserialize(List<String> data){
        if (data.get(0).equals("None")){
            data.remove(0);
            return null;
        }
        TreeNode node = new TreeNode(Integer.valueOf(data.get(0)));
        data.remove(0);
        node.left = rdeserialize(data);
        node.right = rdeserialize(data);
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