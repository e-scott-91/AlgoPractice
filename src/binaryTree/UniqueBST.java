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
        // j is where the root is, j - 1 is to the left of root, i-j is to the
        // right of root
        for (int i = 2; i <= n ; i++) {

            for (int j = 1; j <= i; j++) {

                dp[i] += dp[j-1] * dp[i - j];

            }
        }

        return dp[n];
    }
}
