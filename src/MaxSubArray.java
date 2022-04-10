public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int max = currentSum;

        for (int i=1; i<nums.length; i++){
            currentSum = Math.max(currentSum+nums[i], nums[i]);
            max = Math.max(max, currentSum);
        }
        return max;
    }
}
