package binaryTree;

public class LowestCAofBST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        TreeNode lower = p.value < q.value ? p : q;
        TreeNode upper = q.value > p.value ? q : p;


        if(lower.value <= root.value && upper.value >= root.value) return root;

        if(upper.value < root.value) return lowestCommonAncestor(root.left, lower, upper);
        return lowestCommonAncestor(root.right, lower, upper);
    }

}
