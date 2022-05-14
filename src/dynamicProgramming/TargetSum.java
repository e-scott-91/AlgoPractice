package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

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

    //Using cache and memoization
    public int findTargetSumWaysMemo(int[] nums, int target) {

        Map<String,Integer> cache = new HashMap<>();
        return rec(nums, 0, target, cache);
    }

    public int rec(int[] nums, int i, int v, Map<String,Integer> cache) {

        String entry = i + "," + v;

        if(cache.containsKey(entry)) return cache.get(entry);

        if(i == nums.length) return v == 0 ? 1 : 0;

        int sum = rec(nums, i+1, v + nums[i], cache) +
                rec(nums, i+1, v - nums[i], cache);

        cache.put(entry, sum);

        return sum;

    }
}
