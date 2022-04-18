package binaryTree;

public class UniqueBST {

    public int numTrees(int n) {
        if(n <= 1)
            return 1;

        int [] dp = new int [n +1];

        dp[0] = 1;

        // iterate to fill dp array incrementally for each number
        // up to target
        for (int i = 1; i < n + 1; ++i) {

            for (int j = 0; j < i; ++j) {

                dp[i] += dp[j] * dp[i - j -1];

            }
        }

        return dp[n];
    }
}
