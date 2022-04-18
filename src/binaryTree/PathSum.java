package binaryTree;

public class PathSum {

    int target;
    // target must be root to leaf!!!
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        if (root == null) return false;

        return dfs(root, 0);

    }

    public boolean dfs(TreeNode root, int sumBefore) {
        if(root == null){
            return false;
        }

        int sumNow = sumBefore + root.value;
        boolean isLeaf = (root.left == null && root.right == null);

        if (isLeaf) {
            if (sumNow == target) {
                return true;
            } else {
                return false;
            }
        }

        return dfs(root.left, sumNow) || dfs(root.right, sumNow);
    }
}
