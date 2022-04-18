package binaryTree;

public class PathSum {

    // target must be root to leaf!!!
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;

        return dfs(root, targetSum);

    }

    public boolean dfs(TreeNode root, int updatedSum) {
        if(root == null){
            return false;
        }

        int sumNow = updatedSum - root.value;
        boolean isLeaf = (root.left == null && root.right == null);

        if (isLeaf) {
            if (sumNow == 0) {
                return true;
            } else {
                return false;
            }
        }

        return dfs(root.left, sumNow) || dfs(root.right, sumNow);
    }
}
