package Trees;

public class MaxDepthBT {

    public class TreeNode {
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

    public int maxDepth(TreeNode root) {
        return recursiveDepth(root, 1);
    }

    private int recursiveDepth(TreeNode root, int depth) {
        // Edge cases
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return depth;
        }

        // Variables
        int left = 0, right = 0;

        // Check and compute left
        if (root.left != null) {
            left = recursiveDepth(root.left, depth + 1);
        }

        // Check and compute right
        if (root.right != null) {
            right = recursiveDepth(root.right, depth + 1);
        }

        return Math.max(right, left);
    }
}
