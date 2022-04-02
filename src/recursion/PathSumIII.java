package recursion;

public class PathSumIII {

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        return recursePath(root, targetSum) + pathSum(root.left, targetSum) +
                pathSum(root.right, targetSum);
    }

    public int recursePath(TreeNode root, int targetSum) {
        int total = 0;
        if (root == null) return total;

        int currentVal = root.val;
        if (currentVal == targetSum) total++;
        total += recursePath(root.left, targetSum-currentVal);
        total += recursePath(root.right, targetSum-currentVal);
        return total;
    }
}


