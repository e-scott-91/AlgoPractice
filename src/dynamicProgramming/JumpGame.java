package dynamicProgramming;

public class JumpGame {

    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];

        dp[0] = true;

        for (int i = 0; i< nums.length; i++) {
            for (int j = 1; j <= nums[i]; j++) {
                if ((i+j) < dp.length && dp[i] && dp[i+j]){
                    dp[i+j] = true;
                }
            }
        }
        return dp[nums.length -1];
    }
}
