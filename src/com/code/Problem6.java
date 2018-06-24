package com.code;

import java.util.Arrays;
import java.util.Stack;

/**
 * 输入二叉树的前序遍历和中序遍历的结果，重建出该二叉树。
 * 假设前序遍历和中序遍历结果中都不包含重复的数字。
 * 例如输入的前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
 */
public class Problem6 {

    public static void main(String[] args) {
        Problem6 problem6 = new Problem6();
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = problem6.constructCore(pre, in);
    }

    //前序遍历 根->左->右
    //中序遍历 左->根->右
    public TreeNode constructCore(int [] pre,int [] in) {
        TreeNode root = constructCore(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }

    private TreeNode constructCore(int[] pre,int startPre,int endPre,int[] in,int startIn,int endIn) {
        if (startPre>endPre || startIn>endIn) {
            return null;
        }
        TreeNode root = new TreeNode(pre[startPre]);
        for (int i= startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                root.left = constructCore(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right = constructCore(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
            }
        }
        return root;

    }


}
