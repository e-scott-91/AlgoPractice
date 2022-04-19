package binaryTree;

public class UniqueBST {

    public int numTrees(int n) {
        if(n <= 1)
            return 1;

        int [] dp = new int [n +1];

        dp[0] = 1;
        dp[1] = 1;

        // iterate to fill dp array incrementally for each number
        // up to target
        for (int i = 2; i <= n ; i++) {

            for (int j = 1; j <= i; j++) {

                dp[i] += dp[j-1] * dp[i - j];

            }
        }

        return dp[n];
    }
}
