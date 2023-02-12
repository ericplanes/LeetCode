package Trees;

public class ValidateBTSTree {

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

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    public boolean validate(TreeNode root, Integer low, Integer high) {
        // Edge case
        if (root == null) {
            return true;
        }

        // Check if current node is correct
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }

        // Keep checking other branches
        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }
}
