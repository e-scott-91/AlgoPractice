package arrays;

public class MaxProductSubArray {

    public int maxProduct(int[] nums) {
        int max_prod = nums[0];
        int curr_max = 1, curr_min = 1;

        for(int i = 0;i < nums.length; i++){
            if(nums[i] == 0){
                curr_max = 1; curr_min = 1;
            }

            int temp = curr_max * nums[i];
            curr_max = Math.max(nums[i], Math.max(curr_max * nums[i], curr_min*nums[i]));
            curr_min = Math.min(nums[i], Math.min(temp, curr_min * nums[i]));
            max_prod = Math.max(max_prod, curr_max);
        }
        return max_prod;
    }
}
