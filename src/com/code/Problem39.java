package com.code;

/**
 * 输入一颗二叉树的根结点，求该树的深度。
 * 从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径为树的深度。
 */
public class Problem39 {

    //递归
    public  int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        return Math.max(left+1,right+1);
    }
}
