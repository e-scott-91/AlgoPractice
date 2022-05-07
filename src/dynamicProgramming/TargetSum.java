package dynamicProgramming;

public class TargetSum {

    public int findTargetSumWays(int[] nums, int target) {
        int elements = nums.length;
        int sum = 0;

        for(int i = 0; i < elements; i++) {
            sum += nums[i];
        }

        if (target > sum){
            return 0;
        }

        if (target == 0 && sum % 2 == 1) {
            return 0;
        }

        if ((target + sum) % 2 != 0) {
            return 0;
        }

        sum = (sum + target) / 2;

        if (sum < 0) {
            sum *= -1;
        }

        int dp[][] = new int[elements + 1][sum + 1];

        for (int i = 0; i <= elements; i++) {
            for (int j = 0; j <= sum; j++) {
                if(i == 0 && j > 0) {
                    dp[i][j] = 0;
                } else if (j == 0) {
                    dp[i][j] = 1;
                }
                if (i > 0 && nums[i-1] == 0) {
                    dp[i][j]=2*dp[i-1][j];
                } else if(i > 0 && nums[i-1]!= 0) {
                    dp[i][j]=dp[i-1][j];
                } else {
                    if(nums[i-1]>j)
                        dp[i][j]=dp[i-1][j];

                    else
                        dp[i][j]=dp[i-1][j]+dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[elements][sum];

    }
}
