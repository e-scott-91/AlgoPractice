package dynamicProgramming;

import java.util.Arrays;

public class LengthSubSeq {

    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;

        for (int i = 1; i < nums.length; i++){
            int indexMax = 0;
            for (int j=0; j < i; j++){
                if(nums[j] < nums[i]){
                    if (dp[j] >= dp[i]){
                        dp[i] = dp[j] + 1;
                    }
                }
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
