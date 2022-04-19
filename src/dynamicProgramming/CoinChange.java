package dynamicProgramming;

import java.util.Arrays;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];

        Arrays.fill(dp, amount+1);
        dp[0]=0;

        for (int i=1; i<= amount; i++){
            for (int c: coins) {
                if (c <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - c]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public int coinChange2(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];
        for (int i=0; i <= coins.length; i++){
            dp[i][0] = 1;
        }
        for (int i=0; i <= amount; i++){
            dp[0][i] = 0;
        }

        for (int i = 1; i <= coins.length; i++){
            for (int j= 1; j<= amount; j++){
                if (coins[i-1] <= j){
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                }
            }
        }
        return dp[coins.length][amount];
    }


}
