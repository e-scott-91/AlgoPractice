package binaryTree;

public class CloneBT {

    public TreeNode clone(TreeNode root){
        if (root == null) return null;

        TreeNode clonedNode = new TreeNode(root.value);

        clonedNode.left = clone(root.left);
        clonedNode.right = clone(root.right);

        return clonedNode;
    }
}
