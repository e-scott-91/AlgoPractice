package binaryTree;

public class IsSubTree {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;
        else if (theyMatch(root, subRoot)) {
            return true;
        }
        else {
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

    }

    public boolean theyMatch(TreeNode tree, TreeNode root){
        if (tree == null || root == null) {
            return tree == null && root == null;
        }
        else if (tree.value == root.value) {
            return theyMatch(tree.left, root.left) && theyMatch(tree.right, root.right);
        } else {
            return false;
        }
    }
}
