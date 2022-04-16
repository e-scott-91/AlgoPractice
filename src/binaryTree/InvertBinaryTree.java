package binaryTree;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        invert(root);

        return root;

    }

    // like pre order traversal
    public void invert(TreeNode node) {
        if (node == null) ;

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        invertTree(node.left);
        invertTree(node.right);

    }
}
