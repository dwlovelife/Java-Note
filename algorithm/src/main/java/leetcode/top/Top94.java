package leetcode.top;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 */
public class Top94 {


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        middleErgodic(root, result);
        return result;
    }

    public void middleErgodic(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        middleErgodic(root.left, list);
        list.add(root.val);
        middleErgodic(root.right, list);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
