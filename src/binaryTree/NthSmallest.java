package binaryTree;

public class NthSmallest {

    int result=0;
    int k;
    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        inorder(root);
        return result;
    }
    public void inorder(TreeNode root){
        if(root == null)
            return;

        inorder(root.left);
        k--;
        if(k==0){
            result=root.value;
        }
        inorder(root.right);
    }
}
