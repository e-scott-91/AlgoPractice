package binaryTree;

public class BSTFromArray {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;

        return helper(nums, 0, nums.length - 1);

    }

    public TreeNode helper(int[] nums, int lp, int rp) {
        if (lp > rp) return null;

        int mid = lp + (rp - lp)/2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = helper(nums, lp, mid -1);
        root.right = helper(nums, mid + 1, rp);

        return root;
    }
}
