package leetcode.tree.subtree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootStr = preOrderTraversal(root);
        String subRootStr = preOrderTraversal(subRoot);
        System.out.println(rootStr + " == " + subRootStr);
        return rootStr.contains(subRootStr);
    }

    private String preOrderTraversal(TreeNode node) {
        if (node == null) {
            return "null";
        }
        /* root = [12], subtree = [2] 같지 않음.
        root = "12nullnull"
        subtree = "2nullnull"
        그러나 문자열 포함 체크하면 포함으로 나옴.
         */
        return "^" + node.val + preOrderTraversal(node.left) + preOrderTraversal(node.right);
    }

    protected static class TreeNode {
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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(2)), new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        Solution solution = new Solution();
        boolean expected = true;
        System.out.println(solution.isSubtree(root, subRoot) == expected ? "success" : "false");
    }
}