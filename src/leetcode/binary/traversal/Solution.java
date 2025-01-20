package leetcode.binary.traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }
        List<List<Integer>> list = new ArrayList<>();
        pre(root, 0, list);
        return list;
    }

    private void pre(TreeNode root, int depth, List<List<Integer>> list) {
        if (root == null) {
            return;
        }

        if (list.size() == depth) {
            List<Integer> child = new ArrayList<>();
            child.add(root.val);
            list.add(child);
        } else {
            list.get(depth).add(root.val);
        }

        pre(root.left, depth + 1, list);
        pre(root.right, depth + 1, list);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, new TreeNode(5), null));
        List<List<Integer>> result = solution.levelOrder(root);
        System.out.println(result);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
