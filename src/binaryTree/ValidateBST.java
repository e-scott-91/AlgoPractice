package binaryTree;

public class ValidateBST {

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    public Boolean validate(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        else if (min != null && root.value <= min || max != null && root.value >= max) return false;
        else {
            return validate(root.left, min, root.value) && validate(root.right, root.value, max);
        }
    }
}
