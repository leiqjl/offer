package com.code;

import java.util.Stack;

/**
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */
public class Problem19 {

    public void mirrorBinaryTree(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.right != null) {
            mirrorBinaryTree(root.right);
        }
        if (root.left != null) {
            mirrorBinaryTree(root.left);
        }
    }

    //非递归
    public void mirrorBinaryTree1(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            if (treeNode.left != null || treeNode.right != null) {
                TreeNode temp = treeNode.left;
                treeNode.left = treeNode.right;
                treeNode.right = temp;
            }
            if (treeNode.left != null) {
                stack.push(treeNode.left);
            }
            if (treeNode.right != null) {
                stack.push(treeNode.right);
            }
        }
    }

}
