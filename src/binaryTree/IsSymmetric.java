package binaryTree;

public class IsSymmetric {

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;

        if ((root.left == null && root.right != null) ||
                (root.left != null && root.right == null))
            return false;

        return isSame(root.left, root.right);
    }

    public boolean isSame(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        else if (p == null || q == null) {
            return false;
        } else if (p.value != q.value) {
            return false;
        } else {
            return isSame(p.left, q.right) && isSame(p.right, q.left);
        }
    }
}
