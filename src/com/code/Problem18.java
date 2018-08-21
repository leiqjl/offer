package com.code;

/**
 * 输入两颗二叉树 A 和 B，判断 B 是不是 A 的子结构。
 */
public class Problem18 {

    public boolean hasSubtree(TreeNode root1, TreeNode root2) {
        boolean flag = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                flag = doseTree1HaveTree2(root1, root2);
            }
            if (!flag) {
                flag = hasSubtree(root1.left, root2);
            }
            if (!flag) {
                flag = hasSubtree(root1.right, root2);
            }
        }
        return flag;
    }

    private boolean doseTree1HaveTree2(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }

        return doseTree1HaveTree2(root1.left, root2.left) && doseTree1HaveTree2(root1.right, root2.right);
    }

}
