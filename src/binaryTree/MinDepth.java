package binaryTree;

public class MinDepth {

    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        // First bit is because if there is a leaf node, we have to use it
        return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
    }
}
